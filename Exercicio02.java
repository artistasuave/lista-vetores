import javax.swing.JOptionPane;

public class Exercicio02{

    public static void main (String[]args){

        String [] nomes = new String [10];

        nomes [0] = "Luana";
        nomes [1] = "Márcio";
        nomes [2] = "Alan";
        nomes [3] = "Matheus";
        nomes [4] = "Jonas";
        nomes [5] = "Fábio";
        nomes [6] = "Rodrigo";
        nomes [7] = "Juan";
        nomes [8] = "Jéssica";
        nomes [9] = "Veridiana";

        JOptionPane.showMessageDialog(null,
        "\nO primeiro nome é: "+nomes[0]+
        "\nO segundo nome é: "+nomes [1]+  
        "\nO terceiro nome é: "+nomes [2]+  
        "\nO quarto nome é: "+nomes [3]+  
        "\nO quinto nome é: "+nomes [4]+  
        "\nO sexto nome é: "+nomes [5]+  
        "\nO sétimo nome é: "+nomes [6]+ 
        "\nO oitavo nome é: "+nomes [7]+
        "\nO nono nome é: "+nomes [8]+ 
        "\nO décimo nome é: "+nomes [9]
        );
    }
}