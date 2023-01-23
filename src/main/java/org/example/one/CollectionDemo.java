package org.example.one;

public class CollectionDemo {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Mini");
        p1.setGender(Gender.FEMALE);

        Person p2=new Person();
        p2.setName("Tibor");
        p2.setGender(Gender.MALE);

        Box kutija =new Box();
        kutija.setPolje(26);

        Box<Integer> integerBox=new Box<Integer>();
        integerBox.setPolje(54);

        Box<Person> personBox= new Box<>();
        personBox.setPolje(p1);
    }
}
