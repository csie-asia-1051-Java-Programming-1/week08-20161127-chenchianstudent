package hw;
import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入先在得進制");
long o=scn.nextInt();
System.out.println("請輸入n");
long n=scn.nextInt();
System.out.println("請輸入要轉得進制");
long ans=scn.nextInt();
String c="";
System.out.println(fun1(fun(n,o,0),ans,c));
	}

public static long fun(long n,long o,int c) { 
if(n==0){
return 0;
}else{
return fun(n/10,o,c+1)+(n%10)*(int)Math.pow(o, c);
}
		}
public static String fun1(long n,long o,String c) {
if(n==0){
return "";
}else{
c=Long.toString(n%o);
return fun1(n/o,o,c)+c;
}
}
	

}
