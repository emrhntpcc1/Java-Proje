package Diziler.MiniProjeler;

public class ListeninOrtalamasiBul {
    public static void main(String[] args) {
        double[] list = {1,2,3,4,5,6,7,8};
        double sum = 0 , syc = 0;
        for(double i : list){
            sum += i;
            syc++;
        }
        double ort = (sum / syc);
        System.out.println("Ortalama: " + ort);
    }
}
