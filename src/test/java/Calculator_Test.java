import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Calculator_Test {
	Calculator calculator = new Calculator();

	@Test
	public void mutliplyTestas_TeigiamiSkaiciai() {
		int ats = calculator.Mutliply(2, 2);
		assertEquals(4, ats);
	}

	@Test
	public void mutliplyTestas_NeigiamiSkaiciai() {
		int ats = calculator.Mutliply(-1, -2);
		assertEquals(2, ats);
	}

	@Test
	public void increesmentTestas_Teigiami() {
		int ats = calculator.increment(2);
		assertEquals(3, ats);
	}

	@Test
	public void incrementTestas_NeigiamiSkaiciai() {
		int ats = calculator.increment(-2);
		assertEquals(-1, ats);
	}

	@Test
	public void SumTestas_TeigiamiSkaiciai() {
		int ats = calculator.Sum(2, 2);
		assertEquals(4, ats);
	}

	@Test
	public void SumTestas_NeigiamiSkaiciai() {
		int ats = calculator.Sum(-1, -2);
		assertEquals(-3, ats);
	}

	@Test
	public void SubtractTestas_TeigiamiSkaiciai() {
		int ats = calculator.Subtract(2, 2);
		assertEquals(0, ats);
	}

	@Test
	public void SubtractTestas_NeigiamiSkaiciai() {
		int ats = calculator.Subtract(-1, -2);
		assertEquals(1, ats);
	}

	@Test
	public void divideTestas_TeigiamiSkaiciai() {
		int ats = calculator.divide(2, 2);
		assertEquals(1, ats);
	}

	@Test
	public void divideTestas_NeigiamiSkaiciai() {
		int ats = calculator.divide(-1, -2);
		assertEquals(0, ats);
	}
}
