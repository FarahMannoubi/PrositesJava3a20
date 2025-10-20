package Entity;

public class Zoo {
   private Animal[] animals = new Animal[25] ;
  private String name;
    private String city;
    private final	int NbrCages=25;
    private int nbAnimals = 0;
    public Aquatic[] aquaticAnimals  = new Aquatic[10];
    int i=0;

    public Zoo() {}
    public Zoo( String name, String city) {
    this.animals  = new Animal[NbrCages] ;
     this.setName(name);
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
        if (this.isZooFull()==true)
            return false;
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
       if(animals[i].getName() == animal.getName())
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

    public void addAquaticAnimal(Aquatic aquatic){
        if(aquatic == null)
            return;
        if (i==10){
            System.out.println("aquatic Animals is full");
            return;
        }
        for(Aquatic a : aquaticAnimals){
            aquaticAnimals[i] = aquatic;
            i++;
            return;
        }
    }
    public void afficheraquaticAnimals(){
        for(Aquatic a : aquaticAnimals){
            System.out.println(a);
        }
    }
    public void swimAffichage(){
        for (Aquatic a : aquaticAnimals) {
            if (a == null) {
                return;
            }
           a.swim();
        }
    }
    public float maxPenguinSwimmingDepth(){
        return 1;
    }

    public String toString(){
        return "Zoo :[ name : "+name+", city : "+city+"] ";
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if(name == null){
            System.out.println("name is null");
            return;
        }
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return NbrCages;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    public void setNbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }
}
