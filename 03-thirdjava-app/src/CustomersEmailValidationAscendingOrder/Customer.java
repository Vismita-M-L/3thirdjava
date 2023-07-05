package CustomersEmailValidationAscendingOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Customer {
    private int custId;
    private String name;
    private String email;
    private String password;

    public Customer(int custId, String name, String email, String password) {
        this.custId = custId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    	
            // Validate email format
            if (email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                this.email = email;
            } else {
                System.out.println("Invalid email format!");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static void displayCustomers(ArrayList<Customer> customers) {
        // Sort the customers by name in ascending order
        Collections.sort(customers, Comparator.comparing(Customer::getName));

        System.out.println("Customers sorted by name in ascending order:");
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Password: " + customer.getPassword());
            System.out.println();
        }
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Customer " + i + ":");

            System.out.print("Customer ID: ");
            int custId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            Customer customer = new Customer(custId, name, email, password);
            customers.add(customer);

            System.out.println();
        }

        Customer.displayCustomers(customers);

        scanner.close();
    }
}



