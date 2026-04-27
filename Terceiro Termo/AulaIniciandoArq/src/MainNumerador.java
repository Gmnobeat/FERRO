import java.io.IOException;
import java.io.RandomAccessFile;

public class MainNumerador {
    static void main (String[] args){
        try
        {
            RandomAccessFile arqOrigem, arqDestino;
            arqOrigem = new RandomAccessFile("c:\\dev-cpp\\news.txt","r");
            arqDestino = new RandomAccessFile("numerado.txt","rw");
            arqDestino.setLength(0);
            arqDestino.seek(arqDestino.length());//avanca depois da quantidade de bytes definida
            arqDestino.skipBytes(9);//avanca a partir da pos atual
            String linha;
            int i=1;
            while(arqOrigem.getFilePointer()<arqOrigem.length())
            {
                linha = arqOrigem.readLine();
                arqDestino.writeBytes(i+"-" +linha +"\n");
                i++;
            }
            arqOrigem.close();
            arqDestino.close();
        }catch (IOException e)
        {
            System.out.printf("ola");
        }

    }
}
