package exceptions;

import Interface.MyTester;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class ExceptionTest implements MyTester {
    @Override
    public void test() {
        //声明一个空对象
        Object o = null;
        //Objects提供了快捷检测的方法,如requireNonNull,当检测未通过时抛出NullPointerException异常
        Objects.requireNonNull(o);

        //完整的异常处理结构
        try {
            if ( new Random().nextInt(100)>50)
            {
                throw  new IOException();
            }
            else
            {
                throw  new NullPointerException();
            }
        }
        catch (IOException e)
        {
        }
        catch (NullPointerException e)
        {
        }
        catch (Exception e)
        {
        }
        finally {
        }
    }
}
