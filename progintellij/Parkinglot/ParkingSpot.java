package Parkinglot;
public class ParkingSpot{

    String vehtype;

    ParkingSpot(String vehtype){
        this.vehtype=vehtype;
    }

    private Vehicle vehicle=new Vehicle();

    public void update(){

        System.out.println("HEY"+ vehtype +"vehicle parked");
    }

    public void parked(Vehicle veh){
        vehicle=veh;
    }


}