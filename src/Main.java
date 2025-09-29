import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Animal chien = new Animal();
        chien.family="chien";
        chien.name="loulou";
        chien.age=1;
        chien.isMammal=true;
        System.out.println(chien.name);
        System.out.println(chien.age);
        System.out.println(chien.isMammal);
        Animal chat = new Animal("chat","michou",2,true);
System.out.println(chat.name);
System.out.println(chat.age);
System.out.println(chat.isMammal);
System.out.println(chien);
System.out.println(chat);
Zoo zoo = new Zoo();
System.out.println(zoo.animals.length);
Zoo zoo2 = new Zoo("My zoo","Nabeul",5);
System.out.println(zoo2.animals.length);
        Zoo zoo3 = new Zoo("My zoo","Nabeul",7);
        System.out.println(zoo3.animals.length);

    }
    }
