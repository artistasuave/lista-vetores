import javax.swing.JOptionPane;

public class Exercicio04{

    public static void main (String[]args){

        double notas[] = new double [4], media = 0;
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        notas [0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua nota 1"));
        notas [1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua nota 2"));
        notas [2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua nota 3"));
        notas [3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua nota 4"));

        media = (notas[0]+notas[1]+notas[2]+notas[3])/notas.length;

        JOptionPane.showMessageDialog(null,
        nome+", sua média é: "+media+"."
        );
    }
}