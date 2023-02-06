package Dsa;

public class Stringbuilderclass {
    public static void main(String[] args) {

        StringBuilder s =new StringBuilder();//class similar to string

        for (int i=0;i<26;i++)
            s.append((char)('a'+i));//Appended char to old string created
        //here,TIME COMPLEXITY WILL BE REDUCED
        System.out.println(s);
        System.out.println(s.charAt(25));
        System.out.println(s.reverse());
        System.out.println(s.insert(1,100));

        System.out.println(s.indexOf("z"));


    }
}
