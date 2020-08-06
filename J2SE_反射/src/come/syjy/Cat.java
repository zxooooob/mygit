package come.syjy;

public class Cat {
    //成员方法
    public void show1(String s){
        System.out.println("show1()-->s:"+s);
    }

    protected void show2(){
        System.out.println("show2()-->protected的无参数方法！");
    }

    void show3(){
        System.out.println("show3()-->无修饰符的无参数方法！");
    }

    private String show4(int age){
        System.out.println(" 调用带有参数并有返回值 show4()方法 age:"+age);
        return ""+age;
    }
}
