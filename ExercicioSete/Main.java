import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        System.out.println("Digite um valor: ");
        metodo.setNumero(input.nextInt());
        input.close();
        
        System.out.printf("O valor que digitou é : %s" , metodo.verificacao(metodo.getNumero()));
    }
    
}
