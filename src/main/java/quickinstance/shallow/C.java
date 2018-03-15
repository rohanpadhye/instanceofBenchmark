package quickinstance.shallow;

import quickinstance.TypeBits;

public class C extends Base implements CanC {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanC.mixID;
	public C() {
		type = Type.C;
		mix = mixID;
	}

	@Override
	public void doC() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.C; }
}

