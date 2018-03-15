package quickinstance.deep;

import quickinstance.TypeBits;

public interface CanC {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doC();
}
