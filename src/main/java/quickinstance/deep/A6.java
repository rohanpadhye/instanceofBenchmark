package quickinstance.deep;

import quickinstance.TypeBits;

public class A6 extends H {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | H.mixID;

	public void doG() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
