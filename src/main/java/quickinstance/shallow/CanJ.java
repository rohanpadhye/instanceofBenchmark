package quickinstance.shallow;

import quickinstance.TypeBits;

public interface CanJ {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doJ();
}
