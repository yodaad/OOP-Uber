/* Class implementation */

class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("AMQ123", new Account("Andrés Gómez", "AND123"), "Chevrolet", "Sonic");
        uberX.passenger = 4;
        
        uberX.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Juan Díaz", "XYZ345"));
        car2.passenger = 3;

        car2.printDataCar();*/
    }
}