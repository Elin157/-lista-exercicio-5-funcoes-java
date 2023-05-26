public class Metodos{
    private double taxaImposto, custo;
    public void setTaxaImposto(double taxaImposto){
        this.taxaImposto = taxaImposto;
    }
    public double getTaxaImposto(){
        return taxaImposto;
    }
    public void setCusto(double custo){
        this.custo = custo;
    }
    public double getCusto(){
        return custo;
    }
    public double somaImposto(double a, double b){
        return (a + b);
    }
}