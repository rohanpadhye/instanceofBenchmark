package de.michaeldorner;

public class A extends B implements CanA {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | B.mixID | CanA.mixID;
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
