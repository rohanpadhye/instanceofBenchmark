package quickinstance.deep;

import quickinstance.TypeBits;

public interface CanI {
    static long typeID = TypeBits.freshID();
    static long mixID = typeID;
    void doI();
}
