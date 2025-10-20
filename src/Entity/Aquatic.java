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
    public boolean equals(Object obj) {
      if(obj == null )
          return false;
      if(obj == this)
          return true;
      if(obj instanceof Aquatic aquatic){
        return  this.habitat.equals(aquatic.habitat )&& this.age==aquatic.age && this.name.equals(aquatic.name);
      }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ habitat;
    }
}
