package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		System.out.print("請輸入");
		int n=scn.nextInt();
	fun1(n);
	}
public static void fun1(int n){
	int k,z;
	String ans="";
	if(n>=0&&n<2){
		k=n%2; 
		ans=k+ans;
		}else{
	k=n%2;
	ans=k+ans; 
	while(n/2!=0){ 
	n=n/2; 
	z=n%2; 
	ans=z+ans; 
	} 
	}
	System.out.print(ans);
}
}
