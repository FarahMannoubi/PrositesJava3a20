package Entity;

public class Zoo {
   public Animal[] animals = new Animal[25] ;
   String name;
	String city;
   final	int NbrCages=25;
    int nbAnimals = 0;

    public Zoo() {}
    public Zoo( String name, String city) {
    this.animals  = new Animal[NbrCages] ;
    this.name = name;
    this.city = city;
    }



   public boolean addAnimal(Animal animal){
       if (searchAnimal(animal)!=-1)
           return true;
    for (int i = 0; i < animals.length; i++) {
       if(animals[i] == null){
           animals[i] = animal;
           return true;

       }

    }
   return false;
    }

    public boolean addAnimal1(Animal animal){
        if (searchAnimal(animal)!=-1)
            return true;
        if (animals.length >= nbAnimals) {
            if (animals[nbAnimals] != null) {
                nbAnimals++;
            }
            System.out.println(nbAnimals);
            animals[nbAnimals] = animal;
            return true;
        }
return false;

    }

    boolean addAnimal2(Animal animal) {

        if (nbAnimals == animals.length)
            return false;
        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }


    public int searchAnimal(Animal animal){
    for (int i = 0; i < animals.length; i++) {
        if(animals[i] == null)return -1;
       if(animals[i].name == animal.name)
           return i;
    }
return -1;
    }

    public void afficherAnimals(){
    for (int i = 0; i < animals.length; i++) {
        System.out.println(animals[i]);
    }
    }

 public    boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if (index == -1) return false;
        if(index == animals.length){
            animals[index] = null;
            return true;
     }
        for (int i = index; i < animals.length-1; i++) {
            animals[i] = animals[i+1];
        }
       return true;
 }

    public  boolean removeAnimal1(Animal animal){
       while (animals[animals.length-1] != null ) {
          int index = searchAnimal(animal);
          if(index !=-1){
             animals[index] = animals[index+1];
          }
           nbAnimals--;

           return true;
       }
        return false;
    }
    public boolean isZooFull(){
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] == null)return false;
        }
        return true;
    }
    public static   Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbAnimals>z2.nbAnimals)
            return z1;
        return z2;
    }

    public String toString(){
        return "Zoo :[ name : "+name+", city : "+city+"] ";
    }

}
