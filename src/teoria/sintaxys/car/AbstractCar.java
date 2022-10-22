package teoria.sintaxys.car;

public abstract class AbstractCar {

    protected int numeroRuedas;

    void setNumeroRuedas(int ruedas){
       this.numeroRuedas = ruedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }
}
