package com.qixiafei.book.algorithms.c1.s2;

/**
 * <P>Description: 直线上间隔. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/18 15:05</P>
 * <P>UPDATE AT: 2019/2/18 15:05</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Interval1D {

    /**
     * 低值.
     */
    private double lo;

    /**
     * 高值.
     */
    private double hi;

    public double getLo() {
        return lo;
    }

    public double getHi() {
        return hi;
    }

    public Interval1D(double lo, double hi) {
        this.lo = lo;
        this.hi = hi;
    }

    /**
     * 间隔长度.
     *
     * @return
     */
    public double length() {
        return hi - lo;
    }

    /**
     * 判断x是否在间隔内.
     *
     * @param x
     * @return
     */
    public boolean contains(double x) {
        return (x >= lo) && (x <= hi);
    }

    /**
     * 判断间隔是否有交叉.
     *
     * @param that
     * @return
     */
    public boolean intersect(Interval1D that) {
        if (this.hi < that.lo) return false;
        if (that.hi < this.lo) return false;
        return true;
    }

    public void draw(){

    }
}
