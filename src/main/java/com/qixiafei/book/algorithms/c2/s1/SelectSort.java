package com.qixiafei.book.algorithms.c2.s1;

import com.qixiafei.book.algorithms.c2.SortPub;

/**
 * <P>Description: 选择排序. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/1 17:41</P>
 * <P>UPDATE AT: 2019/3/1 17:41</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SelectSort implements SortAlg {


    public void sort(int[] array) {

        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (SortPub.less(array[j], array[min])) min = j;
            }
            SortPub.exch(array, min, i);
        }

    }

    @Override
    public String getName() {
        return "选择排序";
    }
}
