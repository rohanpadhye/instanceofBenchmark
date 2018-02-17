package de.michaeldorner;

public class A extends B implements CanA {
	public A() {
		type = Type.A;
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
