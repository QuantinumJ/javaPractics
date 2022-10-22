package teoria.sintaxys.car;

public class Deportivo extends CarImpl{
// Herencia

    // Costructor
     public Deportivo(){
     speed = 180;
    }
    @Override
    public void setNumeroRuedas(int ruedas){
        this.numeroRuedas = ruedas;
    }
    @Override
    public int getNumeroRuedas() {
        return numeroRuedas;
    }


}
