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
    	
    			for(int i=0; i<LIMIT; i++) {	
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
    	
    	/*String id = "";
    	
    	do {
    		for(int i = 0; i < array.length; i++) {
       		 id = array[i].getUuid();
       		 System.out.println("El valor de id es "+id+ " el valor de uuid es "+ uuid);
       		if(id == uuid) {
       		 encontrado = array[i];	  
       		}else continue;
       	}
    		 return encontrado;
    	}while( id == uuid);
    	*/
    	Resume resumeEncontrado=null;
    		for(int i = 0; i < LIMIT; i++) {
        		String idIndex = array[i].getUuid();
        		if(idIndex == uuid) {
        			resumeEncontrado = array[i];      			
        			break;
        		}else if(idIndex == null || i == LIMIT ) {
        			throw new IllegalStateException(" El UUID pasado no existe");
        	}
    	}
    	return resumeEncontrado;	
    }

    @Override
    public void delete(String uuid) {
    	int control = -1;
		for(int i = 0; i < LIMIT; i++) {
    		String idIndex = array[i].getUuid();
    		if(idIndex == uuid) {
    			array[i] = null;
    			control = 1;
    	}
    		if(control == 1) {
    			break;
    		}
	}
    	

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
    	int longitudNotEmpty = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] !=null) {
    			longitudNotEmpty++;
    		}
    		
    	}
        return longitudNotEmpty;
    }
}
