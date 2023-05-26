class MetodosMediasAGH {
    private double numeroUm, numeroDois, numeroTres;

    public void setNumeroUm(double numeroUm){
        this.numeroUm = numeroUm;
    }
    public double getNumeroUm(){
        return numeroUm;
    }
    public void setNumeroDois (double numeroDois){
        this.numeroDois = numeroDois;
    }
    public double getNumeroDois(){
        return numeroDois;
    }
    public void setNumeroTres (double numeroTres){
        this.numeroTres = numeroTres;
    }
    public double getNumeroTres(){
        return numeroTres;
    }
    

    public double mediaAritmetica(double numeroUm, double numeroDois, double numeroTres){
        return (numeroUm + numeroDois + numeroTres) / 3;
    }
    public double mediaHarmonica(double numeroUm, double numeroDois, double numeroTres){
        return 3 / ((1 / numeroUm) + (1 / numeroDois) + (1 / numeroTres));
    }
    public double mediaGeometrica(double numeroUm, double numeroDois, double numeroTres){
        return Math.pow(numeroUm * numeroDois * numeroTres , 1.0/3.0);
    }
}
