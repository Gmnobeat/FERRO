import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine().toLowerCase();//le a string e transforma em minusculo

        String vogais = "aeiou";

        System.out.print("Vogais ausentes: ");

        for (int i = 0; i < vogais.length(); i++) {//enquanto nao for o tamanho das vogais nao acaba

            char v = vogais.charAt(i);// pega somente um caracter de frase

            if (!frase.contains("" + v)) {// compara se o cararcter (transformado em string) existe na string frase
                System.out.print(v + " ");
            }
        }
    }
}