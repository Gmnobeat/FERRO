import java.util.*;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanf.nextLine();

        System.out.println("Embaralhada: " + embaralhar(palavra));
    }

    public static String embaralhar(String palavra) {

        List <Character> letras = new ArrayList<>();

        for(char c : palavra.toCharArray()) {
            letras.add(c);
        }

        Collections.shuffle(letras);

        String resultado = "";

        for(char c : letras) {
            resultado += c;
        }

        return resultado;
    }
}