import java.util.Scanner;
public class PacmanMain {
    public static void main(String[] args) {
        Pacman v = new Pacman();
        Scanner scan = new Scanner(System.in);
        v.x = 0;
        v.y = 0;

        System.out.print("Masukkan batas nilai x = ");
        v.width = scan.nextInt();
        System.out.print("Masukkan batas nilai y = ");
        v.height = scan.nextInt();

        for (;;) {
            System.out.println("Pilih action untuk Pacman : ");
            System.out.println("1. Pindah Kiri ");
            System.out.println("2. Pindah Kanan ");
            System.out.println("3. Pindah Atas ");
            System.out.println("4. Pindah Bawah ");
            System.out.println("5. Keluar ");
            System.out.println("Pilihan Anda : ");
            int pilih = scan.nextInt();
            if (v.x == 0 && pilih == 1) {
                System.out.println("Pacman kurang atau melebihi batas");
                v.printPosition(v.x, v.y);
                continue;
            } else if (v.x == v.width && pilih == 2) {
                System.out.println("Pacman kurang atau melebihi batas");
                v.printPosition(v.x, v.y);
                continue;
            } else if (v.y == v.height && pilih == 3) {
                System.out.println("Pacman kurang atau melebihi batas");
                v.printPosition(v.x, v.y);
                continue;
            } else if (v.y == 0 && pilih == 4) {
                System.out.println("Pacman kurang atau melebihi batas");
                v.printPosition(v.x, v.y);
                continue;
            }

            if (pilih == 1) {
                v.Left(v.x);
                v.printPosition(v.x, v.y);
            } else if (pilih == 2) {
                v.Right(v.x);
                v.printPosition(v.x, v.y);
            } else if (pilih == 3) {
                v.Up(v.y);
                v.printPosition(v.x, v.y);
            } else if (pilih == 4) {
                v.Down(v.y);
                v.printPosition(v.x, v.y);
            } else {
                System.out.println("TERIMA KASIH");
                break;
            }

        }

    }
}
