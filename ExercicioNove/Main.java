import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos m = new Metodos();
        System.out.println("Digite um valor: ");
        m.setNumero(input.next());
        input.close();
        
        m.inverter();

    }
}
