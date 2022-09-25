public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        /*
        if((nota >= 7) && (nota <= 10)){
            System.out.println("Aprovado");
        }else if((nota < 7) && (nota >= 5)){
            System.out.println("Recuperação");
        }else if((nota > 10) || (nota < 0)){
            System.out.println("Nota inválida");
        }else{
            System.out.println("Reprovado");
        }
         */

        //Condição ternária (abreviação)
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        
    }
}
