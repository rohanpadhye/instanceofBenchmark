package quickinstance.shallow;

import quickinstance.TypeBits;

public interface CanE {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doE();
}
