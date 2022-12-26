package 학생이름_저장_및_검색;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Students st1 = new Students("홍길동", "2016");
		Students st2 = new Students("김유신", "2015");
		Students st3 = new Students("이순신", "2014");
		
		
		ArrayList<Students> stList = new ArrayList<Students>();
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		for(Students stu : stList) {
			System.out.print(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[계속 검색을 하고싶으시면 'y', 종료하고싶으면 'n']");
		
		
		
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
				System.out.println("입력이 잘 못 되었습니다.");
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
