package de.michaeldorner;

public interface CanA {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doA();
}
