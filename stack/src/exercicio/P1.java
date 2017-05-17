package exercicio;

import stack.ArrayStack;
import stack.Stack;

public class P1 {

	public Stack<Integer> toStack(int[] n) {
		Stack<Integer> stack = new ArrayStack<Integer>(n.length);
		for (int i : n) {
			stack.push(i);
		}
		return stack;
	}

}
