import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int opcao, n;
        double n1, n2, a, b, c, p1, p2, media2, media3, mediaP, soma = 0, nota, mediaN;
        System.out.println("=== MENU DE CÁLCULO DE MÉDIAS ===");
        System.out.println("1 - Média de duas notas");
        System.out.println("2 - Média de três notas");
        System.out.println("3 - Média ponderada de duas notas");
        System.out.println("4 - Média aritmética de N notas");
        System.out.print("Escolha uma opção: ");
        opcao = scanf.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite a primeira nota: ");
                n1 = scanf.nextDouble();
                System.out.print("Digite a segunda nota: ");
                n2 = scanf.nextDouble();

                media2 = (n1 + n2) / 2;
                System.out.println("Média = " + media2);
                break;
            case 2:
                System.out.print("Digite a primeira nota: ");
                a = scanf.nextDouble();
                System.out.print("Digite a segunda nota: ");
                b = scanf.nextDouble();
                System.out.print("Digite a terceira nota: ");
                c = scanf.nextDouble();
                media3 = (a + b + c) / 3;
                System.out.println("Média = " + media3);
                break;
            case 3:
                System.out.print("Digite a primeira nota: ");
                p1 = scanf.nextDouble();
                System.out.print("Digite a segunda nota: ");
                p2 = scanf.nextDouble();

                mediaP = (p1 * 1 + p2 * 2) / 3;
                System.out.println("Média ponderada = " + mediaP);
                break;
            case 4:
                System.out.print("Quantas notas deseja informar? ");
                n = scanf.nextInt();
                soma = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.print("Digite a nota " + i + ": ");
                    nota = scanf.nextDouble();
                    soma += nota;
                }
                mediaN = soma / n;
                System.out.println("Média = " + mediaN);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}