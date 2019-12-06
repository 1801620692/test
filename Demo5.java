
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args){
		boolean  bo=true;
		while(bo){
		Scanner sc=new Scanner(System.in);
		System.out.print("输入一个整数：");
        int a=sc.nextInt();
        while((a>255||a<0)) {
        	System.out.println("输入范围有误，请重新输入！");   
        	System.out.print("输入一个整数：");
        	a=sc.nextInt();
        }
        int [] arr= new int [8];       
        for(int i=0;a!=0;i++) {
        	arr[i]=a%2;
        	a=a/2;
        }
        for(int i=0;i<arr.length/2;i++) {
        	int t=arr[i];
        	arr[i]=arr[arr.length-i-1];
        	arr[arr.length-i-1]=t;
        }
        System.out.print("二进制的形式：");
        for(int i=0;i<arr.length;i++)
        	System.out.print(arr[i]);  
        System.out.println();
        System.out.println("是否结束：1:继续，2：结束");
        int b=sc.nextInt();
        if(b==2) {
             bo =false;
            }
	}
}
}