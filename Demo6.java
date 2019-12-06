import java.util.Scanner;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bo=true;
		while(bo){
		System.out.println("请输入一个华氏温度：");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b;
		b=(a-32)*5/9;
		System.out.println(b);
		System.out.println("1：华氏温度，2：摄氏");
		int m=sc.nextInt();
		if(m==2) {
			System.out.println("请输入一个摄氏温度：");
			Scanner s=new Scanner(System.in);
			float e=s.nextFloat();
			float h;
			h=e*9/5+32;
			System.out.println(h);
		}
				
		}
		

	}

}
