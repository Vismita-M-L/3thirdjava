package CustomersEmailValidation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Customer {
    private int custid;
    private String name;
    private String email;
    private String password;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
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

    public void display() {
        System.out.println("Customer ID: " + custid);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();
        

        System.out.print("Enter Customer ID: ");
        int custid = scanner.nextInt();
        customer.setCustid(custid);

        System.out.print("Enter Name: ");
        scanner.nextLine(); // Consume the newline character
        String name = scanner.nextLine();
        customer.setName(name);

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        customer.setEmail(email);

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        customer.setPassword(password);

        System.out.println("\nCustomer Details:");
        customer.display();

        scanner.close();
    }
}
 