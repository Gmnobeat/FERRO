import java.io.IOException;
import java.io.RandomAccessFile;

public class MainLinhaLinha {
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
            String linha;
            while(arq.getFilePointer()<arq.length())// getfilepointer é a posiçao do ponteiro
            {
                linha = arq.readLine();
                if(linha.contains("project"))// pega se tem project na string e imprime
                    System.out.println(linha.toUpperCase());
            }
            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro ao abrir arq: " + e.getMessage());
        }


    }
}
