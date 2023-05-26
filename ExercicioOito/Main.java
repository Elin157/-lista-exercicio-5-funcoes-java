import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos metodo = new Metodos();

        System.out.println("Digite a taxa de imposto: ");
        metodo.setTaxaImposto(input.nextDouble());

        System.out.println("Digite o custo do produto: ");
        metodo.setCusto(input.nextDouble());
        input.close();

        double imposto = metodo.getTaxaImposto();
        double custo = metodo.getCusto();

        System.out.printf("o valor do produto após o imposto é dê: %.2f" , metodo.somaImposto(imposto, custo));
    }
}
