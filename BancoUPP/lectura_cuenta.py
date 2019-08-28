import asyncio
import random
import time
import os

def file_r():
    if os.path.isfile("Cuenta.txt"):
        with open("Cuenta.txt", "r") as f:
            return f.read().split(",")


def file_w(acount, password, newbalance):
    if os.path.isfile("Cuenta.txt"):
        with open("Cuenta.txt", "w") as f:
            d = f.write(f"{acount},{password},{newbalance}")


def saldo_r():
    if os.path.isfile("Cuenta.txt"):
        with open("Cuenta.txt", "r") as f:
            return f.read().split(",")


async def ingreso(semaphore):
    time.sleep(1)
    nombre = input('Ingresa nombre: ')
    password = int(input('Ingresa contraseña: '))
    nombre = 'ermi'
    password = 1234
    d = file_r()

    if nombre == d[0] and password == int(d[1]):
        print()
        print(f"Bienvenido {nombre.upper()}")
        time.sleep(2)
        print("Seleccione la operación que desea realizar: \nDeposito(1) \nRetiro(2) \nConsulta(3)")
        op = int(input("> "))
        await semaphore.acquire()
        if op == 1:
            await depositar(nombre, password)

        elif op == 2:
            retirar(nombre, password)

        else:
            consultar()
        semaphore.release()
    else:
        print("Error de cuenta")


async def depositar(myacount, psswd):
    time.sleep(2)
    print()
    print("En proceso")
    print()
    cantidad = random.randint(10, 100)
    d = file_r()
    debito = int(d[2])
    nuevo_saldo = debito + cantidad
    file_w(myacount, psswd, nuevo_saldo)
    time.sleep(2)
    print(f"Deposito de {cantidad} realizado a la cuenta de {myacount}")


def retirar(myacount, passwd):
    time.sleep(2)
    print()
    print("En proceso")
    print()
    cantidad = random.randint(10, 100)
    d = file_r()
    debito = int(d[2])
    if cantidad > debito:
        time.sleep(2)
        print("Error: No cuenta con los fondos suficinetes")
        print(f"saldo actual {debito}, retiro {cantidad}")
    else:
        nuevo_saldo = debito - cantidad
        file_w(myacount, passwd, nuevo_saldo)
        time.sleep(2)
    print(f"Deposito de {cantidad} realizado a la cuenta de {myacount}")


def consultar():
    while True:
        d = saldo_r()
        print("Banco UPP")
        print("")
        nombre = d[0]
        saldo = d[2]
        print(f"Bienvenido {nombre}")
        print(f"Su saldo actual es {saldo}")
        os.system('cls')


async def main():
    os.system('cls')
    print("Banco UPP")
    print("")
    mySemaphore = asyncio.Semaphore(value=2)
    await asyncio.wait([ingreso(mySemaphore)])


loop = asyncio.get_event_loop()
loop.run_until_complete(main())
print("Operación completada con exito!")

loop.close()


#def clear(): return os.system('cls')
