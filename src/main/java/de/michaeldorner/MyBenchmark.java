package de.michaeldorner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 100, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1000, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(10)
@State(Scope.Benchmark)
public class MyBenchmark {

	private Base base;
	private List<Base> classes = Arrays.asList(new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(), new I(), new J());;
	private Random random = new Random();

	@Setup(Level.Trial)
	public void setup() {
		setNewClass();
	}

	@Setup(Level.Invocation)
	public void setNewClass() {
		int index = random.nextInt(classes.size());
		base = classes.get(index);
	}

	@Benchmark
	public void measureINSTANCEOF() {
		if (base instanceof A) {
			((A) base).doA();
		} else if (base instanceof B) {
			((B) base).doB();
		} else if (base instanceof C) {
			((C) base).doC();
		} else if (base instanceof D) {
			((D) base).doD();
		} else if (base instanceof E) {
			((E) base).doE();
		} else if (base instanceof F) {
			((F) base).doF();
		} else if (base instanceof G) {
			((G) base).doG();
		} else if (base instanceof H) {
			((H) base).doH();
		} else if (base instanceof I) {
			((I) base).doI();
		} else if (base instanceof J) {
			((J) base).doJ();
		}
	}


	@Benchmark
	public void measureINSTANCEOF_interface() {
		if (base instanceof CanA) {
			((CanA) base).doA();
		} else if (base instanceof CanB) {
			((CanB) base).doB();
		} else if (base instanceof CanC) {
			((CanC) base).doC();
		} else if (base instanceof CanD) {
			((CanD) base).doD();
		} else if (base instanceof CanE) {
			((CanE) base).doE();
		} else if (base instanceof CanF) {
			((CanF) base).doF();
		} else if (base instanceof CanG) {
			((CanG) base).doG();
		} else if (base instanceof CanH) {
			((CanH) base).doH();
		} else if (base instanceof CanI) {
			((CanI) base).doI();
		} else if (base instanceof CanJ) {
			((CanJ) base).doJ();
		}
	}

	@Benchmark
	public void measureOO() {
		base.doSomething();
	}

	// @Benchmark -- incorrect, because it does not consider chains of derivation
	public void measureGETTYPE() {
		switch (base.getType()) {
			case A:
				((A) base).doA();
				break;
			case B:
				((B) base).doB();
				break;
			case C:
				((C) base).doC();
				break;
			case D:
				((D) base).doD();
				break;
			case E:
				((E) base).doE();
				break;
			case F:
				((F) base).doF();
				break;
			case G:
				((G) base).doG();
				break;
			case H:
				((H) base).doH();
				break;
			case I:
				((I) base).doI();
				break;
			case J:
				((J) base).doJ();
				break;
			default:
				break;
		}
	}

	// @Benchmark -- incorrect, because it does not consider chains of derivation
	public void measureTYPE() {
		switch (base.type) {
		case A:
			((A) base).doA();
			break;
		case B:
			((B) base).doB();
			break;
		case C:
			((C) base).doC();
			break;
		case D:
			((D) base).doD();
			break;
		case E:
			((E) base).doE();
			break;
		case F:
			((F) base).doF();
			break;
		case G:
			((G) base).doG();
			break;
		case H:
			((H) base).doH();
			break;
		case I:
			((I) base).doI();
			break;
		case J:
			((J) base).doJ();
			break;
		default:
			break;
		}
	}

	@Benchmark
	public void measureGETCLASS() {
		if (A.class.isAssignableFrom(base.getClass())) {
			((A) base).doA();
		} else if (B.class.isAssignableFrom(base.getClass())) {
			((B) base).doB();
		} else if (C.class.isAssignableFrom(base.getClass())) {
			((C) base).doC();
		} else if (D.class.isAssignableFrom(base.getClass())) {
			((D) base).doD();
		} else if (E.class.isAssignableFrom(base.getClass())) {
			((E) base).doE();
		} else if (F.class.isAssignableFrom(base.getClass())) {
			((F) base).doF();
		} else if (G.class.isAssignableFrom(base.getClass())) {
			((G) base).doG();
		} else if (H.class.isAssignableFrom(base.getClass())) {
			((H) base).doH();
		} else if (I.class.isAssignableFrom(base.getClass())) {
			((I) base).doI();
		} else if (J.class.isAssignableFrom(base.getClass())) {
			((J) base).doJ();
		}
	}


	@Benchmark
	public void measureGETCLASS_interface() {
		if (CanA.class.isAssignableFrom(base.getClass())) {
			((CanA) base).doA();
		} else if (B.class.isAssignableFrom(base.getClass())) {
			((CanB) base).doB();
		} else if (CanC.class.isAssignableFrom(base.getClass())) {
			((CanC) base).doC();
		} else if (CanD.class.isAssignableFrom(base.getClass())) {
			((CanD) base).doD();
		} else if (CanE.class.isAssignableFrom(base.getClass())) {
			((CanE) base).doE();
		} else if (CanF.class.isAssignableFrom(base.getClass())) {
			((CanF) base).doF();
		} else if (CanG.class.isAssignableFrom(base.getClass())) {
			((CanG) base).doG();
		} else if (CanH.class.isAssignableFrom(base.getClass())) {
			((CanH) base).doH();
		} else if (CanI.class.isAssignableFrom(base.getClass())) {
			((CanI) base).doI();
		} else if (CanJ.class.isAssignableFrom(base.getClass())) {
			((CanJ) base).doJ();
		}
	}
}
