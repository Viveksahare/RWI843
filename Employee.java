public class Employee {
    int id;
    String name;
    Address address; // Aggregation

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void displayEmployee() {
        System.out.println(id + " " + name);
        address.displayAddress();
    }
}
