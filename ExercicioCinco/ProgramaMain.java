import java.util.Scanner;

public class ProgramaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Metodos metodo = new Metodos();

        System.out.println("Digite um número: ");
        metodo.setNumero(input.nextInt());
        input.close();
        
        metodo.resultado();
    }
    
}
