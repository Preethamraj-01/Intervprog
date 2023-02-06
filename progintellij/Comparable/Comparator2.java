package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {

    public static void main(String[] args) {





            List<Student> l = new ArrayList<>();


            l.add(new Student(100,"pre",01));
            l.add(new Student(20,"araak",02));
            l.add(new Student(90,"raju",03));


            //Anonymous class
            //Comparator is an interface having compare as an abstract method


            Comparator<Student> comp2 = new Comparator<Student>(){


                //based on name
                public int compare(Student s1,Student s2){

                    //compareTo can only be used for strings

                  return s1.name.compareTo(s2.name);


                }

                //return s1.marks> s2.marks?1:-1;



            };


            Collections.sort(l,comp2);

            //use toString if you wanna print its string representation

            System.out.println(l);


        }
    }


