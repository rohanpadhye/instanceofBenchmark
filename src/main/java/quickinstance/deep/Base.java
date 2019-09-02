package quickinstance.deep;

import quickinstance.TypeBits;

public abstract class Base {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID;

	protected int i = 1;

	public abstract void doSomething();

	public abstract long getMix();
}
