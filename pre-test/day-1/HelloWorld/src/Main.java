public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String myName;
        myName = "Kevin";
        Integer myAge;
        myAge = 25;
        Float mySalary;
        mySalary = 50000.00f;
        double myFavNumber;
        myFavNumber = 5.00;
        Long myTall;
        myTall = 2L;
        char myGender;
        myGender = 'm';
        Boolean myHappy;
        myHappy = true;

        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(mySalary);
        System.out.println(myTall);
        System.out.println(myGender);
        System.out.println(myHappy);
        System.out.println(myFavNumber);

//        Circle
        Circular(10, 15);

        boolean checkOdd = isOddEven(20);
        System.out.println(checkOdd);
        Integer[] myNums = {10, 75, 76, 47};
        for (Integer myNum : myNums) {
            System.out.println(isOddEven(myNum));
        }
    }

    public static void Circular(Integer radius1, Integer radius2) {
        System.out.println("Circular Function");
        final float pi = 3.14f;
        int radius = radius1;
        float luas = pi * radius * radius;
        radius = radius2;
        float luas2 = pi * radius * radius;
        System.out.println("Luas pertama " + luas);
        System.out.println("Luas kedua " + luas2);
    }

    public static boolean isOddEven(int number) {
        System.out.println("If number " + number + " more than 50 and is even " + (number > 50 && number % 2 == 0));
        System.out.println("If number " + number + " more than 50 and is odd " + (number > 50 && number % 2 != 0));
        System.out.println("If number " + number + " less than 50 and is even " + (number < 50 && number % 2 == 0));
        System.out.println("If number " + number + " less than 50 and is odd " + (number < 50 && number % 2 != 0));
        return number % 2 != 0;
    }
}