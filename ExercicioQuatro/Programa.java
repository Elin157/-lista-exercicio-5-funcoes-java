import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MetodosMediasAGH metodo = new MetodosMediasAGH();

        System.out.println("App de médias");

        System.out.println("Informe o primeiro número: ");
        metodo.setNumeroUm(input.nextDouble());

        System.out.println("Informe o segundo número: ");
        metodo.setNumeroDois(input.nextDouble());

        System.out.println("Informe o terceiro número: ");
        metodo.setNumeroTres(input.nextDouble());
        input.close();
        double numeroUm = metodo.getNumeroUm();
        double numeroDois = metodo.getNumeroDois();
        double numeroTres = metodo. getNumeroTres();
        
        double mediaAritmetica = metodo.mediaAritmetica(numeroUm, numeroDois, numeroTres);
        double mediaHarmonica = metodo.mediaHarmonica(numeroUm, numeroDois, numeroTres);
        double mediaGeometrica = metodo.mediaGeometrica(numeroUm, numeroDois, numeroTres);

        System.out.printf("O valor da media Aritimetica é: %.2f \n" , mediaAritmetica);
        System.out.printf("O valor da media Harmonica é: %.2f\n" , mediaHarmonica);
        System.out.printf("O valor da media Geometrica é: %.2f\n" , mediaGeometrica);
    }
    
}
