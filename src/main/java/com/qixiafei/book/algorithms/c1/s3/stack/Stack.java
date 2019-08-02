package com.qixiafei.book.algorithms.c1.s3.stack;

/**
 * <P>Description: 栈Lifo后进先出. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/18 16:45</P>
 * <P>UPDATE AT: 2019/2/18 16:45</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Stack<T> extends Iterable<T> {

    void push(T item);

    T pop();

    boolean isEmpty();

    int size();
}
