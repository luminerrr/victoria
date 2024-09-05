public class Calculator {
    Integer a;
    Integer b;

    public Calculator(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    Integer add() {
        return a + b;
    }

    Integer subtract() {
        return a - b;
    }

    Integer multiply() {
        return a * b;
    }

    Integer divide() {
        if(b == 0) {
            System.out.println("cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
