package quickinstance.noisy.shallow;

import quickinstance.TypeBits;

public abstract class Base implements Left1, Left2, Left3, Left4, Left5, Right1, Right2, Right3, Right4, Right5 {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Left1.mixID | Left2.mixID | Left3.mixID | Left5.mixID | Left5.mixID |
			Right1.mixID | Right2.mixID | Right3.mixID | Right4.mixID | Right5.mixID;

	protected int i = 1;
	protected Type type;
	protected long mix;

	public Base() {
		mix = mixID;
	}

	public abstract void doSomething();

	public abstract Type getType();

	public abstract long getMix();
}
