import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos metodo = new Metodos();

        System.out.println("Digite o primeiro número: ");
        metodo.setNumeroUm(input.nextInt());
        System.out.println("Digite o segundo número: ");
        metodo.setNumeroDois(input.nextInt());
        System.out.println("Digite o terceiro número: ");
        metodo.setNumeroTreis(input.nextInt());
        input.close();

        int numeroUm = metodo.getNumeroUm();
        int numeroDois = metodo.getNumeroDois();
        int numeroTres = metodo.getNumeroTres();

        System.out.println("O valor da soma dos numeros é " + metodo.soma(numeroUm, numeroDois, numeroTres));


    }
}
