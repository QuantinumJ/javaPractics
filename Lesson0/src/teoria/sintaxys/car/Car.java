package teoria.sintaxys.car;
/* Las interfaces nos sirven para definir los modelos y el contenido que vaya a tener las clases. Reglas. A partir
 Java 8 puede tener cierta logica y funcionalidad. Encapsulacion. Simplimente  */
public interface Car {

    double getSpeed();
    void  setSpeed(double speed);

    double getEngineVolumen();
    void  setEngineVolumen(double engineVolumen);

    String getModelo();
    void  setModelo(String modelo);



    void mostrarInfoCar(String modelo, double speed, double engineVolumen);
    void go();




}
