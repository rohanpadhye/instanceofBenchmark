package quickinstance.shallow;

import quickinstance.TypeBits;

public class F extends Base implements CanF {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanF.mixID;
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
