package de.michaeldorner;

public class B extends C implements CanB {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | C.mixID | CanB.mixID;
	public B() {
		type = Type.B;
		mix = mixID;
	}

	@Override
	public void doB() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.B; }
}
