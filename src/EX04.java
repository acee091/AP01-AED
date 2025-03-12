import javax.swing.*;

public class EX04 {
    public static void main(String[] args){
        String cValor = JOptionPane.showInputDialog(null, "Digite um valor:");
        Double valor = Double.parseDouble(cValor);

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;

        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\n Ao quadrado: " +
                quadrado + "\n Ao cubo: " + cubo);

    }
}
