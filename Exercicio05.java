import javax.swing.JOptionPane;

public class Exercicio05{

    public static void main (String[]args){

        double pesos[] = new double[5], soma = 0, media = 0;

        pesos [0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 1"));
        pesos [1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 2"));
        pesos [2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 3"));
        pesos [3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 4"));

        soma = pesos[0]+pesos[1]+pesos[2]+pesos[3];

        media = soma/pesos.length;

        JOptionPane.showMessageDialog(null,
        "A soma total dos pesos é: "+soma+
        "\nA média dos pesos é: "+media
        );
    }
}