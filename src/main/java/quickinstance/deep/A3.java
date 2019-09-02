package quickinstance.deep;

import quickinstance.TypeBits;

public class A3 extends E {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | E.mixID;

	public void doD() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
