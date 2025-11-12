import Entity.*;
import exception.InvalidAgeException;
import exception.ZooFullException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Animal chien = new Animal();
        chien.setName("chien");
        chien.setName("loulou");
        try {
            chien.setAge(-1);

        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
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
System.out.println("////////////////////////////////////zoo.addAnimal(chien);///////////////////////////////////////////////////");



zoo.addAnimal(chien);
zoo.addAnimal(chien);
        zoo.addAnimal(chien);


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
Animal a1=new Animal();
//Aquatic aq2=new Aquatic("famille4","momo",10,true,"habitat3");

Terrestral ter2=new Terrestral("famille1","sisi",20,true,4);
Dolphin d2=new Dolphin("famille2","soso",20,true,4);
Penguin p1=new Penguin("famille3","sasa",30,false,"habit1",22);
System.out.println(a1);
System.out.println(ter2);
System.out.println(d2);
System.out.println(p1);
//d2.swim();
p1.swim(12);
Animal animal =new Animal();
//Dolphin dolphin = (Dolphin) animal;

//Dolphin dolphin2 = (Dolphin) new Animal();

Animal animal1 = new Dolphin(12);
Dolphin dolphin3 = (Dolphin) animal1;

//zoo.addAquaticAnimal(d2);
//zoo.addAquaticAnimal(new Dolphin(1));
//zoo.addAquaticAnimal(dolphin3);
//zoo.addAquaticAnimal(p1);
System.out.println("////////////////////////////");
zoo.afficheraquaticAnimals();
zoo.swimAffichage();
System.out.println(zoo.maxPenguinSwimmingDepth());
zoo.displayNumberOfAquaticsByType();
Aquatic animal2=new Penguin("family","test",1,true,"",12);
Aquatic animal3=new Penguin("","test",1,true,"",12);
zoo.addAquaticAnimal(animal2);
zoo.addAquaticAnimal(animal3);
zoo.afficheraquaticAnimals();
        try {
            zoo.addAnimal2(new Animal());
        } catch (ZooFullException e) {
            System.err.println(e.getMessage());
        }
    }

    }
