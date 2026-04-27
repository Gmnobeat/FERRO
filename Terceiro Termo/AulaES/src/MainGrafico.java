import javax.swing.*;
import java.util.Scanner;

public class MainGrafico {
    static void main(String[] args) {
        int peso;
        double altura, imc;
        String str, condicaoFisica;
        JOptionPane.showMessageDialog(null,"Aplicativo de cálculo do IMC");
        do {
            try {
                str = JOptionPane.showInputDialog(null, "Informe seu peso em kg: ");
                peso = Integer.parseInt(str);
            } catch (Exception e) {
                peso = 0;
            }
            try {
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura em metros: "));
            } catch (Exception e) {
                altura = 1;
            }
            imc = peso / Math.pow(altura, 2);
            JOptionPane.showMessageDialog(null, "Seu IMC é " + imc);
            if(imc>18.5){
                if(imc <24.9)
                    condicaoFisica="Peso normal";
                else if(imc <29.9)
                    condicaoFisica="Sobrepeso";
                else if(imc <39.9)
                    condicaoFisica="Obesidade";
                else
                    condicaoFisica="Obesidade Grave";
            }
            else
                condicaoFisica="Abaixo do peso";
        }
        while(JOptionPane.showConfirmDialog(null,"Sua condição Física é "+condicaoFisica+"\nDeseja novo cálculo?")==JOptionPane.YES_OPTION);
    }
}

