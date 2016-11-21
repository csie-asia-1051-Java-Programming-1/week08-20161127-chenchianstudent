package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021007 陳麒安
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入");
double n=scn.nextDouble();
System.out.print("請輸入加(+)、減(-)、乘(*)、除(/)、平方(2)、立方(3)、開根號(√)");
char x=scn.next().charAt(0);
computer(n,x);

	}
public static void computer(double n,char x){
	Scanner scn=new Scanner(System.in);
	if(x=='+'){
		System.out.print("請輸入要加的數字");
		double m=scn.nextDouble();
		System.out.print((double) n+m);
	}else{
	if(x=='-'){
		System.out.print("請輸入要減的數字");
		double m=scn.nextDouble();
		System.out.print((double) n-m);
	}else{
	if(x=='*'){
		System.out.print("請輸入要乘的數字");
		double m=scn.nextDouble();
		System.out.print((double) n*m);
	}else{
	if(x=='/'){
		System.out.print("請輸入要除的數字");
		double m=scn.nextDouble();
		System.out.print((double) n/m);
	}else{
	if(x=='2'){
		double ans=Math.pow(n,2);
		System.out.print((double)ans);
	}else{
	if(x=='3'){
		double ans=Math.pow(n, 3);
		System.out.print((double)ans);
	}else{
	if(x=='√'){
		double ans=Math.sqrt(n);
		System.out.print((double)ans);
	}	
	}	
	}	
	}	
	}	
	}	
	}
}

}
