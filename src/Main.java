import Entity.Animal;
import Entity.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Animal chien = new Animal();
        chien.setName("chien");
        chien.setName("loulou");
        chien.setAge(1);
        chien.setMammal(true);
        System.out.println(chien.getName());
        System.out.println(chien.getAge());
        System.out.println(chien.isMammal());
        Animal chat = new Animal("chat","michou",2,true);
System.out.println(chat.getName());
System.out.println(chat.getAge());
System.out.println(chat.getName());
System.out.println(chien);
System.out.println(chat);
Zoo zoo = new Zoo();
System.out.println(zoo.getAnimals().length);
Zoo zoo2 = new Zoo("My zoo","Nabeul");
System.out.println(zoo2.getAnimals().length);
        Zoo zoo3 = new Zoo("My zoo","Nabeul");
        System.out.println(zoo3.getAnimals().length);

       // System.out.println(zoo2.addAnimal(chien));
        System.out.println(zoo2.searchAnimal(new Animal()));
        zoo2.afficherAnimals();
System.out.println(zoo2.addAnimal1(chat));
       System.out.println(zoo2.addAnimal1(chien));

        zoo2.afficherAnimals();
//System.out.println(zoo2.removeAnimal(chien));
//System.out.println(zoo2.removeAnimal(chat));
zoo2.afficherAnimals();
System.out.println(zoo2.isZooFull());
System.out.println("Zoo is full : "+Zoo.comparerZoo(zoo, zoo2));
    }
    }
