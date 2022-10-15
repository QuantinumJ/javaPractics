package teoria.sintaxys.car;

/* Implimentamos la Interface que nos obliga a tener los metod descritos en la Interfaz*/

public class CarImpl extends AbstractCar implements Car  {


    private String modelo = "BMW";
    protected double speed = 150;
    double volumenMotor = 1.6;


    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
    this.speed = speed;
    }

    @Override
    public double getEngineVolumen() {
        return volumenMotor;
    }

    @Override
    public void setEngineVolumen(double engineVolumen) {
    this.volumenMotor = engineVolumen;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
    this.modelo = modelo;
    }

    @Override
    public void mostrarInfoCar(String modelo, double speed, double engineVolumen) {
    out("Modelo: "+modelo+"\nVelocidad: "+speed+ "\nVolumen del motor "+volumenMotor);

    }

    @Override
    public void go() {
        System.out.println(speed);
    }

    void out(String str){
        System.out.println(str);
    }
}
