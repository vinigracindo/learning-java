import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
