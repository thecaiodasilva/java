import java.util.Scanner;

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o Filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; 
        }

        System.out.println("media de avaliações" + mediaAvaliacao/3);

        
        

    }

