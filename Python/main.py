from car import Car

if __name__ == "__main__":
    print("Hello World")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andrés Herrera"
    print(vars(car))
    
    car2 = Car()
    car2.license = "DMC256"
    car2.driver = "Marta Díaz"
    print(vars(car2))
    