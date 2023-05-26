public class Temperatura{
    private double temperatura;

    public void setTemperatura (double temperatura){
        this.temperatura = temperatura;
    }
    public double getTemperatura(){
        return temperatura;
    }
    public double celcios(double temperatura){
        return (temperatura - 32) / 1.8;
    }
}