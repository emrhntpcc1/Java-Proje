import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        byte temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Bugün hava kaç derece:");
        temp = input.nextByte();
        if (temp < 5){
            System.out.println("Bugün kayak yapabilirsin.");
        }else if (temp >= 5 && temp <= 15){
            System.out.println("Bugün sinemaya gidebilirsin.");
            if (temp > 10){
                System.out.println("Bugün pikniğe gidebilirsin.");
            }
        }else if (temp > 15 && temp <= 25){
            System.out.println("Bugün pikniğe gidebilirsin.");
        }else {
            System.out.println("Bugün yüzmeye gidebilirsin.");
        }

    }
}
