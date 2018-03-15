package quickinstance.deep;

import quickinstance.TypeBits;

public class G extends H implements CanG {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | H.mixID | CanG.mixID;
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
