package com.qixiafei.book.algorithms.c2;

import java.util.Arrays;
import java.util.Random;

/**
 * <P>Description: 排序通用方法. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/1 17:17</P>
 * <P>UPDATE AT: 2019/3/1 17:17</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SortPub {

    /**
     * 判断a是否小于b;
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean less(int a, int b) {
        return a < b;
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        disruptArray(arr);
        System.out.println(Arrays.toString(arr));
        int[] ints = notOrderArray(n);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 生成无序数组.
     *
     * @param n 数组大小
     * @return 元素处于1-n的随机数组，可能有重复
     */
    public static int[] notOrderArray(int n) {
        final int[] result = new int[n];
        final Random ran = new Random();
        for (int i = 0; i < n; i++) {
            result[i] = ran.nextInt(n);
        }
        return result;
    }

    /**
     * 生成无序数组.
     *
     * @param n 数组大小
     * @return 元素处于1-n的随机数组，不会有重复
     */
    public static int[] notOrderWithOutDupArray(int n) {
        final int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }


        return result;
    }


    /**
     * 打乱数组顺序.
     *
     * @param array 有序数据
     */
    public static void disruptArray(int[] array) {
        if (!isOrder(array)) {
            throw new IllegalArgumentException("数组必须有序");
        }
        final Random ran = new Random();
        for (int i = 0, len = array.length; i < len; i++) {
            exch(array, i, ran.nextInt(len));
        }
    }

    /**
     * 判断数组是否有序.
     *
     * @param array 待检查数组.
     * @return true-有序，false-无序
     */
    public static boolean isOrder(int[] array) {
        for (int i = 1, len = array.length; i < len; i++) {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }

    /**
     * 交换两个元素在数组中的位置.
     *
     * @param array 数组
     * @param i     位置i
     * @param j     位置j
     */
    public static void exch(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
