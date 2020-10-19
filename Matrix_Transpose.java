import java.util.Scanner;
public class Matrix_Transpose
{
	public static void prnt_Array(int[][] arr , int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rank of the matrix");
		int r = sc.nextInt();
		int[][] arr=new int[r][r];
		int[][] arr1=new int[r][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				arr1[i][j]=arr[j][i];
			}
		}
		System.out.println("before transposing");
		prnt_Array(arr,r);
		System.out.println("After transposing");
		prnt_Array(arr1,r);
	}
}