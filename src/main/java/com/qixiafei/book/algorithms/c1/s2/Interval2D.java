package com.qixiafei.book.algorithms.c1.s2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * <P>Description: 平面商的二位间隔的API. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/18 15:23</P>
 * <P>UPDATE AT: 2019/2/18 15:23</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Interval2D {

    private Interval1D x;
    private Interval1D y;

    public Interval2D(Interval1D x, Interval1D y) {

        this.x = x;
        this.y = y;
    }

    /**
     * 二维间隔的面积.
     *
     * @return
     */
    public double area() {
        return x.length() * y.length();
    }

    /**
     * 判断平面商的点是否在间隔范围内.
     *
     * @param p
     * @return
     */
    public boolean contains(Point2D p) {

        return x.contains(p.x()) && y.contains(p.y());
    }

    /**
     * 该二位间隔是否与that相交.
     *
     * @param that
     * @return
     */
    public boolean intersect(Interval2D that) {
        return x.intersect(that.x) && y.intersect(that.y);
    }

    public void draw() {
        double xc = (x.getLo() + x.getHi()) / 2.0;
        double yc = (y.getLo() + y.getHi()) / 2.0;
        StdDraw.rectangle(xc, yc, x.length() / 2.0, y.length() / 2.0);
    }

    public static void main(String[] args) {
        Interval1D xInterval = new Interval1D(0.2, 0.5);
        Interval1D yInterval = new Interval1D(0.5, 0.6);
        Interval2D interval2D = new Interval2D(xInterval, yInterval);
        interval2D.draw();

        Counter c = new Counter("hits");
        for (int t = 0; t < 10000; t++) {
            Point2D p = new Point2D(Math.random(), Math.random());
            p.draw();
            if (interval2D.contains(p)) c.increment();
            else p.draw();
        }

        StdOut.println(c);
        StdOut.println(interval2D.area());
    }
}
