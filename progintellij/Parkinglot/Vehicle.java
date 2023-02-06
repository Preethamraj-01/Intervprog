package Parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {


       List<ParkingSpot> l = new ArrayList<>() ;

       private String vehicleType;

       public void park(ParkingSpot spot){

           l.add(spot);

       }

       public void unpark(ParkingSpot spot){
           l.remove(spot);
       }


       public void notifyspot(){

           for(ParkingSpot spot:l){
               spot.update();
           }

       }


       public void upload(String vehicleType){

           this.vehicleType=vehicleType;
           notifyspot();
       }

    }

