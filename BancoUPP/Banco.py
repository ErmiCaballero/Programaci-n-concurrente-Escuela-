import asyncio # Librería con método Semaphone
import random
import time
import os


# Métodos (file_r y file_w) que accesan a un archivo .txt considerados sección crítica

def file_r():
    if os.path.isfile("Cuenta.txt"): 
        with open("Cuenta.txt", "r") as f:
            return f.read().split(",")


def file_w(acount, password, newbalance):
    if os.path.isfile("Cuenta.txt"):
        with open("Cuenta.txt", "w") as f:
            d = f.write(f"{acount},{password},{newbalance}")



async def ingreso(semaphore, id):
    # Método con las operaciones Retirar, Depositar

    time.sleep(1)

    nombre = 'ermi'
    password = 1234
    d = file_r()

    if nombre == d[0] and password == int(d[1]):
        print()
        print(f"Bienvenido {nombre.upper()} {id}")
        time.sleep(2)
        print()
        print("Seleccione la operación que desea realizar: \nDeposito(1) \nRetiro(2)")
        op = random.randint(1, 2)
        print(f"> {op}")

        # Se adquiere el semáforo, lo que excluye al resto de procesos
        # que intenten  ingresar a la sección crítica

        
        if op == 1:
            await depositar(semaphore, nombre, password)

        else:
            await retirar(semaphore, nombre, password)
        
    else:
        print("Error de cuenta")



async def depositar(semaphore,myacount, psswd):
    time.sleep(1)
    print()
    print("En proceso")
    print()
    cantidad = random.randint(10, 100)
    await semaphore.acquire() #<-- Ingreso a sección crítica
    d = file_r()
    debito = int(d[2])
    nuevo_saldo = debito + cantidad
    time.sleep(1)
    file_w(myacount, psswd, nuevo_saldo)
    semaphore.release() #<-- Salida de sección crítica
    print()
    print(f"Deposito de {cantidad}")
    print()


async def retirar(semaphore, myacount, passwd):
    time.sleep(1)
    print()
    print("En proceso")
    print()
    cantidad = random.randint(10, 100)
    await semaphore.acquire() #<-- Ingreso a sección crítica
    d = file_r()
    debito = int(d[2])
    if cantidad > debito:
        time.sleep(2)
        print("Error: No cuenta con los fondos suficinetes")
        print(f"saldo actual {debito}, retiro {cantidad}")
    else:
        nuevo_saldo = debito - cantidad
        time.sleep(1)
        file_w(myacount, passwd, nuevo_saldo)
        semaphore.release() #<-- Salida de sección crítica si cantidad <= debito
    print(f"Retiro de {cantidad}")
    print()


async def main():
    os.system('cls')
    print("Banco UPP")
    print("")
    # Se inicializa un semáforo con valor 1 para limitar uso a un solo proceso
    mySemaphore = asyncio.Semaphore(value=1) 
    # wait recibe procesos para su ejecución de forma entrópica (en desorden por así decirlo)
    await asyncio.wait([ingreso(mySemaphore, 1), ingreso(mySemaphore, 2), ingreso(mySemaphore, 3), ingreso(mySemaphore, 4), ingreso(mySemaphore, 5)])


loop = asyncio.get_event_loop()
#Se corre main con propiedades asincronas hasta que termine o haya un error
loop.run_until_complete(main())
print()
print("Operaciones completada con exito!")
loop.close()
