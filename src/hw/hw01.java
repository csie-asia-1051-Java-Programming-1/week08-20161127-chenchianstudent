package hw;
import java.util.Scanner;
/*
 * Topic: �мg�@�� ���j�禡)�i��Q�i��Ʀr�ഫ���G�i��Ʀr�A�Ҧp�Q�i� 13 �|��X�G�i� 1101

 * Date: 2016/11/21
 * Author: 105021007 ���Q�w
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner (System.in);
System.out.print("�п�J");
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
