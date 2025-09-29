public class Zoo {
    Animal[] animals = new Animal[25] ;
   String name;
	String city;
	int nbrCages;
public Zoo() {}
    public Zoo( String name, String city, int nbrCages) {
    this.animals  = new Animal[nbrCages] ;
    this.name = name;
    this.city = city;
    this.nbrCages = nbrCages;
    }
}
