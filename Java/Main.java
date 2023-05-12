/* Class implementation */

class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("AMQ123", new Account("Andrés Gómez", "AND1233"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("PZE133", new Account("Laura Gil", "WETR4532"), null, null);
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Juan Díaz", "XYZ345"));
        car2.passenger = 3;

        car2.printDataCar();*/
    }
}