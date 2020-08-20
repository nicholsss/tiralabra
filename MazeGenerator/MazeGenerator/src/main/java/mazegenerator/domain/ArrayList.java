/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

/**
 *
 * @author nicholas
 */
public class ArrayList<T> {

    private T[] list;
    private int count;

    public ArrayList() {
        this.list = (T[]) new Object[10];
        this.count = 0;
    }

    public void add(T value) {
        if (this.count == this.list.length) {
            increaseSize();
        }
        this.list[this.count] = value;
        this.count++;
    }

    public void increaseSize() {
        int newSize = this.list.length + this.list.length / 2;
        T[] newList = (T[]) new Object[newSize];

        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }

    public int size() {

        return this.count;
    }

    public T get(int k) {
        return list[k];
    }

    public boolean isEmpty() {
        boolean value = false;
        if (count == 0) {
            value = true;
        }
        return value;
    }

}
