package de.michaeldorner;

public interface CanC extends CanH {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID | CanH.mixID;
    void doC();
    void doH();
}
