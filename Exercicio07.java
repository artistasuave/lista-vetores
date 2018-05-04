import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main (String[]args){

        double altura[] = new double [4], menorAltura = Double.MAX_VALUE;

        altura [0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do primeiro animal"));
        altura [1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do segundo animal"));
        altura [2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do terceiro animal"));
        altura [3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do quarto animal"));

        if (altura[0]<menorAltura){
            menorAltura = altura[0];
        }
        if (altura[1]<menorAltura){
            menorAltura = altura[1];
        }
        if (altura[2]<menorAltura){
            menorAltura = altura[2];
        }
        if (altura[3]<menorAltura){
            menorAltura = altura[3];
        }

        JOptionPane.showMessageDialog(null, "A altura do animal com a menor altura é: "+menorAltura);
    }
}