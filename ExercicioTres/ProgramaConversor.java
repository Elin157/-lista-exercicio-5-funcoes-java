import java.util.Scanner;
class ProgramaConversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperatura metodo = new Temperatura();
        
        System.out.println("Digite uma temperatura em Graus Fahrenheit: ");
        metodo.setTemperatura(input.nextDouble());
        input.close();
        double celcios = metodo.celcios(metodo.getTemperatura());

        System.out.printf("O valor convertido em graus Celcios é: %.2f" , celcios);
        
    }
    
}
