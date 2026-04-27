import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
import java.util.Date;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile arq = new RandomAccessFile("historico.txt", "rw");
            if (arq.length() > 0) {
                String linha, ultima = "";
                while (arq.getFilePointer() < arq.length()) {
                    linha = arq.readLine();
                    if (linha != null)
                        ultima = linha;
                }
                JOptionPane.showMessageDialog(null, "Mensagem anterior: " + ultima);
            }
            String novaMsg = JOptionPane.showInputDialog("Digite a mensagem:");
            Date data = new Date();
            arq.seek(arq.length());
            arq.writeBytes(data.toString() + " - " + novaMsg + "\n");
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
