package task02;

public class App {
    public static void main(String[] args) {
        Employees employeesOne = new Employees("Herr Putin");
        employeesOne.setPenQuantity(5);
        employeesOne.setPaperQuantity(2);
        employeesOne.setPencilQuantity(3);
        employeesOne.setRulerQuantity(0);

        Employees employeesTwo = new Employees("Frau Merkel");
        employeesTwo.setPenQuantity(1);
        employeesTwo.setPaperQuantity(1);
        employeesTwo.setPencilQuantity(1);
        employeesTwo.setRulerQuantity(2);

        System.out.println(employeesOne.getName() + " has a stationary for the sum of " + employeesOne.costOfStationery());
        System.out.println(employeesTwo.getName() + " has a stationary for the sum of " + employeesTwo.costOfStationery());
    }
}
