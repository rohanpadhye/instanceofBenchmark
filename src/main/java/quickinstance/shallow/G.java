package quickinstance.shallow;

import quickinstance.TypeBits;

public class G extends Base implements CanG {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanG.mixID;
	public G() {
		type = Type.G;
		mix = mixID;
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
