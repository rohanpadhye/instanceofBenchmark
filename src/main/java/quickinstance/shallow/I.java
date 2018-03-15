package quickinstance.shallow;

import quickinstance.TypeBits;

public class I extends Base implements CanI {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanI.mixID;
	public I() {
		type = Type.I;
		mix = mixID;
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
