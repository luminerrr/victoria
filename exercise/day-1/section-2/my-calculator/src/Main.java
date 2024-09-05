public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(2,1);

        System.out.println(myCalculator.add());
        System.out.println(myCalculator.subtract());
        System.out.println(myCalculator.multiply());
        System.out.println(myCalculator.divide());
    }
}