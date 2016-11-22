package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101

 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner (System.in);
System.out.print("請輸入");
long n=scn.nextLong();
String ans="";
System.out.print(fun(n,ans));



	}
public static String fun(long n, String ans) {
if(n==0){
return "";
}else{
ans=Long.toString(n%2);
return fun(n/2, ans)+(n%2); 
}
		

	}
}
