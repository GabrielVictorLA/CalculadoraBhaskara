import java.util.Scanner;

public class CalculadoraBhaskara {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite o valor A:");
                a = scan.nextDouble();
        System.out.println("Digite o valor de B:");
                b = scan.nextDouble();
        System.out.println("Digite o valor de C:");
                c = scan.nextDouble();

        double D = (b * b) - (4 * a * c);

        System.out.println("O valor de Delta é: " + D);
        System.out.println("O valor de x1 é : " + ((-(b) + Math.sqrt(D))/2 * a));
        System.out.println("O valor de x2 é: " + ((-(b) - Math.sqrt(D))/2 * a));

    }

}
