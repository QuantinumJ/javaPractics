package resumeMain;

import com.jawawebinar.webapp.model.Link;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
   Link mel = new Link("Melit","https://melit.es");

       Link mel2 = mel;
    Link mel3 = new Link(mel);
        System.out.println(mel.equals(mel3));
        // False, ya que apuntan a distinos sitios de almacenamiento. Para ello hay que reescribir el metodo equals para que comprueba la clase Class procedente. entonces volvera true
        System.out.println(mel.toString());


        Field f= Link.class.getDeclaredField("url");
        f.setAccessible(true);
        Link l1 = new Link("dopakd","doada");
        // instance of. Coprueba si es la instancia del objeto.
        System.out.println(l1 instanceof Link);

        // Mala practica
  /*      String prueba = "";
        for(int i=0; i<100; i++){
            prueba +="a";

        }
        System.out.println(prueba);
        */
        // Lo suyo seria utilizar la clase StringBuilder o mas antiguo BufferString(asincronico)

        StringBuilder prueba2 = new StringBuilder();
        for(int i=0; i<1000; i++){
             prueba2.append("a");
        }
        System.out.println(prueba2);
    }
}
