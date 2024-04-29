package Diziler.MiniProjeler;
public class Transpoze {
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
        };
        System.out.println("Matris:");
        printMatrix(matrix);


        int satir = matrix.length;
        int sutun = matrix[0].length;
        int[][] transpozeMatris = new int[sutun][satir];
        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){
                transpozeMatris[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpozu alınmış matris:");
        printMatrix(transpozeMatris);
    }
}
