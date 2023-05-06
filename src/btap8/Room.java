package btap8;
import java.lang.String;
import java.util.Scanner;

public class Room {
    String name = "10B";
    String position = " số 8 Tôn Thất Thuyết";
    String[] listPerson;
    int i;

    public Room(){

    }

    public String[] getListPerson() {
        return listPerson;
    }

    public void setListPerson(String[] listPerson) {
        this.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void ttClass() {
        System.out.println(" Class Name:  "+name);
        System.out.println(" Position:  "+position);
        System.out.println("Các phần tử có trong arrListString là: ");
        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i) + "\t");
        }
    }


}