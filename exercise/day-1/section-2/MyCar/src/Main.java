public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive();

        Motor myMotor = new Motor("Honda", 2020);
        System.out.println(myMotor.model);
        System.out.println(myMotor.year);

        Sepeda mySepeda = new Sepeda();
        System.out.println(mySepeda.model);
        System.out.println(mySepeda.year);

        Sepeda mySepeda2 = new Sepeda();
        mySepeda2.model = "Toyota";
        mySepeda2.year = 2005;
        System.out.println(mySepeda2.model);
        System.out.println(mySepeda2.year);
    }
}

