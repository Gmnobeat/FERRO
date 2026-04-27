import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        int idade;
        double peso;
        idade = LerInt("Idade", "Digite sua idade");
        peso = LerDouble("Peso", "Digite seu peso");
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public static int LerInt(String titulo, String msg) {

        try {
            String valor = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.QUESTION_MESSAGE);
            return Integer.parseInt(valor);
        } catch (Exception e) {
            return 0;
        }
    }

    public static double LerDouble(String titulo, String msg) {

        try {
            String valor = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.QUESTION_MESSAGE);
            return Double.parseDouble(valor);
        } catch (Exception e) {
            return 0;
        }
    }
}