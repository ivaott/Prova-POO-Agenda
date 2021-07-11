package Prova;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private int id;
    private List<Person> person = new ArrayList();
    
    public void save(Person p) {
        for (int i = 0; i < 10; i++) {
            person.add(p);
        }
    }
    
    public void remove(int id) {
        person.remove(getPersonById(id));
    }
    
    public Person getPersonByName(String name) {
        for (Person p : person) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    
    public List<Person> findAll() {
       return person;
    }
    
    public void printPerson(int index) {
        for (int i = 0; i < index; i++) {
            Person p = person.get(i);
            if (p.id == (index - 1)) {
                System.out.println("Pessoa: " + toString(p.getId(), p.getName(), p.getTelephone(), p.getEmail()));
            }
        }
    }
    
    public Person getPersonById(int id) {
        for (Person p : person) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
    
    public String toString(int id, String name, String telephone, String email) {
        return "id: " + id + "\n" + "name: " + name + "\n" + "telephone: " + telephone + "\n" + "email: " + email;
    }
    
}