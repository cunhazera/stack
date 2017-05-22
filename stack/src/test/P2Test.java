package test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P2Test {

	@Test
	public void p2Test() {
		Stack<Integer> stack = new ArrayStack<Integer>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		List<Integer> result = stack.pop(3);
		Assert.assertEquals(result.get(0), new Integer(4));
		Assert.assertEquals(result.get(1), new Integer(3));
		Assert.assertEquals(result.get(2), new Integer(2));
	}

}
