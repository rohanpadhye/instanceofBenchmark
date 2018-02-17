package de.michaeldorner;

public class H extends I implements CanH {
	public H() {
		type = Type.H;
	}

	@Override
	public void doH() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.H; }
}
