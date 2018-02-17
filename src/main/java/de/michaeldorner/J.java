package de.michaeldorner;

public class J extends Base implements CanJ {
	public J() {
		type = Type.J;
	}

	@Override
	public void doJ() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.J; }
}
