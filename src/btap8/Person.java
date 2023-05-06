package btap8;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    int telephone;
    String address;

    public Person() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public void Addpp(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
    }

}