package quickinstance.deep;

import quickinstance.TypeBits;

public class J extends Base implements CanJ {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | Base.mixID | CanJ.mixID;
	public J() {
		type = Type.J;
		mix = mixID;
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

	@Override
	public long getMix() { return mixID; }
}
