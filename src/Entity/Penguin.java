package Entity;

public final class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public void swim(int swimmingDepth){
        System.out.println("Penguin swimming depth is "+swimmingDepth);
    }
    public void swim(){
        System.out.println("Penguin swimming depth is "+swimmingDepth);
    }

    public String toString(){
        return "Penguin "+super.toString();
    }
}
