package com.jawawebinar.webapp.storage;

import com.jawawebinar.webapp.model.Resume;


import java.util.Collection;

public class ArrayStorage implements IStorage {
    private static final int LIMIT = 100; // Creacion de una constante alt+ctr+c
    private Resume[] array = new Resume[LIMIT];





    @Override
    public void clear() {
    	for(int i = 0; i < LIMIT; i++ ) {
    		if(array[i] != null)
    		array[i] = null;
    	}
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
    	// Hay que encontrar la posicion seleccionada y rescribirla
    	
    			for(int i=0; i<array.length; i++) {	
    				if(!(r.equals(array[i]))) {
    					array[i]=r;
    				}else {
    					throw new IllegalStateException("Ya existen estos datos");
    				}	
    		}

    }

    @Override
    public void delete(Resume r) {
    	
    	for(int i=0; i<array.length; i++) {
    		 Resume resume = array[i]; // alt+ctr+v Para crear como elemento resume[i]
             if(resume != null){
                 if(r.equals(resume)){
                   array[i] = null;
                   break;
                 }
			}else {
				throw new IllegalStateException("No se ha podido borrar");
			}
	}
    	
    	
    }

    @Override
    public Resume load(String uuid) {
    	String id;
    	for(int i = 0; i < array.length; i++) {
    		 id = array[i].getUuid();	
    		if(uuid.equals(id)) {
    		
    			throw new IllegalStateException("ok");
    			
    			/*array[i].getFullName();
    			array[i].getLocation();
    			array[i].getContacts();
    			array[i].getSections();
    			*/
    			// System.out.println(array[i].getFullName() + array[i].getLocation()+array[i].getContacts()+array[i].getSections());
    			  
    		}else {
    			throw new IllegalStateException("No se ha podido e");
    		}
    	}
    	
    	
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
