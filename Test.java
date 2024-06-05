public class Test {
    public static void main(String[] args) {
        Address address1 = new Address("New York", "NY", "USA");
        Employee emp1 = new Employee(101, "John Doe", address1);

        emp1.displayEmployee();
    }
}
