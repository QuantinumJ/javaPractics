package com.jawawebinar.webapp.storage;

import com.jawawebinar.webapp.model.Resume;
import com.jawawebinar.webapp.storage.IStorage;

import java.util.Collection;

public class ArrayStorage implements IStorage {
    private static final int LIMIT = 100; // Creacion de una constante alt+ctr+c
    private Resume[] array = new Resume[LIMIT];





    @Override
    public void clear() {

    }

    @Override
    public void save(Resume r) {
        int idx = -1;
        for(int i = 0; i<LIMIT; i++){
            Resume resume = array[i]; // alt+ctr+v Para crear como elemento resume[i]
            if(resume != null){
                if(r.equals(resume)){
                    throw new IllegalStateException("Already present");
                }
            }else if(idx == -1){
                idx = i;
            }
        }
        array[idx]=r;
    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public void delete(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
