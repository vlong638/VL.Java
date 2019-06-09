
public class Main {

    public static void main(String[] args) {

        //1. 创建 Spring 的 IOC 容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/beans-ioc.xml");

        //2. 从 IOC 容器中获取 bean 的实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld3");

        //3. 使用 bean
        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        //4. 测试使用集合属性
        User user = (User) ctx.getBean("user5");
        System.out.println(user);
    }
}