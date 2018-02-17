package de.michaeldorner;

public class I extends J implements CanI {
	public I() {
		type = Type.I;
	}

	@Override
	public void doI() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.I; }
}
