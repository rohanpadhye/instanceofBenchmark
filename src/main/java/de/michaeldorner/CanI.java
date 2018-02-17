package de.michaeldorner;

public interface CanI {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doI();
}
