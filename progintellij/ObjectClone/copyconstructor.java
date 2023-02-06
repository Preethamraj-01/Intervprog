package ObjectClone;

public class copyconstructor {


    int i;
    int j;

    public static void main(String[] args) {

        copyconstructor obj1 = new copyconstructor();

        obj1.i=2;
        obj1.j=5;

        System.out.println(obj1.i+"  "+obj1.j);//2 5


        //shallow copy(creating a reference)

        copyconstructor obj2=obj1;



        System.out.println(obj2.i+"  "+obj2.j);//2 5

        obj2.i=100;

        System.out.println(obj2.i+" "+obj1.i);




    }

}
