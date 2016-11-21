package ex;
import java.util.Scanner;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，
	而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m1= n2。接著輸 入兩個陣列的內容。
	

 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n1");
int n1=scn.nextInt();
System.out.print("請輸入m1");
int m1=scn.nextInt();
System.out.print("請輸入n2");
int n2=scn.nextInt();
System.out.print("請輸入m2");
int m2=scn.nextInt();
int[][] data=new int[n1][m1];
int[][] data1=new int[n2][m2];
int[][] data2=new int[data.length][data1[0].length];
for(int i=0;i<data.length;i++){
		for(int j=0;j<data[i].length;j++){
			int num=scn.nextInt();
			data[i][j]=num;	
		}}
		for(int i1=0;i1<data1.length;i1++){
		for(int j1=0;j1<data1[i1].length;j1++){
			int num=scn.nextInt();
			data1[i1][j1]=num;		
		}}
		//以上為輸入數字
		for(int i = 0; i<data.length;i++){
			for(int j = 0; j<data[0].length;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i = 0; i<data1.length;i++){
			for(int j = 0; j<data1[0].length;j++){
				System.out.print(data1[i][j]+"\t");
			}
			System.out.println();
		}
		//data data1 陣列
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data1[0].length;j++){
				for(int k=0;k<data[0].length;k++){
				data2[i][j]+=data[i][k]*data1[k][j];
			}
			}
		}	
		for(int i = 0; i<data2.length;i++){
			for(int j = 0; j<data2[0].length;j++){
				System.out.print(data2[i][j]+"\t");
			}
			System.out.println();
		}
}
}