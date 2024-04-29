package Diziler.MiniProjeler;

import java.util.Arrays;

public class TekrarEdenSayi {
    public static boolean isFind(int[] list , int value){
        for(int i : list){
            if(i == value){
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int[] list = {1,2,3,4,3,5,5};
        int[] againNumber = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(i != j && list[i] == list[j]){
                    if(!isFind(againNumber,list[i])){
                        againNumber[startIndex++] = list[i];
                    }
                    break;
                }


            }
        }
        System.out.println(Arrays.toString(againNumber));
    }
}
