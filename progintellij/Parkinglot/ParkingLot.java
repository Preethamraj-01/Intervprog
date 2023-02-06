package Parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();


        ParkingSpot spot1 = new ParkingSpot("twov");

        ParkingSpot spot2 = new ParkingSpot("threev");
        ParkingSpot spot3 = new ParkingSpot("twov");


        v1.park(spot1);
        v2.park(spot2);
        v3.park(spot3);


        spot1.parked(v1);
        spot2.parked(v2);
        spot3.parked(v3);

        v1.upload("parked v1");
        v2.upload("parked v2");
        v3.upload("parked v3");

    }




}
