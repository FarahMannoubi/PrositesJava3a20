package Entity;

import java.util.Comparator;

public class CompName implements Comparator<Dolphin> {
    @Override
    public int compare(Dolphin o1, Dolphin o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
