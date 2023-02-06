package Interview;

public class nagesh {

    public static void main(String[] args) {

       int n=5;
        int f=1;

        for(int i=2;i<=n;i++)
            f = f*i;



        int c=0;
        while(f%10==0){

            c++;
            f=f/10;

        }


    }



}
