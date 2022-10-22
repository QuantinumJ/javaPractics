package com.jawawebinar.webapp.storage;
//Muchas implimentaciones de la interfaz

import com.jawawebinar.webapp.model.Resume;

import java.util.Collection;

public interface IStorage {

    void clear();
    void save(Resume r);
    void update(Resume r);
    void delete(Resume r);
    Resume load(String uuid); //carga de los CV
    void delete(String uuid);
    Collection<Resume> getAllSorted(); // Cogerlos sortiados
    int size(); // Pagination



}
