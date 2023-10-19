package bien_kieudl;

public class Student {
    public static int a = 20;
    public String ten = "Han";

    public static void sayHello(){
        int b = 10;
        b = b + tinhLaiSuat();
        System.out.println(b);
    }
    public static int tinhLaiSuat(){
        int laiSuat = 100;
        return laiSuat;
    }

    public static void main(String[] args) {
        String Name = "Anh Tester";
        System.out.println(a);
        System.out.println(Name);
        sayHello();
    }
}
