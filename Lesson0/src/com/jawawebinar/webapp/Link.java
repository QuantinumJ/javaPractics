package com.jawawebinar.webapp;
// Al usar propiedades inmutables hay que definirlas como final y inicializarlas
public class Link {
    private final String name;
    private final String url;
// Inicializamos las propiedades con el constructor ya que se van a generarse de forma dinamica
    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
