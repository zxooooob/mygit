package come.syjy;

import java.lang.reflect.Field;

public class TeacherTest1 {
    //字段测试
    public static void main(String[] args)throws Exception {
        //加载类
        Class clazz = Teacher.class;
        //System.out.println(clazz);
        //获取字段 public Field[] getFields() throws SecurityException
        //公有字段
       /* Field[] fields = clazz.getFields();
        for (Field field:fields){
            System.out.println(field);
        }*/

       //私有到公有 全部字段
      /* Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }*/

      //对公有字段调用并赋值 根据名称修改值
    /*  Field field = clazz.getField("name");
      //创建对象
      Teacher teacher = (Teacher) clazz.newInstance();
      //设置属性值
      field.set(teacher,"jack");
      //显示
      System.out.println("姓名："+teacher.name);*/

      //调用私有的字段
        Field field = clazz.getDeclaredField("phoneNum");
        //创建对象
        Teacher teacher = (Teacher) clazz.newInstance();
        //破坏封装
        field.setAccessible(true);
        //设置属性值
        field.set(teacher,"139556548");
        //显示
        System.out.println("姓名："+teacher);

    }
}
