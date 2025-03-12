import javax.swing.*;

public class EX02 {
    public static void main(String[] args){
        String temp = JOptionPane.showInputDialog(null,"Digite a temperatura em Celsius:");
        Double temperatura = Double.parseDouble(temp);

        double fahr = temperatura * 1.8 + 32;

        JOptionPane.showMessageDialog(null, "A temperatura de " + temperatura + "C° Equivale a " + fahr + "Fahrenheit");
    }
}
