package interfaces;

public interface iIdentifiable<T> {

    abstract T getId();

    abstract void setId(T newId);

    abstract boolean sameId(T anotherId);

}
