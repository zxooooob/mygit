package come.syjy;

public class Student {
     int a;

     public Student(){
         System.out.println("Student()构造方法.....");
     }

    public Student(int a) {
        System.out.println("参数构造方法 a:"+a);
    }

    private Student(String name) {
        System.out.println("姓名 name:"+name);
    }

    public Student(int a,String name) {
        System.out.println("姓名 name:"+name);
    }

    public void m1(){
        System.out.println("Student m1.....");
    }

    public static void main(String[] args)throws Exception {
        //第一种方式 获取Class对象
        Student stu = new Student(); //使用new产生一个对象
        //获得Class对象
        Class classz = stu.getClass();
        //通过反射得到一个类对象中的路劲 它显示的是包名+类名
        System.out.println(classz.getName());

        //第二种方式
        Class classzz = Student.class;

        //判断第一种方式和第二种方式的Class获取的是否是同一个类路径
        System.out.println(classz==classzz);

        //第三种是类加载【驱动加载过程】
        Class class3 = Class.forName("com.syjy.Student");
        System.out.println(classz==class3);

    }
}
