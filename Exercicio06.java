import javax.swing.JOptionPane;

public class Exercicio06{

    public static void main (String[]args){

            int idades[] = new int [9], maiorIdade = Integer.MIN_VALUE;

            idades [0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da primeira pessoa"));
            idades [1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da segunda pessoa"));
            idades [2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da terceira pessoa"));
            idades [3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da quarta pessoa"));
            idades [4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da quinta pessoa"));
            idades [5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da sexta pessoa"));
            idades [6] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da setíma pessoa"));
            idades [7] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da oitava pessoa"));
            idades [8] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da nona pessoa"));

            if(idades[0]>maiorIdade){
                maiorIdade = idades[0];
            }
            if(idades[1]>maiorIdade){
                maiorIdade = idades[1];
            }
            if(idades[2]>maiorIdade){
                maiorIdade = idades[2];
            }
            if(idades[3]>maiorIdade){
                maiorIdade = idades[3];
            }
            if(idades[4]>maiorIdade){
                maiorIdade = idades[4];
            }
            if(idades[5]>maiorIdade){
                maiorIdade = idades[5];
            }
            if(idades[6]>maiorIdade){
                maiorIdade = idades[6];
            }
            if(idades[7]>maiorIdade){
                maiorIdade = idades[7];
            }
            if(idades[8]>maiorIdade){
                maiorIdade = idades[8];
            }
        
        JOptionPane.showMessageDialog(null, "A pessoa com a maior idade é: "+maiorIdade);
    }
}