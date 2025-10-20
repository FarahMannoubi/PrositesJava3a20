package Entity;

public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin  {
    protected  String habitat ;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public Aquatic(){}
    public abstract void swim();
    @Override
    public String toString() {
        return super.toString()+ habitat;
    }
}
