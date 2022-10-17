package resumeMain;

import com.jawawebinar.webapp.Link;

public class Main {
    public static void main(String[] args) {
   Link mel = new Link("Melit","https://melit.es");

       Link mel2 = mel;
    Link mel3 = new Link(mel);
        System.out.println(mel.equals(mel3));
        // False, ya que apuntan a distinos sitios de almacenamiento. Para ello hay que reescribir el metodo equals para que comprueba la clase Class procedente. entonces volvera true
        System.out.println(mel.toString());



    }
}
