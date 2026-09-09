
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        int num1, num2, num3, num4, soma;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero 1");
        num1 = leitor.nextInt();
        System.out.println("Digite o numero 2");
        num2 = leitor.nextInt();
        System.out.println("Digite o numero 3");
        num3 = leitor.nextInt();
        System.out.println("Digite o numero 4");
        num4 = leitor.nextInt();

        soma = num1 + num2 + num3 + num4;

        System.out.println("A soma é: " + soma);
    }
}
