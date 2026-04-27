import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        try {
            // Abre o arquivo para leitura ("r")
            // Usei o caminho que estava no seu exemplo
            RandomAccessFile arq = new RandomAccessFile("c:\\dev-cpp\\news.txt", "r");
            String palavra = JOptionPane.showInputDialog("Digite a palavra para busca:");
            System.out.println("Tamanho do arq: " + (arq.length() / 1024) + "Kbytes");
            String linha;
            while (arq.getFilePointer() < arq.length()) {
                linha = arq.readLine();
                if (linha != null && linha.contains(palavra)) {
                    System.out.println(linha.toUpperCase());
                }
            }
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir arq: " + e.getMessage());
        }
    }
}
