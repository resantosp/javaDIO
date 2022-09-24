import javax.swing.MenuSelectionManager;

public class PraticaMetodos {

    
    //Calcule as 4 operações básicas
    public static String operacoesBasicas(double n1, double n2){

        //Soma
        double somaRes = n1 + n2;
        
        //Multiplicação
        double multiplicacaoRes = n1 * n2;

        //Divisao
        double divisaoRes = n1 / n2;

        //Subtração
        double subtracaoRes = n1 - n2;

        String operacoes = "Soma: " + somaRes + " Multiplicação: " + multiplicacaoRes + " Divisão: " + divisaoRes + " Subtração: " + subtracaoRes;

        return operacoes;
    }

    public static String horaMensagem(int hora){
        
        String mensagem;

        if((hora >= 6) && (hora < 12)){
            mensagem =  "Bom dia!";
        } else if((hora >= 12) && (hora < 18)){
            mensagem = "Boa tarde!";
        } else if((hora >= 18) && (hora < 24)){
            mensagem = "Boa noite!";
        } else if((hora > 0) && (hora < 6)){
            mensagem = "Vá dormir!";
        } else {
            mensagem = "Horário inválido. [1-24]";
        }

        return mensagem;

    }


    public static void main(String[] args) throws Exception {
        
        //Chamar operações básicas
        double n1 = 10;
        double n2 = 5;
        System.out.println(operacoesBasicas(n1, n2));

        //Chamar Método Mensagem
        int hora1 = 5;
        int hora2 = 9;
        int hora3 = 14;
        int hora4 = 20;
        int hora5 = 3;
        int hora6 = 30;

        System.out.println("São " + hora1 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora1));
        System.out.println("São " + hora2 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora2));
        System.out.println("São " + hora3 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora3));
        System.out.println("São " + hora4 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora4));
        System.out.println("São " + hora5 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora5));
        System.out.println("São " + hora6 + " hora(s) então o que eu tenho a dizer é: " + horaMensagem(hora6));

    }
}
