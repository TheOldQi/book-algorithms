package com.qixiafei.book.algorithms.c1.s3.queue;

/**
 * <P>Description: Fifo队列. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/18 16:43</P>
 * <P>UPDATE AT: 2019/2/18 16:43</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Queue<T> extends Iterable<T> {


    void add(T item);

    T pop();

    boolean isEmpty();

    int size();
}
