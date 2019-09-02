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
public class LinearDeepBenchmark {

	private Base base;
	private List<Base> classes = Arrays.asList(new A0(), new A1(), new A2(), new A3(), new A4(), new A5(), new A6(), new A7(), new A8(), new A9());
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
		/* if (base instanceof A0) {
			((A0) base).doA();
		} else */ if (base instanceof A1) {
			((A1) base).doB();
		} /* else if (base instanceof A2) {
			((A2) base).doC();
		} else if (base instanceof A3) {
			((A3) base).doD();
		} else if (base instanceof A4) {
			((A4) base).doE();
		} else if (base instanceof A5) {
			((A5) base).doF();
		} else if (base instanceof A6) {
			((A6) base).doG();
		} else if (base instanceof A7) {
			((A7) base).doH();
		} else if (base instanceof A8) {
			((A8) base).doI();
		} */ else { base.i = -1; } /* if (base instanceof A9) {
			((A9) base).doJ();
		} */
		assert base.i == -1;
	}


	private static boolean sub(long type, long mix) {
		return (type & mix) == type;
	}

	@Benchmark
	public void measureINSTANCEOF_class_getMix() {
		base.i = 1;
		long mix = base.getMix();
		if (sub(A0.typeID, mix) && base instanceof A0) {
			((A0) base).doA();
		} else if (sub(A1.typeID, mix) && base instanceof A1) {
			((A1) base).doB();
		} else if (sub(A2.typeID, mix) && base instanceof A2) {
			((A2) base).doC();
		} else if (sub(A3.typeID, mix) && base instanceof A3) {
			((A3) base).doD();
		} else if (sub(A4.typeID, mix) && base instanceof A4) {
			((A4) base).doE();
		} else if (sub(A5.typeID, mix) && base instanceof A5) {
			((A5) base).doF();
		} else if (sub(A6.typeID, mix) && base instanceof A6) {
			((A6) base).doG();
		} else if (sub(A7.typeID, mix) && base instanceof A7) {
			((A7) base).doH();
		} else if (sub(A8.typeID, mix) && base instanceof A8) {
			((A8) base).doI();
		} else if (sub(A9.typeID, mix) && base instanceof A9) {
			((A9) base).doJ();
		}
		assert base.i == -1;
	}




}
