package com.qixiafei.book.algorithms.c1.s5;

import java.util.Arrays;

/**
 * <P>Description: 动态连通性 - 快速查找算法.
 * 特点：每次union若已连通则访问2次数组，否则至少访问n+2+x次数组，其中n是扫描数组判断是否需要归并，2是找到p和q的触点所在分量，x是将分量为q的归并到p上的赋值操作，
 * 极端情况是n-1个触点都在q上，则需访问数组n+2+n-1 = 2n+1次数组。
 * union的时间复杂度2N
 * find的时间复杂度1</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/20 11:54</P>
 * <P>UPDATE AT: 2019/2/20 11:54</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class QuickFindUf implements Uf {

    /**
     * 保存触点id所在分量的数组.
     */
    private int[] ids;

    /**
     * 分量总数.
     */
    private int count;

    public QuickFindUf(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
        count = n;
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        int total = 2;
        if (pId != qId) {
            for (int i = 0, n = ids.length; i < n; i++) {
                total += 1;
                if (ids[i] == qId) {
                    total += 1;
                    ids[i] = pId;
                }
            }
            count--;
        }

        System.out.printf("访问数组%d次\n", total);
        System.out.printf("当前数组内容=%s\n", Arrays.toString(ids));
    }

    @Override
    public int find(int p) {
        validate(p, ids.length);
        return ids[p];
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
