import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================================");
        System.out.println("2 untuk biner, 8 untuk oktal, 10 untuk desimal, 16 untuk hexadesimal");
        System.out.println("Simbol operasi : + (tambah), - (kurang), * (kali), / (bagi)");
        System.out.println("====================================================================");
        
        // Meminta input dari pengguna
        System.out.println("Masukkan bilangan pertama: ");
        String input1 = scanner.nextLine();
        System.out.println("Masukkan basis bilangan pertama: ");
        int basis1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan bilangan kedua: ");
        String input2 = scanner.nextLine();
        System.out.println("Masukkan basis bilangan kedua : ");
        int basis2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pilih operasi : ");
        char operasi = scanner.next().charAt(0);

        // Konversi input ke bilangan desimal
        int bilangan1 = Integer.parseInt(input1, basis1);
        int bilangan2 = Integer.parseInt(input2, basis2);

        // Melakukan operasi sesuai dengan pilihan pengguna
        int hasil = 0;
        boolean valid = true;

        switch (operasi) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                valid = false;
                break;
        }

        // Menampilkan hasil operasi dalam berbagai basis jika operasi valid
        if (valid) {
            System.out.println("Hasil dalam desimal: " + hasil);
            System.out.println("Hasil dalam biner: " + Integer.toBinaryString(hasil));
            System.out.println("Hasil dalam oktal: " + Integer.toOctalString(hasil));
            System.out.println("Hasil dalam hexadesimal: " + Integer.toHexString(hasil).toUpperCase());
        }

        scanner.close();
    }
}
