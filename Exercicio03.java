import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main (String[]args){

        String [] nomes = new String [7];
        double [] preco = new double [7];

        nomes [0] = "Água";
        nomes [1] = "Gasolina";
        nomes [2] = "Diesel";
        nomes [3] = "Cerveja lata";
        nomes [4] = "Cigarro";
        nomes [5] = "Bala";
        nomes [6] = "SEDA/Papel para enrolar cigarros";

        preco [0] = 2.50;
        preco [1] = 3.99;
        preco [2] = 4.05;
        preco [3] = 3.50;
        preco [4] = 8.90;
        preco [5] = 0.50;
        preco [6] = 6.50;

        JOptionPane.showMessageDialog(null,
        nomes [0]+ ": R$ "+preco [0]+
        "\n"+nomes [1]+ ": R$ "+preco [1]+
        "\n"+nomes [2]+ ": R$ "+preco [2]+
        "\n"+nomes [3]+ ": R$ "+preco [3]+
        "\n"+nomes [4]+ ": R$ "+preco [4]+
        "\n"+nomes [5]+ ": R$ "+preco [5]+
        "\n"+nomes [6]+ ": R$ "+preco [6]
        );
        
    }
}