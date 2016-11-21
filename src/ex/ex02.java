package ex;
import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入");
int n=scn.nextInt();
	fun1(n);
	}
public static void fun1(int n){
	Scanner scn=new Scanner(System.in);
	System.out.print("請輸入要轉的數字系統(轉二位打2  轉16位打16)");
	int s=scn.nextInt();
	if(s==2){int k,z;
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
	}else{
	if(s==16){
		String ans=Integer.toHexString(n);
		System.out.print(ans);
	}	
	}
}
}
