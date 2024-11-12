import java.util.Scanner;

public class Modifikasibioskopwithscanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "***";
            }
        }

        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan menu yang ingin dipilih (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Maaf, nomor baris/kolom tidak valid.");
                    } else if (!penonton[baris - 1][kolom - 1].equals("***")) {
                        System.out.println("Maaf, kursi sudah terisi. Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;

                case 2:
                    System.out.println("DAFTAR PENONTON");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, sampai jumpa!");
                    return;

                default:
                    System.out.println("Maaf, menu yang Anda pilih tidak valid.");
                    break;
            }
        }
    }
}