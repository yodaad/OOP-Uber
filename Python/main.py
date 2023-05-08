from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World")

    car = Car("AWS123", Account("Andres Gomez", "787878001"))
    print(vars(car))
    print(vars(car.driver))
