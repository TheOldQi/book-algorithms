package com.qixiafei.book.algorithms.c1.s4;

import edu.princeton.cs.algs4.DoublingTest;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/19 15:24</P>
 * <P>UPDATE AT: 2019/2/19 15:24</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Test {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            double b = DoublingTest.timeTrial(1000);
            System.out.println(b);

        }

        for(int i=0;i<10;i++){
            double c = DoublingTest.timeTrial(2000);
            System.out.println(c);

        }
//        double d = DoublingTest.timeTrial(8000);
//        System.out.println(d);
    }
}
