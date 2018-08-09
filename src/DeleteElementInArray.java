import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] a = {1, 9, 5, 7, 6, 4, 2, 11, 30, 12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số cần xóa: x = ");
        int x = sc.nextInt();
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index = i;
            }
        }
        if (index != 0) {
            for (int j = 0; j < a.length - 1; j++) {
                if (j >= index) {
                    a[j] = a[j + 1];
                }
                System.out.print(a[j] + "\t");
            }
        }
    }
}
