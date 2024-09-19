package edu.grinnell.csc207.util;

public class Box<T> {
    T value;

    public Box(T initialValue) {
        this.set(initialValue);
    }
    public T get() {
        return this.value; 
    }
    public void set(T newValue) {
        this.value = newValue;
    }
}
