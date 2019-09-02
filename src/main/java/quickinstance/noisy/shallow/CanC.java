package quickinstance.noisy.shallow;

import quickinstance.TypeBits;

public interface CanC {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doC();
}
