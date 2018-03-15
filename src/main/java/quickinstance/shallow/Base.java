package quickinstance.shallow;

import quickinstance.TypeBits;

public abstract class Base {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID;

	protected int i = 1;
	protected Type type;
	protected long mix;

	public Base() {
		mix = mixID;
	}

	public abstract void doSomething();

	public abstract Type getType();
}
