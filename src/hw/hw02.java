package hw;
import java.util.Scanner;
/*
 * Topic: �N�e�@�D�[�j���i�H��10�H�U���U�ؼƦr�t���ഫ (�����ϥλ��j)
 * Date: 2016/11/21
 * Author: 105021007 ���Q�w
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J���b�o�i��");
long o=scn.nextInt();
System.out.println("�п�Jn");
long n=scn.nextInt();
System.out.println("�п�J�n��o�i��");
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
