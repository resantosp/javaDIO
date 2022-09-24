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


    public static void main(String[] args) throws Exception {
        
        //Chamar operações básicas
        double n1 = 10;
        double n2 = 5;
        System.out.println(operacoesBasicas(n1, n2));



    }
}
