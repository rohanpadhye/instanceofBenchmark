package quickinstance.deep;

import quickinstance.TypeBits;

public class A9 extends Base1 {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID;

	public void doJ() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public long getMix() { return mixID; }
}
