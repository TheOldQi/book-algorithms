package com.qixiafei.book.algorithms.c1.s5;

import java.util.Arrays;

/**
 * <P>Description: 加权动态连通性算法. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/25 10:15</P>
 * <P>UPDATE AT: 2019/2/25 10:15</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WeightedQuickUnionUf implements Uf {

    private int[] ids;
    private int[] weight;
    private int count;

    public WeightedQuickUnionUf(int n) {
        ids = new int[n];
        weight = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            ids[i] = i;
            weight[i] = 1;
        }

    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int m = find(q);
        if (i == m) return;
        int x = weight[i];
        int y = weight[m];
        int total = x + y;
        if (x > y) {

            ids[m] = i;
            weight[i] = total;
        } else {
            ids[i] = m;
            weight[m] = total;
        }
        count--;
        System.out.printf("union 额外访问数组4次，当前数组%s，权重%s\n", Arrays.toString(ids), Arrays.toString(weight));
    }

    @Override
    public int find(int p) {
        validate(p, ids.length);
        int index = p;
        int vector;
        int total = 0;
        while (true) {
            total += 1;
            vector = ids[index];
            if (vector == index) {
                System.out.printf("find%d 共访问数组 %d 次\t", p, total);
                return vector;
            }
            index = vector;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
