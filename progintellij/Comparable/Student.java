package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//if class is not able to implement Comparable interface then make use of comparator interface
public class Student implements Comparable<Student>{


    int marks;
    String name;
    int rollno;

    public Student(int marks,String name,int rollno){

        this.marks=marks;
        this.name=name;
        this.rollno=rollno;

    }

    @Override
    public String toString() {
        return  "marks=" + marks + ", name='" + name + '\'' + ", rollno=" + rollno ;
    }


    //we can compare only using 1 parameter
    @Override
    public int compareTo(Student o) {


        if(this.marks>o.marks)
            return -1;

        else return 1;

    }




    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();


        l.add(new Student(100,"pre",01));
        l.add(new Student(20,"rak",02));
        l.add(new Student(90,"raju",03));

        Collections.sort(l);

        System.out.println(l);
    }
}
