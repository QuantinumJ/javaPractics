package carMain;

import teoria.sintaxys.car.CarImpl;
import teoria.sintaxys.car.Deportivo;

public class Main {
    public static void main(String[] args) {
       CarImpl carTouristic = new CarImpl();
//        carTouristic.setSpeed(180);
//        carTouristic.go();


        carTouristic.mostrarInfoCar("Audi",160,3.5);
        Deportivo deportivo = new Deportivo();
        deportivo.setNumeroRuedas(4);

        System.out.println("Este coche va a "+deportivo.getSpeed()+"km"+" y tiene "+deportivo.getNumeroRuedas()+" ruedas" );

    }
}
