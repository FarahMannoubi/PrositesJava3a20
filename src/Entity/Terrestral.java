package Entity;

public final class  Terrestral extends Animal  {
    private String nbrlegs;
    public Terrestral(String family, String name, int age, boolean isMammal,int nbrLegs) {
        super(family,name,age,isMammal);
        this.nbrlegs=nbrlegs;
    }
}
