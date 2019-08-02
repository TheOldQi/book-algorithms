package com.qixiafei.book.algorithms.c1.s2;

import edu.princeton.cs.algs4.StdDraw;

/**
 * <P>Description: 平面上的点. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/18 14:14</P>
 * <P>UPDATE AT: 2019/2/18 14:14</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Point2D {

    /**
     * 直角坐标系x.
     */
    private double x;

    /**
     * 直角坐标系y.
     */
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    /**
     * 极坐标极径.
     *
     * @return
     */
    public double r() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * 极坐标系极角.
     *
     * @return
     */
    public double theta() {
        return Math.atan2(y, x);
    }

    /**
     * 该点到that点之间的欧几里得距离.
     *
     * @param that
     * @return
     */
    public double distTo(Point2D that) {
        return Math.sqrt(Math.pow(that.x - x, 2) + Math.pow(that.y - y, 2));
    }

    /**
     * 绘制该点.
     *
     * @return
     */
    public void draw() {
        StdDraw.point(x, y);
    }
}
