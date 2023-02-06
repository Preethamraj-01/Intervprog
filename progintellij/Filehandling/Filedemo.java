package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Filedemo {

    public static void main(String[] args) throws Exception{



   //create a new file
        //can use try catch block as well
//   File f = new File("demo.txt");
//
//   f.createNewFile();

   //to create folder

//        File folder1 = new File("C:\\Users\\My PC\\IdeaProjects\\Oops\\src\\folder\");
//      //  folder1.createNewFile();
//
//        File f2 = new File("folder\\demo2.txt");
//
//
//        folder1.mkdir();
//        f2.createNewFile();


/*

     //to write a file

        //FileWriter fw = new FileWriter("demo.txt");  or

        FileWriter fw = new FileWriter(f);

        fw.write("this is our 1st file\nhiiiiiiiiiii");

        //closing  a file is also imp
        fw.close();



        //to read a file



        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()){


            String line = sc.nextLine();

            System.out.println(line);
        }

        sc.close();

        */

        //deleting a file


        File f = new File("demo.txt");

        System.out.println(f.getAbsolutePath());

//        if(f.delete())
//            System.out.println("file deleted is "+f.getName());
//
//        else System.out.println("deleting a file is unsuccessful");
    }
}
