package org.example;

public class Student {
    private  int id;
    private String name;
    private String rollNO;
    //private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRollNO(String rollNO) {
        this.rollNO = rollNO;
    }

    /*public void setAddress(Address address) {
        this.address = address;
    }*/
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNO='" + rollNO + '\'' +
                '}';
    }
}
