import java.util.Scanner;
public class Demo10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//ѭ������Сд��ĸ
		while(true){
			
			System.out.println("������Сд��ĸ��(������ĸ����/0�˳�)");
			
			String word=input.next();
			
			//����0�˳�ѭ��
			if(word.equals("0")){
				System.out.println("лл����ʹ��!");
				break;
			}
			
			String words=word.toUpperCase();
			
			System.out.println("ת�����Ч��Ϊ��"+words);
			
		}//while
		
		
	}
}