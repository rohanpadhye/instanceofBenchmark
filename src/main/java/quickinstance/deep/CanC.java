package quickinstance.deep;

import quickinstance.TypeBits;

public interface CanC extends CanH {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID | CanH.mixID;
    void doC();
    void doH();
}
