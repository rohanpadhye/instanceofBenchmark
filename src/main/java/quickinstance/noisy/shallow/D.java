package quickinstance.noisy.shallow;

import quickinstance.TypeBits;

public class D extends Base implements CanD {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanD.mixID;
	public D() {
		type = Type.D;
		mix = mixID;
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

	@Override
	public long getMix() { return mixID; }
}
