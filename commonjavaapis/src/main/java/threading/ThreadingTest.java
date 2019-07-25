package threading;

import Interface.MyTester;

/**
 * 硬盘是ROM,永久存储
 * 内存是RAM,临时存储
 * 进入到内存的程序叫进程
 * CPU是中央处理器
 * 数据进入CPU进行数据处理
 * 多核CPU有多个线程
 *
 * 并发是多个程序之间的切换执行
 * 并行是多个程序同时执行
 */
public class ThreadingTest implements MyTester {
    public void test() {
        MyThread mt1 = new MyThread("th1");
        MyThread mt2 = new MyThread("th2");
        mt1.start();
        mt2.start();
    }
}
