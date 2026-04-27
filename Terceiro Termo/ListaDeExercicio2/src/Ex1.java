import java.util.Scanner;

public class Ex1 {
    static void main(String[] args){
        Scanner leitor=new Scanner(System.in);
        double resp,milhas,metros,pes;
        System.out.println("Digite a distancia em Km");
        resp = leitor.nextDouble();
        milhas = resp* 0.6214;
        metros = resp*1000;
        pes = resp*3280.84;
        System.out.println("em milhas: "+milhas);
        System.out.println("em metros: "+metros);
        System.out.println("em pes: "+pes);
    }
}