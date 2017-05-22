package stack;

import java.util.List;

public interface Stack<E> {

	void push(E e);

	E top();

	E pop();

	List<E> pop(int n);

	int getSize();

	boolean isEmpty();

	List<E> clear();

	Stack<E> cloneStack();

}
