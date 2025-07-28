package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){

        // 코드 추가
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(Object e, int index){

        // 코드 추가
        if(size == elementData.length){
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    public Object remove(int index){
        Object oldValue = get(index);
        ShiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void ShiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    // 코드 추가
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    // 코드 추가
    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size = " + size + ", capacity = " + elementData.length;
    }
}
