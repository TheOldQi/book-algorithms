package com.qixiafei.book.algorithms.c2.s1;

/**
 * <P>Description: 插入排序. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/1 18:18</P>
 * <P>UPDATE AT: 2019/3/1 18:18</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class InsertSort implements SortAlg {


    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int rightIndex = i;
            for (int j = i - 1; j >= 0 && temp < arr[j]; j--) {
                rightIndex = j;
            }

            insertIndex(rightIndex, i, arr);
        }
    }

    @Override
    public String getName() {
        return "插入排序";
    }

    /**
     * 将位于i的元素，插入到正确的地方，插入地方到i-1的元素统一右移一位.
     *
     * @param rightIndex 正确位置
     * @param i          原来位置
     * @param arr
     */
    private static void insertIndex(int rightIndex, int i, int[] arr) {
        if (rightIndex == i) {
            return;
        }
        int temp = arr[i];
        System.arraycopy(arr, rightIndex, arr, rightIndex + 1, i - rightIndex);
        arr[rightIndex] = temp;
    }
}
