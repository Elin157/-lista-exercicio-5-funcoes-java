public class Metodos {
    private int numero;

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public char verificacao(int numero){
        this.numero = numero;
        if(numero > 0){
        return 'P';
    } else {
        return 'N';
    }
    }
}
