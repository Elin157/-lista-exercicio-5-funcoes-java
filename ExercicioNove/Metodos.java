class Metodos {
    
        private String numero;

    public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

    public void inverter(){
        String[] novonumero = numero.split("");
        for (int i = novonumero.length; i > 0; i --){
            System.out.println(novonumero[i-1]);
        }
    }
}