package vong_lap_for;

public class vong_lap_cai_tien {
    public static void main(String[] args) {
        int numbers[] = {1,12, 24, 36, 48};
        String names[] = {"Hân", "My", "Luân", "Tây"};

        for(int i : numbers)
        {
            if(i == 20)
                System.out.println("Có so 20");

        }
        for(String ten: names)
        {
            if(ten.equals("Hân") )
                System.out.println("Co mat");

        }

    }
}
