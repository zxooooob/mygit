package come.syjy;

public class Teacher {
    //字段 访问修饰符4种
    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    public Teacher() {
        System.out.println("Teacher() 构造器.....");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
