package quickinstance.shallow;

import quickinstance.TypeBits;

public class A extends Base implements CanA {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanA.mixID;
	public A() {
		type = Type.A;
		mix = mixID;
	}

	@Override
	public void doA() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.A; }
}
