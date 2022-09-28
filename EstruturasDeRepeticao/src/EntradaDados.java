import javax.swing.JOptionPane;

public class EntradaDados {
    public static void main(String[] args) {
        
        int idade;
        //Entrada de Dados via JOptionPane

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

        System.out.println("Sua idade é " + idade);

    }
}
