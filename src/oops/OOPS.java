package oops;

class Car{
    String carName;
    String type;
    int tyres;

    //Prameterised Constructor
    Car(String carName, String type, int tyres){
        System.out.println("This is inside Parameterised constructor");
        this.carName = carName;
        this.type = type;
        this.tyres = tyres;
    }
    //Copy Constructor
    Car(Car c2){
        this.carName = c2.carName;
        this.type = c2.type;
        this.tyres = c2.tyres;
    }
    void printInfo(){
        System.out.println(this.carName);
        System.out.println(this.type);
        System.out.println(this.tyres);
    }

    Car(){
        System.out.println("This is inside default Constructor");
    }


}



public class OOPS {
    public static void main(String[] args) {
//        Car c1 = new Car();

//        System.out.println(c1.carName = "Mercedes");
//        System.out.println(c1.type = "Electric");

//        Car c2 = new Car("Mercedes","Electric",4);
//        c2.printInfo();


        //Copy Constructor
        Car c1 = new Car();
        c1.carName = "Mercedes";
        c1.type = "Electric";
        c1.tyres = 6;

        Car c2 = new Car(c1);    //Copied properties of C1 to C2.
        c2.printInfo();



    }
}
