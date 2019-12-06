import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bo=true;
		while(bo) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入饮料");
		String word=sc.next();
		switch(word) {
		 case "kele":
	         System.out.println("1");
	         break;
	    case "fz":
	         System.out.println("2");
	         break;
	    case "nn":
	         System.out.println("3");
	         break;
	    default:
	         System.out.println("ok");
	         break;

		}
		System.out.println("是否结束：1:继续，2：结束");
        int b=sc.nextInt();
        if(b==2) {
             bo =false;
            }
		}
		

	}

}
