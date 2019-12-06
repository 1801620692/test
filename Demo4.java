import java.util.Scanner;
public class Demo4 {
	public void run(int num) {
		if(num>1000) {
			System.out.println("请输入小于1000的数");
			System.exit(0);
		}
		else if(num<0){
			System.out.println("请输入大于0的数");
			System.exit(0);
			
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  bo=true;
		while(bo){
		Demo4 number=new Demo4();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=input.nextInt();
		number.run(num);
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("所给数字的各位数之和为:"+sum);
	    System.out.println("是否结束：1:继续，2：结束");
	    int b=input.nextInt();
	    if(b==2) {
	    bo =false;
	    }
		}

	}

}
