package com.jawawebinar.webapp.storage;

import com.jawawebinar.webapp.model.Contact;
import com.jawawebinar.webapp.model.ContactType;
import com.jawawebinar.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ArrayStorageTest {
    private static Resume R1, R2,R3;

    private ArrayStorage storage = new ArrayStorage();

        static {
            R1 = new Resume("Nombre completo1","Direccion1");
            R1.addContact(new Contact(ContactType.MAIL,"mail@it.es"));
            R1.addContact(new Contact(ContactType.MOBILE,"666999944"));
            R2 = new Resume("Nombre completo2","Direccion2");
            R2.addContact(new Contact(ContactType.WHATSAPP,"65489262654"));
            R2.addContact(new Contact(ContactType.HOME_PHONE,"915054879"));
            R3 = new Resume("Nombre completo3","Direccion3");
        }




        @BeforeClass
        public static void beforeClass(){
            //It's the same as static block {}
        }
        @Before
        public void before(){
            // Cada vez antes de que se realice el test
            storage.clear();
            storage.save(R1);
            storage.save(R2);
            storage.save(R3);
    }


    @org.junit.Test
    public void clear() {
    }

    @org.junit.Test
    public void save() {

    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void delete() {
    }

    @org.junit.Test
    public void load() {
    }

    @org.junit.Test
    public void testDelete() {

            storage.delete(R1.getUuid());
        Assert.assertEquals(2,storage.size());
        Assert.assertEquals(null,storage.load(R1.getUuid()));

    }

    @org.junit.Test
    public void getAllSorted() {
    }

    @org.junit.Test
    public void size() {
        Assert.assertEquals(3,storage.size());
    }
}