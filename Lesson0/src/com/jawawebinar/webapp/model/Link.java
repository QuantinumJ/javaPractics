package com.jawawebinar.webapp.model;

import java.util.Objects;

// Al usar propiedades inmutables hay que definirlas como final y inicializarlas
public class Link {
    private final String name;
    private final String url;

    public static Link EMPTY = new Link();

    public Link() {
        this("",null);
    }

    // Inicializamos las propiedades con el constructor ya que se van a generarse de forma dinamica
    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }
    // Constructor de clonazion de si mismo
    //Metodos de la clase Object.clone().
    // equals() - Compara
    public Link(Link link){
        this(link.name, link.url);
    }

 //ctr+O para reescribimos el metodo. Y apuntamos a la herencia. A su padre
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return name.equals(link.name) && Objects.equals(url, link.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url);
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
