import java.util.Scanner;
class ProgramaPorcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        MetodoPorcentagem metodo = new MetodoPorcentagem();

        System.out.println("App de porcentagem");
    
        System.out.println("Informe o valor do produto: ");
        metodo.setNumero(input.nextDouble());
        input.close();

        double valor = metodo.porcentagem(metodo.getNumero());
        System.out.println("Novo valor do produto acrescido de 10%: " + valor);
    }
}