package Diziler.MiniProjeler;

public class BHarfiYazdiranProgram {
    public static void main(String[] args) {
        String[][] B = new String[7][4];
        for(int i = 0 ; i < B.length; i++){
            for(int j = 0 ; j < B[i].length; j++){
                if(j == 0 || j == 3){
                    B[i][j] = "# ";
                }else if(i == 0 || i == 3 || i == 6){
                    B[i][j] = " # ";
                }else{
                    B[i][j] = "   ";
                }
            }
        }
        System.out.println("B Harfi :");
        for(String[] i : B){
            for(String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
