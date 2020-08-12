package dddddd;

import java.util.Scanner;

public class SbjectScore {

	Scanner scan = new Scanner(System.in);
	private Student score[]; // 학생 정보(이름, 점수)를 받는 객체 배열
	private int studentCount; // 학생정보에 붙이는 고유번호

	public SbjectScore() {

		score = new Student[3];
		studentCount = 0;
	}

	public void newScore() { // 점수 받기 및 번호 부여

		System.out.println("학생의 이름을 입력하세요. : \n");
		String name = scan.next();

		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();

		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();

		System.out.println("사회점수를 입력하세요.");
		int society = scan.nextInt();

		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();

		System.out.println("도덕점수를 입력하세요.");
		int morality = scan.nextInt();

		Student student = new Student(name, kor, eng, math, morality, society);
		score[studentCount] = student;
		studentCount++;
		System.out.println(name + "님은 학생번호  " + studentCount + "번으로 배정되었습니다.\n");
	}

	public void total() { // 합산 조회

		System.out.println("점수의 합산을 조회 할 학생의 이름을 입력하세요.");
		String name = scan.next();

		int studentCountNumber = -1;

		for (int i = 0; i < score.length; i++) {
			Student stu = score[i];
			String num = stu.getName();
			if (num.equals(name)) {
				studentCountNumber = i;
				break;
			} else
				System.out.println("이름을 찾을 수 없습니다.\n");
			return;
		}
		System.out.println(score[studentCountNumber].toString());
		System.out.println(name + "학생의 총 점은 " + score[studentCountNumber].total() + "점입니다.\n");
	}

	public void average() { // 평균 조회

		System.out.println("점수의 평균을 조회 할 학생의 이름을 입력하세요.");
		String name = scan.next();

		int studentCountNumber = -1;

		for (int i = 0; i < score.length; i++) {
			Student stu = score[i];
			String num = stu.getName();
			if (num.equals(name)) {
				studentCountNumber = i;
				break;
			} else
				System.out.println("이름을 찾을 수 없습니다.\n");
			return;
		}
		System.out.println(name + "학생의 평균은 " + score[studentCountNumber].average() + "점입니다.\n");

	}

	public void ranking() { // 석차 조회

		int[] ranking = new int[3];

		for (int i = 0; i < ranking.length; i++) {
			Student stu = score[i];
			ranking[i] = stu.total();

		}

//			for(int i=0; i< score.length; i++)
//		           score[i]= score[] ; 

		for (int i = 0; i < ranking.length - 1; i++) {
			for (int j = i + 1; j < ranking.length; j++) {
				if (ranking[i] < ranking[j]) {
					int tmp = ranking[i];
					ranking[i] = ranking[j];
					ranking[j] = tmp;
				}
			}

			/*
			 * if(ranking[i]>ranking[j]) ranking[j]++;
			 * 
			 * else if(ranking[i]<ranking[j]) ranking[i]++; }
			 */
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {

				if (score[i].total() == ranking[j]) {
					score[i].setRank(j + 1);
				}

			}

		}

		for (int i = 0; i < score.length; i++) {
			System.out.println("학생번호 " + (i + 1) + "의 순위 : " + score[i].getRank() + "등\n");
		}

		/*
		 * System.out.println("점수의 석차를 조회 할 학생의 이름을 입력하세요."); String name = scan.next();
		 * int studentCountNumber = -1;
		 * 
		 * for(int i = 0; i < score.length; i++) { Student stu = score[i]; String num =
		 * stu.getName(); if (num.equals(name)) { studentCountNumber = i; break; } else
		 * System.out.println("이름을 찾을 수 없습니다.\n"); return; }
		 * score[studentCountNumber].ranking();
		 */

	}

	public void quit() { // 종료하기

		System.out.println("프로그램이 종료되었습니다.\n");
	}

}
