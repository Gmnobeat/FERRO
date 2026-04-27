import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scanf.nextLine();

        String[] palavras = texto.split("[ ,.;]+");

        System.out.println("Quantidade de palavras: " + palavras.length);
    }
}