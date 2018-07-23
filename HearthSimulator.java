import java.util.Scanner;
import java.util.Random;

public class HearthSimulator {
	public static void main(String[] args) {
		
		Scanner inputScan = new Scanner(System.in);
		Random randomGen = new Random();

		System.out.println("돌겜 시뮬레이터 ver 0.02");
		// '18.07.23 Update

		System.out.println("직업 선택 :");
		System.out.println("1 : 드루이드, 2: 도적, 3: 전사, ");
		System.out.println("4:사제, 5:사냥꾼, 6: 마법사, ");
		System.out.println("7: 성기사, 8: 주술사, 9: 흑마법사");

		int classNumber = inputScan.nextInt();
		String className [] = {"드루이드","도적","전사","사제","사냥꾼","마법사","성기사","주술사","흑마법사"};
		
		//플레이어 직업선택
		System.out.print("선택한 직업: ");
		switch (classNumber) {
			
			case 1 :
				System.out.println(className[0]);
				break;
			case 2 :
				System.out.println(className[1]);
				break;
			case 3 :
				System.out.println(className[2]);
				break;
			case 4 :
				System.out.println(className[3]);
				break;
			case 5 :
				System.out.println(className[4]);
				break;
			case 6 :
				System.out.println(className[5]);
				break;
			case 7 :
				System.out.println(className[6]);
				break;
			case 8 :
				System.out.println(className[7]);
				break;
			case 9 :
				System.out.println(className[8]);
				break;	
			}

		// 상대 직업 선택
		System.out.print("상대 직업: ");
		int classNumber2 = (randomGen.nextInt(9))+1;
		switch (classNumber2) {
			case 1 :
				System.out.println(className[0]);
				break;
			case 2 :
				System.out.println(className[1]);
				break;
			case 3 :
				System.out.println(className[2]);
				break;
			case 4 :
				System.out.println(className[3]);
				break;
			case 5 :
				System.out.println(className[4]);
				break;
			case 6 :
				System.out.println(className[5]);
				break;
			case 7 :
				System.out.println(className[6]);
				break;
			case 8 :
				System.out.println(className[7]);
				break;
			case 9 :
				System.out.println(className[8]);
				break;	
			}

		// 미러전 판별

		if (classNumber == classNumber2) {
			System.out.println("---미러전!!!---");
			if (classNumber == 4) {
				System.out.println("사제 미러전!");
			}
		}

		// 선,후공 선택 , 40% 확률로 상대 플레이어 선공
		int firstOrSecond = (randomGen.nextInt(5))+1;

		// 플레이어 선공
		if(firstOrSecond <= 4) {
			System.out.println("플레이어 선공");
			System.out.println("-----1턴 진행-----");
			System.out.println("어떤 행동을 취하겠습니까?");
			System.out.println("1 : 턴종료, 2 : 필드 깔기, 3: 감정표현");
			int turnPoint = inputScan.nextInt();

			// 플레이어 1턴 진행
			switch (turnPoint) {
				// 1 : 턴종료
				case 1 :
					System.out.println("턴을 끝냈습니다.");
					System.out.println("-----2턴 진행-----");
					System.out.println("상대 턴");
					System.out.println("상대가 매섭게 달려듭니다...");
					System.out.println("---------------------------");
					System.out.println("악! 이건 정말 아프다");
					System.out.println("플레이어 패배");
					switch (classNumber2) {
						case 1 :
							System.out.println("상대 드루이드 승리");
							break;
						case 2 :
							System.out.println("상대 도적 승리");
							break;
						case 3 :
							System.out.println("상대 전사 승리");
							break;
						case 4 :
							System.out.println("상대 사제 승리");
							break;
						case 5 :
							System.out.println("상대 사냥꾼 승리");
							break;
						case 6 :
							System.out.println("상대 마법사 승리");
							break;
						case 7 :
							System.out.println("상대 성기사 승리");
							break;
						case 8 :
							System.out.println("상대 주술사 승리");
							break;
						case 9 :
							System.out.println("상대 흑마법사 승리");
							break;	
						}
					break;
				// 2 : 필드 깔기
				case 2 : 
					System.out.println("1코 하수인을 냈습니다.");
					System.out.println("턴을 끝냈습니다.");
					System.out.println("-----2턴 진행-----");
					System.out.println("상대 턴");
					System.out.println("상대가 매섭게 달려듭니다...");
					System.out.println("---------------------------");
					System.out.println("악! 이건 정말 아프다");
					System.out.println("--플레이어 패배--");

					switch (classNumber2) {
						case 1 :
							System.out.println("상대 드루이드 승리");
							break;
						case 2 :
							System.out.println("상대 도적 승리");
							break;
						case 3 :
							System.out.println("상대 전사 승리");
							break;
						case 4 :
							System.out.println("상대 사제 승리");
							break;
						case 5 :
							System.out.println("상대 사냥꾼 승리");
							break;
						case 6 :
							System.out.println("상대 마법사 승리");
							break;
						case 7 :
							System.out.println("상대 성기사 승리");
							break;
						case 8 :
							System.out.println("상대 주술사 승리");
							break;
						case 9 :
							System.out.println("상대 흑마법사 승리");
							break;	
						}
					break;
				// 3 : 감정 표현
				case 3 :
					if (classNumber == 4) {
						if (classNumber2 == 4) {
							System.out.println("상대 플레이어가 먼저 감정표현을 합니다.");
							System.out.println("기분이 나빠집니다.");
						} else {	
							System.out.println("사제에게 감정표현은 일상입니다.");
							System.out.println("상대 플레이어가 단단히 벼르고 있습니다...");
							}



					System.out.println("-----2턴 진행-----");
					System.out.println("상대 턴");
					System.out.println("상대가 매섭게 달려듭니다...");
					System.out.println("---------------------------");
					System.out.println("악! 이건 정말 아프다");
					System.out.println("--플레이어 패배--");
				
					} else {
						System.out.println("인성질은 패배의 지름길입니다.");
						System.out.println("--플레이어 패배--");
					}

					break;
				} 

		// 상대 플레이어 선공	
		} else {
			System.out.println("상대 선공");
			System.out.println("-----1턴 진행-----");
			System.out.println("상대가 매섭게 달려듭니다...");
			System.out.println("---------------------------");
			System.out.println("악! 이건 정말 아프다");

			switch (classNumber2) {
			case 1 :
				System.out.println("상대 드루이드 승리");
				break;
			case 2 :
				System.out.println("상대 도적 승리");
				break;
			case 3 :
				System.out.println("상대 전사 승리");
				break;
			case 4 :
				System.out.println("상대 사제 승리");
				break;
			case 5 :
				System.out.println("상대 사냥꾼 승리");
				break;
			case 6 :
				System.out.println("상대 마법사 승리");
				break;
			case 7 :
				System.out.println("상대 성기사 승리");
				break;
			case 8 :
				System.out.println("상대 주술사 승리");
				break;
			case 9 :
				System.out.println("상대 흑마법사 승리");
				break;	
				}
			}

	}
}
