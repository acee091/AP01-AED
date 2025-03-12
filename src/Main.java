import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        String temp = JOptionPane.showInputDialog(null,"Digite a temperatura em Fahrenheit:");
        Double temperatura = Double.parseDouble(temp);
        //Scanner sc = new Scanner(System.in);

        double celsius = (temperatura - 32) * 5 / 9;

        JOptionPane.showMessageDialog(null,"A temperatura de " + temperatura + " F° " + "Equivale a " + celsius + " C°" );
    }
}