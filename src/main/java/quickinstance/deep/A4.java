package quickinstance.deep;

import quickinstance.TypeBits;

public class A4 extends F {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | F.mixID;

	public void doE() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
