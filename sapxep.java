import java.util.Scanner;

public class sapxep {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];


        System.out.println("Nhap vao mang cac so nguyen:");
        nhapMang(a, n, sc);


        System.out.println("Mang vua nhap la:");
        hienThi(a, n);

        System.out.println("\nMang sau khi sap xep tang dan la:");
        sapXepTangDan(a, n);
        hienThi(a, n);

        sc.close();
    }

    private static void nhapMang(int[] a, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            a[i] = sc.nextInt();
        }
    }

    private static void hienThi(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    private static void sapXepTangDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }
}
