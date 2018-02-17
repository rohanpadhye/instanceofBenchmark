package de.michaeldorner;

public interface CanB {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doB();
}
