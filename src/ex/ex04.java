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
computer ans=new computer();
System.out.print("請輸入加(+)減(-)乘(*)除(/)平方(2)立方(3)開根號(√)");
char a=scn.next().charAt(0);
switch(a){
case('+'):
	ans.ans1();
case('-'):
	ans.ans2();
case('*'):
	ans.ans3();
case('/'):
	ans.ans4();
case('2'):
	ans.ans5();
case('3'):
	ans.ans6();
case('√'):
	ans.ans7();
   }
     }
	}		
class computer{
Scanner scn=new Scanner(System.in);
public void  ans1(){
float n=scn.nextFloat();			
float m=scn.nextFloat();
System.out.print(n+m);
    }
public void ans2(){
float n=scn.nextFloat();			
float m=scn.nextFloat();
System.out.print(n-m);
	}
public void ans3(){
float n=scn.nextFloat();			
float m=scn.nextFloat();
System.out.print(n*m);
    }
public void  ans4(){
float n=scn.nextFloat();			
float m=scn.nextFloat();
System.out.print(n/m);
    }
public void  ans5(){
float n=scn.nextFloat();			
System.out.print(Math.pow(n,2));
    }
public void ans6(){
float n=scn.nextFloat();			
System.out.print(Math.pow(n,3));
    }
public void ans7(){
float n=scn.nextFloat();
System.out.println(Math.sqrt(n));
    }
	
}
	
	