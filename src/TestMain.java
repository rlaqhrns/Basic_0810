import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int N = sc.nextInt();

		int[] rank = new int [N];
		Student[] stu = new Student[N];
		List<Student> stu1 = new ArrayList<>();
		
		
		

		for (int i = 0; i < N; i++) {
			stu1.add(new Student());
			
		}
		for(Student i : stu1) {
			System.out.print("name : ");
			String name = sc.next();
			i.setName(name);
			System.out.print("Math : ");
			i.setMath(sc.nextInt());
			System.out.print("Science : ");
			i.setScience(sc.nextInt());
			System.out.print("Social : ");
			i.setSocial(sc.nextInt());
			System.out.print("Moral : ");
			i.setMoral(sc.nextInt());
			System.out.print("English : ");
			i.setEng(sc.nextInt());
			
		}
//		for (int i = 0; i < N; i++) {
//			stu[i] = new Student();
//			System.out.print("name : ");
//			String name = sc.next();
//			stu[i].setName(name);
//			System.out.print("Math : ");
//			stu[i].setMath(sc.nextInt());
//			System.out.print("Science : ");
//			stu[i].setScience(sc.nextInt());
//			System.out.print("Social : ");
//			stu[i].setSocial(sc.nextInt());
//			System.out.print("Moral : ");
//			stu[i].setMoral(sc.nextInt());
//			System.out.print("English : ");
//			stu[i].setEng(sc.nextInt());
//			rank[i] = stu[i].getTotal();
//
//		}
		
		

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if(rank[i]<rank[j]) {
					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
					if(rank[i] == stu[j].getTotal()) {
						stu[j].setRank(i+1);
				}
			}
		}
		
		for(Student i : stu) {
			System.out.println(i);
		}
		
	}

}
