import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;
    
    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
   
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("You need to assign 6 passengers!");
        }
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("TypeCar " + typeCarAccepted + " Seats Material: " + seatsMaterial);
    }
}
