package Entity;

public sealed class Aquatic extends Animal permits Dolphin,Penguin  {
    protected  String habitat ;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public Aquatic(){}
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
    @Override
    public String toString() {
        return super.toString()+ habitat;
    }
}
