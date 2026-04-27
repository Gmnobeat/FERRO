import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String frase = scanf.nextLine();

        System.out.println("Digite o número de colunas:");
        int colunas = scanf.nextInt();

        System.out.println(justificar(frase, colunas));
    }

    public static String justificar(String frase, int colunas) {

        String[] palavras = frase.split(" ");
        String resultado = "";
        String linha = "";

        for(String p : palavras){

            if((linha + p).length() <= colunas) {
                linha += p + " ";
            }
            else {
                resultado += linha.trim() + "\n";
                linha = p + " ";
            }
        }

        resultado += linha;

        return resultado;
    }
}