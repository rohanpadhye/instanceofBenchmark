package quickinstance.deep;

import quickinstance.TypeBits;

public class I extends J {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | J.mixID;

	public void doI() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
