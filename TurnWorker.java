import java.util.Scanner;
import java.util.Random;

public class TurnWorker {
	
	void game () {

		// 플레이어 생성
		PlayerInfo player = new PlayerInfo();
		player.playerNum = 1;
		player.turnCount = 0;

		// AI 생성
		PlayerInfo ai = new PlayerInfo();
		ai.playerNum = 2;
		ai.turnCount = 0;
		
		System.out.println("------------------------------------------");
		System.out.println("hs_simulator_ver_0.03");
		System.out.println("------------------------------------------");

		// 플레이어 직업 선택 및 직업 넘버 부여
		SelectClass selectClass = new SelectClass();
		player.classNum = selectClass.classSelect();

		// AI 직업 부여
		ai.classNum = selectClass.aiAutoSelcet();

		


	}
}