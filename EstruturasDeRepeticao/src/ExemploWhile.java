import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double dinheiro = 0;

        while (dinheiro < 50.0) {
            
            if (dinheiro < 50.0){
                double valorDoce = valorAleatorio();
                dinheiro += valorDoce;
                System.out.println("Valor do doce: " + valorDoce);
                System.out.println("Valor atual do carrinho: " + dinheiro);
            }else{
                System.out.println("Carrinho atingiu o valor máximo: " + dinheiro);
                break;
            }
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
