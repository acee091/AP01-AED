import javax.swing.*;

public class EX05 {
    public static void main(String[] args){
        String cBase = JOptionPane.showInputDialog(null, "Digite a base do triângulo:");
        Double base = Double.parseDouble(cBase);

        String cAltura = JOptionPane.showInputDialog(null, "Digite a altura do triângulo:");
        Double altura = Double.parseDouble(cAltura);

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área de um triângulo com \n Base de " + base
                + "\n Altura de: " + altura + "\n É igual a " + area + "m²");
    }
}
