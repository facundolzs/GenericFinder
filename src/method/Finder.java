package method;

import interfaces.iIdentifiable;
import java.util.Collection;
import java.util.Iterator;

public class Finder<T extends iIdentifiable, K> {

    public T genericFinder(Collection<? extends T> items, K key) {

        T found = null;
        Iterator<? extends T> it = items.iterator();

        while (it.hasNext() && found == null) {
            T currentObject = it.next();
            if (currentObject.sameId(key)) {
                found = currentObject;
            }
        }

        return found;
    }

}
