import javax.swing.*;

public class EX06 {
    public static void main(String[] args){
        String cA = JOptionPane.showInputDialog(null, "a =");
        Double a = Double.parseDouble(cA);

        String cB = JOptionPane.showInputDialog(null, "b =");
        Double b = Double.parseDouble(cB);

        String cC = JOptionPane.showInputDialog(null, "c =");
        Double c = Double.parseDouble(cC);

        double delta = (b*b) - (4 * a * c);

        JOptionPane.showMessageDialog(null, "a = " + a + "\n b = " + b + "\nc = " + c +
                "\nDelta = " + delta);
    }
}
