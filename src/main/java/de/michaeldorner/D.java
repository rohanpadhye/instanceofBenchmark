package de.michaeldorner;

public class D extends E implements CanD {
	public D() {
		type = Type.D;
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
