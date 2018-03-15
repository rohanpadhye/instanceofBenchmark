package quickinstance.deep;

import quickinstance.TypeBits;

public class F extends G implements CanF {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | G.mixID | CanF.mixID;
	public F() {
		type = Type.F;
		mix = mixID;
	}

	@Override
	public void doF() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.F; }
}
