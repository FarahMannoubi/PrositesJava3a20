package Entity;

import java.util.Comparator;

public class CompAge implements Comparator<Dolphin> {
    @Override
    public int compare(Dolphin o1, Dolphin o2) {
        return o1.getAge()-o2.getAge();
    }
}
