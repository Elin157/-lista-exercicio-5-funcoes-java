public class MetodosMedias {
        private double numeroUm;
        private double numeroDois;

        public void setNumeroUm (double numeroUm) {
            this.numeroUm = numeroUm;
        }
        public double getNumeroUm(){
            return numeroUm;
        }
        public void setNumeroDois(double numeroDois){
            this.numeroDois = numeroDois;
        }
        public double getNumeroDois(){
            return numeroDois;
        }
        public double mediaAritmetica(double numeroUm, double numeroDois){
            return ( numeroUm + numeroDois) / 2;

        }
}