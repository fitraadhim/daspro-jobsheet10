import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata, total = 0;
        int survei[][] = new int[10][6];
        double rataRsp = 0, rataTanya = 0;
        int totalRsp, totalTanya;

        System.out.println();
        System.out.println("================= Input Nilai Pertanyaan ==================");
        System.out.println();

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai Pertanyaan ke-" + (j + 1) + "(1-5)" + ": ");
                survei[i][j] = sc.nextInt();
                
                if (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Input nilai tidak valid");
                    j--;
                    continue;
                }
            }
            System.out.println();
        }

        System.out.println("================= Rata Tiap Responden ==================");
        for (int i = 0; i < survei.length; i++) {
            totalRsp = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalRsp += survei[i][j];
            }
            rataRsp = (double) totalRsp / survei[i].length;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rataRsp);
        }

        System.out.println("\n================= Rata Tiap Pertanyaan ==================");
        for (int j = 0; j < survei[0].length; j++) {
            totalTanya = 0;
            for (int i = 0; i < survei.length; i++) {
                totalTanya += survei[i][j];
            }
            rataTanya = (double) totalTanya / survei.length;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + rataTanya);
        }

        total = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
        }
        rata = total / (survei.length * survei[0].length);
        System.out.println("\n================= Rata-rata Keseluruhan ==================");
        System.out.println("Rata-rata keseluruhan: " + rata);
    }
}
