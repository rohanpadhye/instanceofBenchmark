package quickinstance.deep;

import quickinstance.TypeBits;

public class H extends I implements CanH {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | I.mixID | CanH.mixID;
	public H() {
		type = Type.H;
		mix = mixID;
	}

	@Override
	public void doH() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.H; }

	@Override
	public long getMix() { return mixID; }
}
