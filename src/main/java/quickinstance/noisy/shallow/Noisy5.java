package quickinstance.noisy.shallow;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
//@Warmup(iterations = 100, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 1000, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(10)
@Warmup(iterations = 10, time = 200, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class Noisy5 {

	private Base base;
	private List<Base> classes = Arrays.asList(new A(), new B(), new C(), new D(), new E());;
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
	public void baseline5() {
		base.i = 1;
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
		}
		assert base.i == -1;
	}

	private static boolean sub(long type, long mix) {
		return (type & mix) == type;
	}

	@Benchmark
	public void failfast10() {
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
		}
		assert base.i == -1;
	}

}
