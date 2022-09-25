public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "Midia";
        //String ligacao = "100 Minutos de Ligação";
        //String midia = "WhatsApp e Instagram Grátis";
        //String turbo = "5Gb de Internet";

        /* 
        switch (plano) {
            case "Basic":
                System.out.println(ligacao);
                break;
            case "Midia":
                System.out.println(ligacao + " + " + midia);
                break;
            case "Turbo":
                System.out.println(ligacao + " + " + midia + " + " + turbo);
                break;
            default:
                System.out.println("Plano inválido ou indisponível.");
        }
        */

        //Encadeamento
        switch (plano) {
            case "Turbo":
                System.out.println("5Gb de Internet");
            case "Midia":
                System.out.println("WhatsApp e Instagram Grátis");
            case "Basic":
                System.out.println("100 Minutos de Ligação");
                break;
        }
    }
}
