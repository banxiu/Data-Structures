package dynamicarray;

/**
 * @program: Data-Structures
 * @description:
 * @author: Wangly
 * @create: 2021-03-05 15:28
 */
public class DynamicArray {
    /**
     * 元素数量
     */
    private int size;
    /**
     * 所有的元素
     */
    private int[] elements;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;

    public DynamicArray(int capaticy) {
        capaticy = Math.max(capaticy, DEFAULT_CAPACITY);
        elements = new int[capaticy];
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 是否为空
     */
    public boolean isEmpity() {
        return size == 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index:"+ index + ",Size:" + size);
        }
        return elements[index];
    }

    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    public int set(int index, int element) {
        rangeCheck(index);

        int old = elements[index];
        elements[index] = element;
        return old;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }
    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }
    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 清除所有元素
     */
    public void clear() {
        size = 0;
    }

    public void add() {
        
    }
}