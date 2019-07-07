import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array [][];
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kich co ma tran vuong: ");
        size = sc.nextInt();
        array = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++) {
                System.out.println("nhap vao phan tu o hang "+i+ " cot "+j);
                array[i][j] =sc.nextInt();
            }
        }
        int sum = 0;
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (i==j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tong cac phan tu nam trong duong cheo ma tran la: "+ sum);

    }
}
