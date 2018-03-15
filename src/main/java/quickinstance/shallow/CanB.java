package quickinstance.shallow;

import quickinstance.TypeBits;

public interface CanB {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doB();
}
