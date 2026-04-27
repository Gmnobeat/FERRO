import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main {
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
            byte car;
            while(arq.getFilePointer()<arq.length())// getfilepointer é a posiçao do ponteiro
            {
                car = arq.readByte();
                System.out.print((char)car);
            }
            //esse while é ruim pois passa muitas vezes e le caracter por caracter
            char carac = arq.readChar();
            System.out.println(carac);
            carac = (char)arq.readByte();
            System.out.println(carac);

            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro ao abrir arq: " + e.getMessage());
        }


    }
}
