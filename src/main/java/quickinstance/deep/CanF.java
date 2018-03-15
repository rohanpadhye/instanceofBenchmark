package quickinstance.deep;

import quickinstance.TypeBits;

public interface CanF {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doF();
}
