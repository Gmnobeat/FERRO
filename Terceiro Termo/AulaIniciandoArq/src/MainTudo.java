import java.io.IOException;
import java.io.RandomAccessFile;

public class MainTudo {
    public static void main (String[] args){
        // duas formas de mexer com arquivo, ramdomica é utilizado em c
        // e o acesso sequencial é pelo java
        //RandomAccessFile arquivo;
        //arquivo = new RandomAccessFile("dados.txt", "r");

        //arquivo.close();

        // isso tem que ser feito com try e catch para abrir o arquivo
        try {
            RandomAccessFile arq = new RandomAccessFile("c:\\dev-cpp\\news.txt","r");
            System.out.println("Tamanho do arq"+ (arq.length()/1024)+ "Kbytes");
            String tudo;
//            byte[] bytes = new byte[(int)arq.length()];
//            arq.readFully(bytes);
//            tudo = new String(bytes);
//            System.out.println(tudo);
            tudo = arq.readUTF();
            System.out.printf(tudo);

            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro ao abrir arq: " + e.getMessage());
        }


    }
}
