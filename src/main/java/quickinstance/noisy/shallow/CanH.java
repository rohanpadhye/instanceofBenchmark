package quickinstance.noisy.shallow;

import quickinstance.TypeBits;

public interface CanH {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doH();
}
