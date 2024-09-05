public class Main {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();

        myEmployee.name = "Kevin";
        myEmployee.npk = "20240001";
        myEmployee.salary = 10000;
        myEmployee.address = "TB Simatupang";
        myEmployee.age = 50;

        myEmployee.sayHello();
    }
}