class MetodoPorcentagem {
    private double numero;

    public void setNumero(double numero){
        this.numero = numero;
    }

    public double getNumero(){
        return numero;
    }

    public double porcentagem(double numero){
        double porcentagem = numero * 0.1;
        return numero + porcentagem;
    }
}