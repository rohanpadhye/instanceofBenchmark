package de.michaeldorner;

public class D extends E implements CanD {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | E.mixID | CanD.mixID;
	public D() {
		type = Type.D;
		mix = mixID;
	}

	@Override
	public void doD() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.D; }
}
