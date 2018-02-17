package de.michaeldorner;

public class C extends D implements CanC {
	public C() {
		type = Type.C;
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

