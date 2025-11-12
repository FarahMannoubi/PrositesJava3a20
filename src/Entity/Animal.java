package Entity;

import exception.InvalidAgeException;

public sealed class Animal permits Aquatic,Terrestral {
    protected String family;
    protected String name;
    protected   int age;
    protected  boolean isMammal;
    public Animal() {}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        try {
            this.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age <= 0) {
          throw new  InvalidAgeException ("Invalid age");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String toString() {
        return "Animal [family="
                + family + ", name=" + name + ", age=" + age+ ", isMammal="+isMammal+"]";
    }

}
