package threading;

import Interface.MyTester;

/**
 * Runnable接口
 * 1.避免了单继承的局限性 * 实现了Runnable接口还可以继承其他的类
 * 2.增强了程序的扩展性,降低了程序的耦合性,解耦线程管理和实现 * 实现Runnable接口,把设置线程任务和开启新线程进行了分离 *
 */
public class RunnableTest implements MyTester {
    public void test() {
        MyRunnable runnable1 = new MyRunnable("MyRunnable1");
        Thread t1 = new Thread(runnable1);
        MyRunnable runnable2 = new MyRunnable("MyRunnable2");
        Thread t2 = new Thread(runnable2);
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("MyAnonymous1" + " run:" + i);
            }
        }).start();
        t1.start();
        t2.start();
        //常用sleep接口
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
