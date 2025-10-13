package Entity;

public non-sealed class Dolphin extends Aquatic {
private float swimmingSpeed;
public Dolphin(String family, String name, int age, boolean isMammal,float swimmingSpeed) {
this.habitat =habitat;
this.name=name;
this.age=age;
this.isMammal=isMammal;
this.family=family;
this.swimmingSpeed = swimmingSpeed;
}
public void swim(){
    System.out.println("This dolphin is swimming");
}
public String toString(){
    return super.toString()+swimmingSpeed+" "+name;
}
}
