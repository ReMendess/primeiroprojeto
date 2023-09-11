public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu catalágo!");
        System.out.println("Filme: Dungeons & Dragons: Honra Entre Rebeldes");

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.2;

        String sinopse;
        sinopse = """
                Um ladrão e um bando de aventureiros embarcam em uma jornada épica para recuperar uma relíquia.
                
                """ + anoDeLancamento;
        System.out.println(sinopse);
        }

    }
