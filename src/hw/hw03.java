package hw;
import java.util.Scanner;
/*
 * Topic:�мg�@�ӻ��j�{���A��J�@�� int ���A����ơA�æ^�ǸӸ�Ʀb�G�i��U���h�֭Ӧ줸�O 1�A�Ҧp: ��J 13 �o�쵲�G�� 3
 * Date: 2016/11/21
 * Author: 105021007 ���Q�w
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n =scn.nextInt();
System.out.println(ans(n));
	}

public static int ans(int n) {
if(n==0){
return 0;
}else{
if(n%2==1){
return ans(n/2)+1; 
}else{
return ans(n/2);
}
}
	
	}

}
