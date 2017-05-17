package exercicio;

import org.junit.Test;

import java.util.List;

import org.junit.Assert;
import stack.Stack;

public class P1Test {

	private P1 p = new P1();

	@Test
	public void testStackFromArray() {
		int[] n = { 1, 2, 3 };
		Stack<Integer> result = p.toStack(n);
		Assert.assertEquals(result.top(), new Integer(3));
		Assert.assertEquals(result.getSize(), 3);
	}

	@Test
	public void testPopN() {
		int[] n = { 1, 2, 3 };
		Stack<Integer> stack = p.toStack(n);
		List<Integer> result = stack.pop(2);
		Assert.assertEquals(result.get(0), new Integer(3));
		Assert.assertEquals(result.get(1), new Integer(2));
	}
	
	@Test
	public void testPopOut() {
		int[] n = { 1, 2, 3 };
		Stack<Integer> stack = p.toStack(n);
		List<Integer> result = stack.pop(5);
		Assert.assertEquals(result.get(0), new Integer(3));
		Assert.assertEquals(result.get(1), new Integer(2));
		Assert.assertEquals(result.get(2), new Integer(1));
	}

}
