import java.util.Scanner;

class  ProgrmasMedias{

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        MetodosMedias media = new MetodosMedias();
        
        System.out.println("Programa de media Aritmetica!");

        System.out.println("Digite o primeiro numero: ");
        media.setNumeroUm(input.nextDouble());
        
        System.out.println("Digite o segundo numero: ");
        media.setNumeroDois(input.nextDouble());
        input.close();

        System.out.println("A media entre os numeros é " + media.mediaAritmetica(media.getNumeroUm() , media.getNumeroDois()));
    }
}
