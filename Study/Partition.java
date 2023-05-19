import java.util.Scanner;


//인덱스는 i,j,k
//intellj command option l

public class Partition {
    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j]; //스왑
        a[j] = t;
    }

    static void partition(int[] a, int k) {
        int left = 0;
        int right = k - 1;
        int x = a[k / 2];

        do {
            while (a[left] < x) left++;
            while (a[right] > x) right--;
            if (left <= right) {
                swap(a, left++, right++);
            }
        } while (left <= right);

        System.out.println("피벗값은" + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i < left - 1; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();

        if (left > right + 1) {
            System.out.println("피벗과 같은 그룹");
            for (int i = right + 1; i <= left - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        System.out.println("피벗 이상의 그룹");
        for (int i = right + 1; i < k; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열을 나눕니다");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        partition(x, nx);
    }
}
