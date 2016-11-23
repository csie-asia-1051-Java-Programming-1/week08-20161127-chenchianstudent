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
System.out.print("請輸入目前幾進制");
float n1=scn.nextFloat();
System.out.print("請輸入n");
int n=scn.nextInt();
System.out.print("請輸入要轉換的進制");
int n2=scn.nextInt();
fun1(n1,n,n2);

}

			
public static void fun1(float n1,int n,int n2){
//原理：http://www.smalljacky.com/introduction-to-computer/carry-digital-system-conversion/
String ans="";
int x=0;
int sum=0;
while(n>0){
sum=sum+(n%10)*(int)Math.pow(n1,x);
x++;
n=n/10;
	}
//先10進位轉換  下面開始做轉換
if(n2==10){
ans=Integer.toString(sum);
System.out.print(ans);
}
while(sum!=n2-1){   
ans=sum%n2+ans;
sum=sum/n2;
}
ans=(n2-1)+ans;
System.out.print(ans);		

}
}