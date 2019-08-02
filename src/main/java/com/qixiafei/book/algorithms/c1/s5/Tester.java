package com.qixiafei.book.algorithms.c1.s5;

import org.springframework.util.StopWatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/20 12:13</P>
 * <P>UPDATE AT: 2019/2/20 12:13</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Tester {
    public static void main(String[] args) {
    }

    public static void fromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\code\\self\\book-algorithms\\algs4-data\\algs4-data\\largeUF.txt"))) {
            String line;
            List<String> content = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                content.add(line);
            }
            int n = Integer.parseInt(content.get(0));
            StopWatch stopWatch = new StopWatch();
            Uf alg = new WeightedQuickUnionUf(n);
            stopWatch.start();
            for (int i = 1, len = content.size(); i < len; i++) {
                String s = content.get(i);

                alg.union(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1]));
            }
            stopWatch.stop();
            System.out.println(stopWatch.shortSummary());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
