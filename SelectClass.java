import java.util.Scanner;
import java.util.Random;

public class SelectClass {
	
	String className [] = {"드루이드","도적","전사","사제","사냥꾼","마법사","성기사","주술사","흑마법사"};
	
	// 플레이어 직업 선택
	int classSelect () {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 : 드루이드, 2: 도적, 3: 전사, ");
		System.out.println("4:사제, 5:사냥꾼, 6: 마법사, ");
		System.out.println("7: 성기사, 8: 주술사, 9: 흑마법사");
		System.out.print("직업 선택 : ");

		int classNumber = scan.nextInt();
		
		giveClassNumber(classNumber);
		
		return classNumber;
	}

	
	// 상대 플레이어 직업 선택
	int aiAutoSelcet() {
		Random rnd = new Random();

		int classNumber = (rnd.nextInt(9))+1;

		System.out.print("상대 플레이어가 ");

		giveClassNumber(classNumber);

		return classNumber;
	}

	// 직업 선택 스위치
	int giveClassNumber (int classNumber) {
		System.out.print("선택한 직업: ");

		int returnNum = 0;
			
		switch (classNumber) {
			case 1 :
				System.out.println(className[0]);
				returnNum = classNumber;
				break;
			case 2 :
				System.out.println(className[1]);
				returnNum = classNumber;
				break;
			case 3 :
				System.out.println(className[2]);
				returnNum = classNumber;
				break;
			case 4 :
				System.out.println(className[3]);
				returnNum = classNumber;
				break;
			case 5 :
				System.out.println(className[4]);
				returnNum = classNumber;
				break;
			case 6 :
				System.out.println(className[5]);
				returnNum = classNumber;
				break;
			case 7 :
				System.out.println(className[6]);
				returnNum = classNumber;
				break;
			case 8 :
				System.out.println(className[7]);
				returnNum = classNumber;
				break;
			case 9 :
				System.out.println(className[8]);
				returnNum = classNumber;
				break;
		}

		return returnNum;
	}

}