import java.util.Scanner;

public class MainConsole {
    static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int peso;
        double altura, imc;
        try {
            System.out.println("Informe seu peso em kg: ");
            peso = leitor.nextInt();
        }catch (Exception e){
            leitor.next();// limpa o buffer do teclado
            peso=0;
        }
        try {
            System.out.println("Informe sua altura em metros: ");
            altura = leitor.nextDouble();
        }catch (Exception e){
            leitor.next();
            altura=1;
        }
        imc=peso/Math.pow(altura,2);
        System.out.println("Seu IMC é "+imc);
    }
}
