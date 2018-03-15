package quickinstance.deep;

import quickinstance.TypeBits;

public interface CanD {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doD();
}
