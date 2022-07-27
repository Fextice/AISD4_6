package ru.vsu.cs.course1;

public class SimpleLinkedListStack<T> extends SimpleLinkedList<T> implements SimpleStack<T> {
    @Override
    public void push(T value) {
        this.addFirst(value);
    }

    @Override
    public T pop() throws Exception {
        T result = this.peek();
        this.removeFirst();
        return result;
    }

    @Override
    public T peek() throws Exception {
        if (this.empty()) {
            throw new Exception("Stack is empty");
        }
        return this.getFirst();
    }

    @Override
    public int count() {
        return super.size();
    }

    @Override
    public boolean empty() {
        return this.count() == 0;
    }
}
