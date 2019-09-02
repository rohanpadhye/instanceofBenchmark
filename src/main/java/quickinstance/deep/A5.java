package quickinstance.deep;

import quickinstance.TypeBits;

public class A5 extends G {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | G.mixID;

	public void doF() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
