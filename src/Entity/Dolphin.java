package Entity;

import java.io.Serializable;

public non-sealed class Dolphin extends Aquatic implements Comparable<Dolphin> {
private float swimmingSpeed;

    public Dolphin(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, float swimmingSpeed) {
this.habitat =habitat;
this.name=name;
this.age=age;
this.isMammal=isMammal;
this.family=family;
this.swimmingSpeed = swimmingSpeed;
}
/*public void swim(){
    System.out.println("This dolphin is swimming");
}*/
public String toString(){
    return super.toString()+swimmingSpeed+" "+name;
}

    @Override
    public int compareTo(Dolphin o) {
        return this.age-o.age;
    }
}
