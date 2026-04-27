import java.util.Scanner;

public class Ex4{
    static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        long num;
        int maior=0,digito;
        System.out.print("Digite um número inteiro: ");
        num = leitor.nextLong();
        while (num > 0) {
            digito = (int)(num % 10);
            if (digito > maior) {
                maior = digito;
            }
            num = num / 10;
        }
        System.out.println("O maior dígito é: " + maior);

    }
}