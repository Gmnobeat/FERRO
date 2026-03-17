import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String s = sc.nextLine();

        System.out.println(classificar(s));

        sc.close();
    }

    public static String classificar(String s) {

        if(s.matches("[A-Z][a-z]+\\s[A-Z][a-z]+.*"))
            return "[NOME]";

        if(s.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            return "[EMAIL]";

        if(s.matches("[a-zA-Z_$][a-zA-Z0-9_$]*"))
            return "[VARIAVEL]";

        if(s.matches("[A-Z]{3}-[0-9][A-Z0-9][0-9]{2}"))
            return "[PLACA DE CARRO]";

        if(s.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"))
            return "[CPF]";

        return "[DESCONHECIDO]";
    }
}