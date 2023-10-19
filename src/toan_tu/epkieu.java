package toan_tu;

public class epkieu {
    public static void main(String[] args) {
        float c = 35.8f;
        int b = (int)c +1;

        long abc = b; // abc đc phép lưu buến b vì rộng hơn b

        System.out.println(c);
        System.out.println((int)c);
        System.out.println(b);

        //chuyển số về chuỗi
        String numberString = String.valueOf(b);
        System.out.println(numberString + 40);

        //chuyển chuỗi về số
        System.out.println(Integer.parseInt(numberString));
    }
}
