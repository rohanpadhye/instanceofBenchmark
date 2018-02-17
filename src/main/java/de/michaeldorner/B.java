package de.michaeldorner;

public class B extends C implements CanB {
	public B() {
		type = Type.B;
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
