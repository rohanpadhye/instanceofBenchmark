package quickinstance.deep;

import quickinstance.TypeBits;

public class E extends F implements CanE {
	static long typeID = TypeBits.freshID();
	static long mixID = typeID | F.mixID | CanE.mixID;
	public E() {
		type = Type.E;
		mix = mixID;
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

	@Override
	public long getMix() { return mixID; }
}
