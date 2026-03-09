import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double resp;
        int n2, n5, n10, n20, n50, n100;
        int c1, c5, c10, c25, c50;
        System.out.println("Digite o valor desejado:");
        resp = leitor.nextDouble();
        int centavos = (int) Math.round(resp * 100);
        n100 = centavos / 10000;
        centavos %= 10000;
        n50 = centavos / 5000;
        centavos %= 5000;
        n20 = centavos / 2000;
        centavos %= 2000;
        n10 = centavos / 1000;
        centavos %= 1000;
        n5 = centavos / 500;
        centavos %= 500;
        n2 = centavos / 200;
        centavos %= 200;
        int c1real = centavos / 100;
        centavos %= 100;
        c50 = centavos / 50;
        centavos %= 50;
        c25 = centavos / 25;
        centavos %= 25;
        c10 = centavos / 10;
        centavos %= 10;
        c5 = centavos / 5;
        centavos %= 5;
        c1 = centavos;
        if (n100 > 0)
            System.out.println("será necessária " + n100 + " nota(s) de 100 reais");
        if (n50 > 0)
            System.out.println("será necessária " + n50 + " nota(s) de 50 reais");
        if (n20 > 0)
            System.out.println("será necessária " + n20 + " nota(s) de 20 reais");
        if (n10 > 0)
            System.out.println("será necessária " + n10 + " nota(s) de 10 reais");
        if (n5 > 0)
            System.out.println("será necessária " + n5 + " nota(s) de 5 reais");
        if (n2 > 0)
            System.out.println("será necessária " + n2 + " nota(s) de 2 reais");
        if (c1real > 0)
            System.out.println("será necessária " + c1real + " moeda(s) de 1 real");
        if (c50 > 0)
            System.out.println("será necessária " + c50 + " moeda(s) de 50 centavos");
        if (c25 > 0)
            System.out.println("será necessária " + c25 + " moeda(s) de 25 centavos");
        if (c10 > 0)
            System.out.println("será necessária " + c10 + " moeda(s) de 10 centavos");
        if (c5 > 0)
            System.out.println("será necessária " + c5 + " moeda(s) de 5 centavos");
        if (c1 > 0)
            System.out.println("será necessária " + c1 + " moeda(s) de 1 centavo");

    }
}