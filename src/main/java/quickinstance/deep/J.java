package quickinstance.deep;

import quickinstance.TypeBits;

public class J extends Base2 {
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
