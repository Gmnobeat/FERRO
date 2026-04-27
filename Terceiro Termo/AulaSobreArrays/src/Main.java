import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //Arrays sao vetores e matrizes, tem tamanho fixo
        //exemplo de declaração
        //int impares[] ou int[] impares;
        //float tabelas[][] ou float[][] tabelas;
        //inicialização/instalação
        // impares = new int [10];
        // tabela = new foat[10][20];
        int[] vetor1;
        vetor1 = new int[10];
        // for tradicional
        //for(int i=0;i< vetor1.length;i++)
        //  System.out.print(vetor1[i]+" ");
        //foreach : consula todos os elementos
        //não consegue mudar o valor do array
        for(int e: vetor1)
            System.out.print(e+" ");
        System.out.println(vetor1);
        System.out.println(Arrays.toString(vetor1));

    }
}
