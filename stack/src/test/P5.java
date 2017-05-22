package test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P5 {

	@Test
	public void cloneTest() {
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		Stack<Integer> newStack = stack.cloneStack();
		List<Integer> firstStack = stack.clear();
		List<Integer> resultStack = newStack.clear();
		for (int i = 0; i < firstStack.size(); i++) {
			Assert.assertEquals(firstStack.get(i), resultStack.get(i));
		}
	}

}
