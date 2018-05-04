import javax.swing.JOptionPane;

public class Exercicio01{

    public static void main (String[]args){

        int [] numeros = new int [16];
        int soma = 0;

        numeros [0] = 32;
        numeros [1] = 23;
        numeros [2] = 42;
        numeros [3] = 24;
        numeros [4] = 13;
        numeros [5] = 11;
        numeros [6] = 10;
        numeros [7] = 17;
        numeros [8] = 25;
        numeros [9] = 22;
        numeros [10] = 99;
        numeros [11] = 124;
        numeros [12] = 321;
        numeros [13] = 39;
        numeros [14] = 94;
        numeros [15] = 3;

        soma =  numeros [0]+
        numeros [1]+
        numeros [2]+
        numeros [3]+
        numeros [4]+
        numeros [5]+
        numeros [6]+
        numeros [7]+
        numeros [8]+
        numeros [9]+
        numeros [10]+
        numeros [11]+
        numeros [12]+
        numeros [13]+
        numeros [14]+
        numeros [15];

        JOptionPane.showMessageDialog(null, "A soma dos vetores é: "+soma);

    }
}