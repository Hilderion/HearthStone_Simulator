import java.util.Scanner;
import java.util.Random;

public class SelectClass {
	
	String className [] = {"����̵�","����","����","����","��ɲ�","������","�����","�ּ���","�渶����"};
	
	// �÷��̾� ���� ����
	int classSelect () {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 : ����̵�, 2: ����, 3: ����, ");
		System.out.println("4:����, 5:��ɲ�, 6: ������, ");
		System.out.println("7: �����, 8: �ּ���, 9: �渶����");
		System.out.print("���� ���� : ");

		int classNumber = scan.nextInt();
		
		giveClassNumber(classNumber);
		
		return classNumber;
	}

	
	// ��� �÷��̾� ���� ����
	int aiAutoSelcet() {
		Random rnd = new Random();

		int classNumber = (rnd.nextInt(9))+1;

		System.out.print("��� �÷��̾ ");

		giveClassNumber(classNumber);

		return classNumber;
	}

	// ���� ���� ����ġ
	int giveClassNumber (int classNumber) {
		System.out.print("������ ����: ");

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