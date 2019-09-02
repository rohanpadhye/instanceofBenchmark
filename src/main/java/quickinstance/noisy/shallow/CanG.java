package quickinstance.noisy.shallow;

import quickinstance.TypeBits;

public interface CanG {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doG();
}
