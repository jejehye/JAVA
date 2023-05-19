import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void bubbleSort(int[] a, int n){
        for(int i =0; i < n-1; i++){
            for(int j=n-1; j > i; j-- ){
                if(a[j-1] >a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬 by jeje");
        System.out.println("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx]; //new는 동적할당하기 위해서 배열은 동적할당 필요 -> 문법책을 봐야겟다

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다");
        for(int i =0; i <nx; i++){
            System.out.println("x["+i+"]=" + x[i]);
        }
    }
}
