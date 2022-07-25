import entities.Employee;
import entities.Rectangle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    }

    public static void main4(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Enter employee tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println(employee);

        System.out.println("Enter the percentage of increase salary: ");

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated salary: " + employee);

        sc.close();
    }
    public static void main3(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
        System.out.println("Diagonal: " + rectangle.Diagonal());

        sc.close();
    }
    public static void main2(String[] args) {

        // Olá mundo
        System.out.println("Hello World!!!");

        // Declaração de Variáveis
        int y = 32;
        double x = 10.21819;

        // Prints
        System.out.println(y);
        System.out.printf("%.2f%n", x);

        // Mudar Locale
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        // Concatenando
        System.out.println("O valor de X é " + x + " e o valor de Y é " + y);
        System.out.printf("O valor de X é %.2f e o de Y é %d%n", x, y);

        // Casting
        int a = 10;
        int b = 3;
        System.out.println(a/b);
        System.out.println((double) a/b);

        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        String palavra;
        palavra = sc.next();
        System.out.println("Você digitou: " + palavra);

        x = 10;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
