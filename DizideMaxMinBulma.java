package Diziler.MiniProjeler;

public class DizideMaxMinBulma {
    public static void main(String[] args) {
        int[] list = {15,2,-93,85,5,6};
        int min = list[0];
        int max = list[0];

        for(int i : list){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Max değer: " + max + "\nMin değer: " + min);
    }
}
