package com.qixiafei.book.algorithms.c1.s5;

import java.util.Arrays;

/**
 * <P>Description: 快速连接算法. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/21 10:38</P>
 * <P>UPDATE AT: 2019/2/21 10:38</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class QuickUnionUf implements Uf {

    private int[] ids;
    private int count;

    public QuickUnionUf(int n) {
        ids = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pVector = find(p);

        int qVector = find(q);
        if (pVector == qVector) return;
        ids[pVector] = qVector;
        count--;
        System.out.printf("union 额外访问数组一次，当前数组%s\n", Arrays.toString(ids));
    }

    @Override
    public int find(int p) {
        validate(p, ids.length);
        int idx = p;
        int vector;
        int total = 0;
        while (true) {
            total++;
            vector = ids[idx];
            if (vector == idx) {
                System.out.printf("find访问数组%d次\t", total);
                return vector;
            }
            idx = vector;
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
