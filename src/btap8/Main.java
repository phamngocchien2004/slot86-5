
package btap8;

import java.lang.String;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        Person  p = new Person();
        p.Addpp();
        ArrayList<String> listPerson = new ArrayList<>();


        listPerson.add(p.name);
        System.out.println(listPerson.get(0));
        listPerson.remove(listPerson.get(0));
        listPerson.add("chien");
        r.ttClass();

    }


    }
