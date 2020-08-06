package come.syjy;

import java.lang.reflect.Constructor;

public class StudentTest2 {
    public static void main(String[] args)throws Exception {
        Class clazz = Class.forName("com.syjy.Student");
        Constructor con = clazz.getDeclaredConstructor(String.class);
        System.out.println(con);

        //反射暴力破解
        con.setAccessible(true);
        Object obj = con.newInstance("jack");

    }
}
