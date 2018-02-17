package de.michaeldorner;

public class F extends G implements CanF {
	public F() {
		type = Type.F;
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
