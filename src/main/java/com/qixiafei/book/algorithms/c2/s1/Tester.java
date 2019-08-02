package com.qixiafei.book.algorithms.c2.s1;

import com.qixiafei.book.algorithms.c2.SortPub;
import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/1 18:25</P>
 * <P>UPDATE AT: 2019/3/1 18:25</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Tester {

    public static void main(String[] args) {
        int n = 1000;
        for (int j = 1; j < 5; j++, n *= 10) {
            System.out.println("问题规模=" + n);
            int[] ints = SortPub.notOrderArray(n);

            SortAlg sortAlg = new SelectSort();
            SortAlg sortAlg2 = new InsertSort();
            for (int i = 0; i < 10; i++) {
                sort(ints.clone(), sortAlg);
                sort(ints.clone(), sortAlg2);
            }
        }


    }

    public static void sort(int[] arr, SortAlg alg) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        alg.sort(arr);
        stopWatch.stop();
        System.out.println(alg.getName() + " " + stopWatch.shortSummary());
        if (!SortPub.isOrder(arr)) {
            System.out.println("排序失败，排序后数组:" + Arrays.toString(arr));
        }
    }
}
