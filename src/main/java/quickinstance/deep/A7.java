package quickinstance.deep;

import quickinstance.TypeBits;

public class A7 extends I {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | I.mixID;

	public void doH() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
