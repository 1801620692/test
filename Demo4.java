import java.util.Scanner;
public class Demo4 {
	public void run(int num) {
		if(num>1000) {
			System.out.println("������С��1000����");
			System.exit(0);
		}
		else if(num<0){
			System.out.println("���������0����");
			System.exit(0);
			
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  bo=true;
		while(bo){
		Demo4 number=new Demo4();
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������");
		int num=input.nextInt();
		number.run(num);
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("�������ֵĸ�λ��֮��Ϊ:"+sum);
	    System.out.println("�Ƿ������1:������2������");
	    int b=input.nextInt();
	    if(b==2) {
	    bo =false;
	    }
		}

	}

}
