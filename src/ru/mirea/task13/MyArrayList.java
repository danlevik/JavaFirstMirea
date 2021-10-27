package ru.mirea.task13;


import java.util.Arrays;

public class MyArrayList<T> {
    private final int BASE_SIZE = 8;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[BASE_SIZE];
    private int pointer = 0;

    // добавление в конец массива
    public void add(T item){
        if (pointer == array.length - 1)
            resize(array.length*2);
        array[pointer] = item;
        pointer++;
    }

    // добавление по индексу
    public void add(int index,T item){
        if (index == pointer){
            add(item);
        }
        else if (index < pointer && index >= 0) {
            if (pointer == array.length - 1)
                resize(array.length * 2);
            pointer++;
            Object[] rightArray = Arrays.copyOfRange(array, index, array.length);
            array[index] = item;
            for (int i = index + 1; i < array.length; i++)
                array[i] = rightArray[i - (index + 1)];
        }
        else{
            System.out.println("Index out of range.");
        }
    }


    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > BASE_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
    }

    public void set(int index, T item){
        if (index < pointer && index >= 0)
            array[index] = item;
        else{
            System.out.println("Index out of range.");
        }
    }

    public T get(int index){
        return (T) array[index];
    }

    private void resize(int resizeLength) {
        Object[] resizedArray = new Object[resizeLength];
        System.arraycopy(array, 0, resizedArray, 0, pointer);
        array = resizedArray;
    }


    @Override
    public String toString() {
        String arrItems = "[ ";
        for (int i = 0; i < pointer; i++){
            arrItems += array[i] + ", ";
        }
        arrItems += "/";
        arrItems = arrItems.replace(", /", " ]");
        return arrItems;
    }
}
