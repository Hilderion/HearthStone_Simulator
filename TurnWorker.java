import java.util.Scanner;
import java.util.Random;

public class TurnWorker {
	
	void game () {

		// �÷��̾� ����
		PlayerInfo player = new PlayerInfo();
		player.playerNum = 1;
		player.turnCount = 0;

		// AI ����
		PlayerInfo ai = new PlayerInfo();
		ai.playerNum = 2;
		ai.turnCount = 0;
		
		System.out.println("------------------------------------------");
		System.out.println("hs_simulator_ver_0.03");
		System.out.println("------------------------------------------");

		// �÷��̾� ���� ���� �� ���� �ѹ� �ο�
		SelectClass selectClass = new SelectClass();
		player.classNum = selectClass.classSelect();

		// AI ���� �ο�
		ai.classNum = selectClass.aiAutoSelcet();

		


	}
}