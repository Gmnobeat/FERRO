import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorEmprestimo, juros, taxa, parcela, saldoDevedor, totalJuros, jurosMes, amortizacao;
        int parcelas, i;

        System.out.print("Digite o valor do emprestimo: ");
        valorEmprestimo = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        juros = sc.nextDouble();

        System.out.print("Digite o numero de parcelas: ");
        parcelas = sc.nextInt();

        taxa = juros / 100;

        parcela = valorEmprestimo * (taxa * Math.pow(1 + taxa, parcelas)) /
                (Math.pow(1 + taxa, parcelas) - 1);

        saldoDevedor = valorEmprestimo;
        totalJuros = 0;

        System.out.println("\nAmortizacao no Sistema Frances de Amortizacao (Tabela Price)");
        System.out.printf("\nMontante Financiado : R$ %.2f\n", valorEmprestimo);
        System.out.printf("Juros Financiamento : %.2f %%\n", juros);
        System.out.printf("Numero de Parcelas : %d\n", parcelas);
        System.out.println("Parcela Vlr Parcela Amortizacao Juros Saldo Devedor");

        for (i = 1; i <= parcelas; i++) {

            jurosMes = saldoDevedor * taxa;
            amortizacao = parcela - jurosMes;
            saldoDevedor = saldoDevedor - amortizacao;
            totalJuros += jurosMes;

            if (saldoDevedor < 0) {
                saldoDevedor = 0;
            }

            System.out.printf("%3d %12.2f %12.2f %10.2f %14.2f\n",
                    i, parcela, amortizacao, jurosMes, saldoDevedor);
        }

        System.out.printf("Total de juros pago: R$ %.2f\n", totalJuros);

        sc.close();
    }
}