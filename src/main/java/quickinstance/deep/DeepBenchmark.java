package quickinstance.deep;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
//@Warmup(iterations = 100, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 1000, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(10)
@Warmup(iterations = 10, time = 200, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class DeepBenchmark {

	private Base base;
	private List<Base> classes = Arrays.asList(new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(), new I(), new J());;
	private Random random = new Random();

	@Setup(Level.Trial)
	public void setup() {
		setNewClass();
	}

	@Setup(Level.Invocation)
	public void setNewClass() {
		int index = 2;//random.nextInt(classes.size());
		base = classes.get(index);
	}

	@Benchmark
	public void measureINSTANCEOF_class() {
		base.i = 1;
		/* if (base instanceof A) {
			((A) base).doA();
		} else */ if (base instanceof B) {
			((B) base).doB();
		} /* else if (base instanceof C) {
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
		} */ else { base.i = -1; } /* if (base instanceof J) {
			((J) base).doJ();
		}*/
		assert base.i == -1;
	}

	private static boolean sub(long type, long mix) {
		return (type & mix) == type;
	}

	@Benchmark
	public void measureINSTANCEOF_class_getMix() {
		base.i = 1;
		long mix = base.getMix();
		if (sub(A.typeID, mix) && base instanceof A) {
			((A) base).doA();
		} else if (sub(B.typeID, mix) && base instanceof B) {
			((B) base).doB();
		} else if (sub(C.typeID, mix) && base instanceof C) {
			((C) base).doC();
		} else if (sub(D.typeID, mix) && base instanceof D) {
			((D) base).doD();
		} else if (sub(E.typeID, mix) && base instanceof E) {
			((E) base).doE();
		} else if (sub(F.typeID, mix) && base instanceof F) {
			((F) base).doF();
		} else if (sub(G.typeID, mix) && base instanceof G) {
			((G) base).doG();
		} else if (sub(H.typeID, mix) && base instanceof H) {
			((H) base).doH();
		} else if (sub(I.typeID, mix) && base instanceof I) {
			((I) base).doI();
		} else if (sub(J.typeID, mix) && base instanceof J) {
			((J) base).doJ();
		}
		assert base.i == -1;
	}



}
