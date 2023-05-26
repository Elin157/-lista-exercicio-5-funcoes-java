class Metodos {
    private int numero;
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void resultado() {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
