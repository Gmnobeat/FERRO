import java.util.Arrays;

public class Main3 {
    public void main(String[] args){
        int[][] mat;
        //mat = new int[5][3];
        mat = gerarMatrizAleatoria(5,3);
        System.out.println(Arrays.deepToString(mat));
        //criando uma matriz nao retangular
        mat = new int[5][];
        for(int i=0 ; i< mat.length; i++)
            mat[i] = new int[i+1];
        System.out.println(Arrays.deepToString(mat));
        imprimeMatriz(mat);

    }
    static void imprimeMatriz(int m[][]) {
        for(int i=0; i< m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] gerarMatrizAleatoria(int lin,int col){
        int[][] mat = new int[lin][col];
        for(int i=0; i < mat.length;i++)
            for(int j =0; j < mat[i].length; j++)
                mat[i][j] = (int)(Math.random()*100);
        return mat;
    }
}
