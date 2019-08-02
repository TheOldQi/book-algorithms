package com.qixiafei.book.algorithms.c1;

import java.util.ArrayList;
import java.util.List;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/2/26 18:59</P>
 * <P>UPDATE AT: 2019/2/26 18:59</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Test {
    final int a;

    public Test(int b) {
        a = b;
    }

    int stackLength = 1;

    public static void main(String[] args) {

        final List<Test> holder = new ArrayList<>();
        int index = 1;
        while (true) {
            holder.add(new Test(index++));
        }
    }

    public void stackLeakExperiment() {
        Test test = new Test(1);
        try {

            test.stackLeak();
        } catch (Throwable e) {
            System.out.println("虚拟机长度=" + test.stackLength);
            e.printStackTrace();
        }
    }

    public void stackOutOfMemory() {

        Test test = new Test(1);
        try {

            test.createThreadForever();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public void createThreadForever() {
        int count = 0;
        while (true) {
            count++;
            System.out.println("第" + count + "个线程");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        dontStop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }

    private void dontStop() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
        }
    }
}
