
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args){
		boolean  bo=true;
		while(bo){
		Scanner sc=new Scanner(System.in);
		System.out.print("����һ��������");
        int a=sc.nextInt();
        while((a>255||a<0)) {
        	System.out.println("���뷶Χ�������������룡");   
        	System.out.print("����һ��������");
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
        System.out.print("�����Ƶ���ʽ��");
        for(int i=0;i<arr.length;i++)
        	System.out.print(arr[i]);  
        System.out.println();
        System.out.println("�Ƿ������1:������2������");
        int b=sc.nextInt();
        if(b==2) {
             bo =false;
            }
	}
}
}