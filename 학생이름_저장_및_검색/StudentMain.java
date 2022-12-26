package �л��̸�_����_��_�˻�;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Students st1 = new Students("ȫ�浿", "2016");
		Students st2 = new Students("������", "2015");
		Students st3 = new Students("�̼���", "2014");
		
		
		ArrayList<Students> stList = new ArrayList<Students>();
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		for(Students stu : stList) {
			System.out.print(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[��� �˻��� �ϰ������ø� 'y', �����ϰ������� 'n']");
		
		
		
		while(true) {
				String input = sc.next();
				
			if(input.equals("y")) {
				for(Students stu : stList) {
					System.out.print(stu.getName());
					System.out.println(stu.getNo());
				}
			} else if(input.equals("n")) {
				break;
			} else {
				System.out.println("�Է��� �� �� �Ǿ����ϴ�.");
			}
			
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
