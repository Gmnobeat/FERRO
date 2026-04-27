import java.util.Arrays;

public class Main2 {
    static void main (String[] args){
        double[] valores, vetAux;
        valores = geraVetor(5);
        System.out.println(Arrays.toString(valores));
        preencheVetor(valores);
        System.out.println(Arrays.toString(valores));
        //ele aumenta porem perde todos os valores, mas da para contornar isso jogando esse
        // vetor para outro e devolver para esse que foi redimencionado, como foi feito em baixo
        vetAux = valores; // nao é uma copia, sao 2 variaveis com os mesmos valores
        valores = new double[10];
        for(int i=0;i<vetAux.length;i++)
            valores[i] = vetAux[i];
        System.out.println(Arrays.toString(valores));
        valores = geraPreencheVetor(8, 100,125);
        System.out.println(Arrays.toString(valores));
    }
    static double[] geraVetor(int tam){
        double[] vet = new double[tam];
        return vet;
    }
    static void preencheVetor(double[] vet){
        for(int i = 0 ; i< vet.length;i++)
            vet[i] = Math.random()*100;
    }
    static double[] geraPreencheVetor(int tam,int min, int max){
        double[] vet = new double[tam];
        for(int i=0;i<vet.length;i++)
            vet[i] = Math.random()*(max-min) + min;
        return vet;
    }
}
