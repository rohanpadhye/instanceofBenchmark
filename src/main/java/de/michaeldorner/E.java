package de.michaeldorner;

public class E extends F implements CanE {
	public E() {
		type = Type.E;
	}

	@Override
	public void doE() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.E; }
}
