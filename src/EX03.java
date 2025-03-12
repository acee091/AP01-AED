import javax.swing.*;

public class EX03 {
    public static void main(String[] args){
        String cPeso = JOptionPane.showInputDialog("Digite o seu peso: ");
        Double peso = Double.parseDouble(cPeso);

        String cAltura = JOptionPane.showInputDialog("Digite a sua altura: ");
        Double altura = Double.parseDouble(cAltura);

        double IMC = peso / (altura * altura);

       System.out.println("O seu IMC é de " + IMC);
    }
}
