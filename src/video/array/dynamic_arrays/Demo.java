package video.array.dynamic_arrays;

import org.junit.jupiter.api.Test;

public class Demo {
    @Test
    public void test() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.addLast(5);
        dynamicArray.addLast(6);
        dynamicArray.addLast(7);
        dynamicArray.addLast(8);

//        dynamicArray.addLast(9);

//        System.out.println(dynamicArray.get(4));

        dynamicArray.forEach(element ->
            {System.out.println(element);
            });
    }
}
