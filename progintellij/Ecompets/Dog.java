//riddhi dutta
package Ecompets;


public class Dog {


    private String name;
    private String gender;//cannot change
    private  String breed;//cannot change
    private  double price;


    //Single constructor
    public  Dog(DogBuilder db){

        this.name = db.getname();
        this.gender=db.getgender();
        this.price =db.getprice();
        this.breed=db.getbreed();

    }

    public  String getgender(){
        return gender;
    }
//
//    public  String getname(){
//        return name;
//    }
//
//    public  String getbreed(){
//        return breed;
//    }
//
//    public  double getprice(){
//        return price;
//    }
//
//
    private void setGender(String g){
        this.gender=g;
    }

//    private void setName(String n){
//        this.name=n;
//    }
//
//    private void setBreed(String b){
//        this.breed=b;
//    }
//
//    private void setPrice(double p){
//        this.price=p;
//    }

    public String toString(){


        String s="name : "+this.name+" ,";

        s+=(" breed :"+this.breed+" , ");
        s+=(" gender :"+this.gender+" , ");
        s+=(" price :"+this.price+" , ");

        return s;
    }




    //client side (user or another programmer)
   public static class DogBuilder{

        private String name;
        private String gender;//cannot change
        private  String breed;//cannot change
        private  double price;

        public  String getgender(){
            return gender;
        }

        public  String getname(){
            return name;
        }

        public  String getbreed(){
            return breed;
        }

        public  double getprice(){
            return price;
        }


        //client side methods can be exposed
        public DogBuilder setGender(String g){
            this.gender=g;
            return this;
        }

    public DogBuilder setName(String n){
            this.name=n;
            return this;
        }

    public DogBuilder setBreed(String b){
            this.breed=b;
            return this;
        }

    public DogBuilder setPrice(double p){
            this.price=p;
            return this;
        }


        public Dog build(){

            return new Dog(this);
        }



    }




}
