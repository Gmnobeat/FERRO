import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int dias =0,dia, mes, ano;
        System.out.println("\n Digite o dia\n");
        dia = scanf.nextInt();
        System.out.println("Digite o mes\n");
        mes = scanf.nextInt();
        System.out.println(" Digite o ano\n");
        ano = scanf.nextInt();
        if (mes > 1)
            dias += 31;
        if (mes > 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                dias += 29;
            } else {
                dias += 28;
            }
        }
        if (mes > 3) {
            dias = dias + 31;
        }
        if (mes > 4) {
            dias = dias + 30;
        }
        if (mes > 5) {
            dias = dias + 31;
        }
        if (mes > 6) {
            dias = dias + 30;
        }
        if (mes > 7) {
            dias = dias + 31;
        }
        if (mes > 8) {
            dias = dias + 31;
        }
        if (mes > 9) {
            dias = dias + 30;
        }
        if (mes > 10) {
            dias = dias + 31;
        }
        if (mes > 11) {
            dias = dias + 30;
        }
        dias += dia;
        System.out.println("\nDias que ocorreram entre primeiro de janeiro e a data informada :\n"+dias);
    }
}