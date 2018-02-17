package de.michaeldorner;

public class G extends H implements CanG {
	public G() {
		type = Type.G;
	}

	@Override
	public void doG() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}

	@Override
	public Type getType() { return Type.G; }
}
