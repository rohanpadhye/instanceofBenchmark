package quickinstance.deep;

import quickinstance.TypeBits;

public class A1 extends C {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | C.mixID;

	public void doB() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
