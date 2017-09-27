package com.codecool.collections.stack.stack;

public class IntegerStack {
    private int[] intArray;
    private int[] stackMaximums;
    private int numOfElements;
    private int actualMaximum;

    public IntegerStack() {
        intArray = new int[5];
        stackMaximums = new int[5];
        numOfElements = 0;
        actualMaximum = 0;
    }

    public void push(int number) {
        if (intArray.length >= numOfElements) {
            intArray = createNewArray(intArray);
            stackMaximums = createNewArray(stackMaximums);
        }
        intArray[numOfElements] = number;
        findMaximum(number);
        numOfElements++;
        if (numOfElements == 1) {
            actualMaximum = number;
        }
    }

    public int pop() {
        if (numOfElements > 0) {
            return intArray[--numOfElements];
        }
        return -1;
    }

    public int max() {
        if (numOfElements > 0) {
            return stackMaximums[--numOfElements];
        }
        return -1;
    }

    private int[] createNewArray(int[] arr) {
        int[] newArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    private void findMaximum(int number) {
        if (number > actualMaximum) {
            actualMaximum = number;
        }
        stackMaximums[numOfElements] = actualMaximum;
    }
}
