package Dsa;

import java.util.Objects;

public class Iplclasscollectnframework {

    int teamposition;
    String teamName;

    Iplclasscollectnframework(int tp,String tn){

        teamposition=tp;
        teamName=tn;

    }

    @Override
    public String toString() {//Returns:a string representation of the object.
        return +teamposition+" -> "+teamName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iplclasscollectnframework that = (Iplclasscollectnframework) o;
        return teamposition == that.teamposition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamposition);//Hash code will be generated based on team position
    }
}
