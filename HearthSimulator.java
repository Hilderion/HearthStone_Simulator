import java.util.Scanner;
import java.util.Random;

public class HearthSimulator {
	public static void main(String[] args) {
		
		Scanner inputScan = new Scanner(System.in);

		Random randomGen = new Random();

		System.out.println("���� �ùķ����� ver 0.01");

		System.out.println("���� ���� :");
		System.out.println("1 : ����̵�, 2: ����, 3: ����, ");
		System.out.println("4:����, 5:��ɲ�, 6: ������, ");
		System.out.println("7: �����, 8: �ּ���, 9: �渶����");

		//�Է��� �� (1~9) String -> Int ��ȯ
		String inputResult = inputScan.next();
		int classNumber = Integer.parseInt(inputResult);
		
		//�÷��̾� ��������
		System.out.print("������ ����: ");
		switch (classNumber) {
			
			case 1 :
				System.out.println(className.����̵�);
				break;
			case 2 :
				System.out.println(className.����);
				break;
			case 3 :
				System.out.println(className.����);
				break;
			case 4 :
				System.out.println(className.����);
				break;
			case 5 :
				System.out.println(className.��ɲ�);
				break;
			case 6 :
				System.out.println(className.������);
				break;
			case 7 :
				System.out.println(className.�����);
				break;
			case 8 :
				System.out.println(className.�ּ���);
				break;
			case 9 :
				System.out.println(className.�渶����);
				break;	
			}

		// ��� ���� ����
		System.out.print("��� ����: ");
		int classNumber2 = (randomGen.nextInt(9))+1;
		switch (classNumber2) {
			case 1 :
				System.out.println(className.����̵�);
				break;
			case 2 :
				System.out.println(className.����);
				break;
			case 3 :
				System.out.println(className.����);
				break;
			case 4 :
				System.out.println(className.����);
				break;
			case 5 :
				System.out.println(className.��ɲ�);
				break;
			case 6 :
				System.out.println(className.������);
				break;
			case 7 :
				System.out.println(className.�����);
				break;
			case 8 :
				System.out.println(className.�ּ���);
				break;
			case 9 :
				System.out.println(className.�渶����);
				break;	
			}

		// �̷��� �Ǻ�

		if (classNumber == classNumber2) {
			System.out.println("---�̷���!!!---");
			if (classNumber == 4) {
				System.out.println("���� �̷���!");
			}
		}

		// ��,�İ� ���� , 40% Ȯ���� ��� �÷��̾� ����
		int firstOrSecond = (randomGen.nextInt(5))+1;

		// �÷��̾� ����
		if(firstOrSecond <= 4) {
			System.out.println("�÷��̾� ����");
			System.out.println("-----1�� ����-----");
			System.out.println("� �ൿ�� ���ϰڽ��ϱ�?");
			System.out.println("1 : ������, 2 : �ʵ� ���, 3: ����ǥ��");
			String turnResult = inputScan.next();
			int turnPoint = Integer.parseInt(turnResult);

			// �÷��̾� 1�� ����
			switch (turnPoint) {
				// 1 : ������
				case 1 :
					System.out.println("���� ���½��ϴ�.");
					System.out.println("-----2�� ����-----");
					System.out.println("��� ��");
					System.out.println("��밡 �ż��� �޷���ϴ�...");
					System.out.println("---------------------------");
					System.out.println("��! �̰� ���� ������");
					System.out.println("�÷��̾� �й�");
					switch (classNumber2) {
						case 1 :
							System.out.println("��� ����̵� �¸�");
							break;
						case 2 :
							System.out.println("��� ���� �¸�");
							break;
						case 3 :
							System.out.println("��� ���� �¸�");
							break;
						case 4 :
							System.out.println("��� ���� �¸�");
							break;
						case 5 :
							System.out.println("��� ��ɲ� �¸�");
							break;
						case 6 :
							System.out.println("��� ������ �¸�");
							break;
						case 7 :
							System.out.println("��� ����� �¸�");
							break;
						case 8 :
							System.out.println("��� �ּ��� �¸�");
							break;
						case 9 :
							System.out.println("��� �渶���� �¸�");
							break;	
						}
					break;
				// 2 : �ʵ� ���
				case 2 : 
					System.out.println("1�� �ϼ����� �½��ϴ�.");
					System.out.println("���� ���½��ϴ�.");
					System.out.println("-----2�� ����-----");
					System.out.println("��� ��");
					System.out.println("��밡 �ż��� �޷���ϴ�...");
					System.out.println("---------------------------");
					System.out.println("��! �̰� ���� ������");
					System.out.println("--�÷��̾� �й�--");

					switch (classNumber2) {
						case 1 :
							System.out.println("��� ����̵� �¸�");
							break;
						case 2 :
							System.out.println("��� ���� �¸�");
							break;
						case 3 :
							System.out.println("��� ���� �¸�");
							break;
						case 4 :
							System.out.println("��� ���� �¸�");
							break;
						case 5 :
							System.out.println("��� ��ɲ� �¸�");
							break;
						case 6 :
							System.out.println("��� ������ �¸�");
							break;
						case 7 :
							System.out.println("��� ����� �¸�");
							break;
						case 8 :
							System.out.println("��� �ּ��� �¸�");
							break;
						case 9 :
							System.out.println("��� �渶���� �¸�");
							break;	
						}
					break;
				// 3 : ���� ǥ��
				case 3 :
					if (classNumber == 4) {
						if (classNumber2 == 4) {
							System.out.println("��� �÷��̾ ���� ����ǥ���� �մϴ�.");
							System.out.println("����� �������ϴ�.");
						} else {	
							System.out.println("�������� ����ǥ���� �ϻ��Դϴ�.");
							System.out.println("��� �÷��̾ �ܴ��� ������ �ֽ��ϴ�...");
							}



					System.out.println("-----2�� ����-----");
					System.out.println("��� ��");
					System.out.println("��밡 �ż��� �޷���ϴ�...");
					System.out.println("---------------------------");
					System.out.println("��! �̰� ���� ������");
					System.out.println("--�÷��̾� �й�--");
				
					} else {
						System.out.println("�μ����� �й��� �������Դϴ�.");
						System.out.println("--�÷��̾� �й�--");
					}

					break;
				} 

		// ��� �÷��̾� ����	
		} else {
			System.out.println("��� ����");
			System.out.println("-----1�� ����-----");
			System.out.println("��밡 �ż��� �޷���ϴ�...");
			System.out.println("---------------------------");
			System.out.println("��! �̰� ���� ������");

			switch (classNumber2) {
			case 1 :
				System.out.println("��� ����̵� �¸�");
				break;
			case 2 :
				System.out.println("��� ���� �¸�");
				break;
			case 3 :
				System.out.println("��� ���� �¸�");
				break;
			case 4 :
				System.out.println("��� ���� �¸�");
				break;
			case 5 :
				System.out.println("��� ��ɲ� �¸�");
				break;
			case 6 :
				System.out.println("��� ������ �¸�");
				break;
			case 7 :
				System.out.println("��� ����� �¸�");
				break;
			case 8 :
				System.out.println("��� �ּ��� �¸�");
				break;
			case 9 :
				System.out.println("��� �渶���� �¸�");
				break;	
				}
			}

	}
}

// ���� enum ����
enum className {
			����̵�,����,����,����,��ɲ�,������,�����,�ּ���,�渶���� 
		}