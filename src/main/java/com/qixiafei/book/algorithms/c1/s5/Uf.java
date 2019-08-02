package com.qixiafei.book.algorithms.c1.s5;

/**
 * <P>Description: union-find算法.
 * 动态连通性，一次可以连接两个触点，则与此两个触点相连的触点也都变成连通触点</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/20 10:41</P>
 * <P>UPDATE AT: 2019/2/20 10:41</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Uf {


    /**
     * 将触点p和触点q连接.
     */
    void union(int p, int q);

    /**
     * 触点p所在分量的标识符.
     */
    int find(int p);

    /**
     * 判断触点p和q是否连通.
     */
    boolean connected(int p, int q);

    /**
     * 连通分量的总数.
     */
    int count();

    default void validate(int id, int n) {
        if (id < 0 || id > n) {
            throw new IllegalArgumentException("id 必须处于0到" + (n - 1) + "之间");
        }
    }
}
