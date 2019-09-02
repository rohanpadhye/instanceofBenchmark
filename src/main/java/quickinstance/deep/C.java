package quickinstance.deep;

import quickinstance.TypeBits;

public class C extends D {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | D.mixID;

	public void doC() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}

