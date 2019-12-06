import java.util.Scanner;
public class Demo10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//循环输入小写字母
		while(true){
			
			System.out.println("请输入小写字母：(任意字母继续/0退出)");
			
			String word=input.next();
			
			//输入0退出循环
			if(word.equals("0")){
				System.out.println("谢谢您的使用!");
				break;
			}
			
			String words=word.toUpperCase();
			
			System.out.println("转换后的效果为："+words);
			
		}//while
		
		
	}
}