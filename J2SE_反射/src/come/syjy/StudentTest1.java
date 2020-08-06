package come.syjy;

public class StudentTest1 {

    public static void main(String[] args)throws Exception {
        //构造方法测试
        //加载Class对象
        Class clazz = Class.forName("com.syjy.Student");
        //获取所有的公有的构造方法
       /* Constructor[] constructors = clazz.getConstructors();
        for (Constructor c:constructors){
            System.out.println(c);
        }*/

       //获取公有 私有构造方法
     /*  Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c:constructors){
            System.out.println(c);
        }*/

        //获取公有 无参数的构造方法 因为是无参数所以写null 和 不写都是可以的
       // Constructor constructor = clazz.getConstructor(null);
        /*Constructor constructor = clazz.getConstructor(int.class,String.class);
        System.out.println(constructor);*/

        //构造方法的实例化过程
       /* Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        Student stu =(Student) obj;
        stu.m1();*/


    }
}
