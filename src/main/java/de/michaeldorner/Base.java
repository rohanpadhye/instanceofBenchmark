package de.michaeldorner;

public abstract class Base {
	protected int i = 1;
	protected Type type;

	public Base() {
	}

	public abstract void doSomething();

	public abstract Type getType();
}
