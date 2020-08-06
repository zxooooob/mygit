package come.syjy;

public class StudentTest3 {
    public static void main(String[] args)throws Exception {
        //获取所有共有的构造方法
        Class clazz=Class.forName("com.syjy.Student");
       /* Constructor[]constructors=clazz.getConstructors();
        for(Constructor c:constructors){
            System.out.println(c);
        }*/
       //如果要连私有的构造器也要获取


    }
}
