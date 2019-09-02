package quickinstance.deep;

import quickinstance.TypeBits;

public class A0 extends B {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | B.mixID;

	public void doA() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
