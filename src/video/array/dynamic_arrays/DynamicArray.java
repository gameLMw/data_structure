package video.array.dynamic_arrays;

/*
 * 动态数组
 *
 * */

import java.util.function.Consumer;

public class DynamicArray {
    private int size = 0;//逻辑大小
    private int capacity = 8;//容量
    private int[] array = new int[capacity];


    //添加

    //末尾添加
    //element: 添加的元素
    public void addLast(int element) {
        add(size, element);
    }


    //指定位置添加
    //index: 索引
    //element: 添加的元素
    public void add(int index, int element) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }


    //获取
    //index: 索引
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("index:" + index + " size:" + size);
        }
    }


    //遍历
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
            consumer.accept(array[i]);
        }
    }
}
