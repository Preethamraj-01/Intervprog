package Dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomSetCollectnFrame {
    public static void main(String[] args) {

        Set<Iplclasscollectnframework> custom=new LinkedHashSet<>();
        custom.add(new Iplclasscollectnframework(1,"csk"));
        custom.add(new Iplclasscollectnframework(2,"rcb"));
        custom.add(new Iplclasscollectnframework(3,"MI"));
        custom.add(new Iplclasscollectnframework(1,"DC"));//HashSet is not able to differentiate bcos both are of separate object
        //here hashset is generated based on object
        //generate hashcode based on position/name of team add equals() in Iplclasscollectnframework class....
        //That is the reason why 4th team(DC) is not printed
        System.out.println(custom);
        System.out.println(custom.size());//DC team not included since it has same position as CSK (1)
    }
}
