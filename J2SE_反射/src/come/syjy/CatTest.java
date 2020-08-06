package come.syjy;

import java.lang.reflect.Method;

public class CatTest {
    public static void main(String[] args) throws Exception{
        //利用反射对方法进行测试
        Class clazz=Class.forName("com.syjy.Cat");

        //共有方法测试 包含Object中的方法
        /*Method[] methods=clazz.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }*/

        //私有方法测试 它是不包含object中的方法
        /*Method[] methods=clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method);*/

        //获取公有带有参数的方法 第一参数是方法名，后续为可变参
        Method method=clazz.getMethod("show1",String.class);
        System.out.println(method);

    }
}
