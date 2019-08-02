package com.qixiafei.book.algorithms.c1.s5.practice;

import com.qixiafei.book.algorithms.c1.s5.QuickUnionUf;
import com.qixiafei.book.algorithms.c1.s5.Uf;
import com.qixiafei.book.algorithms.c1.s5.WeightedQuickUnionUf;
import org.springframework.util.StopWatch;

import java.util.Scanner;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/20 11:23</P>
 * <P>UPDATE AT: 2019/2/20 11:23</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class P151 {

    //9-0 3-4 5-8 7-2 2-1 5-7 0-3 4-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入触点数量");
        int n = Integer.parseInt(sc.nextLine());
        Uf alg = new WeightedQuickUnionUf(n);
        System.out.println("请输入连接点序列，连接点中间用-分割，序列组之间用空格分隔");
        String line = sc.nextLine();
        String[] groups = line.split(" ");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (String group : groups) {
            alg.union(Integer.parseInt(group.split("-")[0]), Integer.parseInt(group.split("-")[1]));
        }
        stopWatch.stop();
        System.out.println(stopWatch.shortSummary());
    }
}
