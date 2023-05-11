package TEST2;

import java.util.ArrayList;
import java.util.Scanner;

import customer.project.Customer;

public class gameMain {
	private static ArrayList<Game> jobList = new ArrayList<>(); 
	
	public static void main(String[] args) {
		//직업
		Game barbarian = new barbarian(1,"김전사"); //전사류
		Game druid = new druid(2,"김드루");
		Game necromancer = new necromancer(3,"김강령");
		Game rogue = new rogue(4,"김도적");
		Game sorcerer = new sorcerer(5,"김원소");
		
		jobList.add(barbarian);
		jobList.add(druid);
		jobList.add(necromancer);
		jobList.add(rogue);
		jobList.add(sorcerer);
			
		boolean fi = true;
		Scanner scanner = new Scanner(System.in);	
	
		
		
		//전체 직업 출력
		showAllJob();
		
		//게임 시작시 ID로 찾은 직업을 출력
		Game game = findjob(6);
		
		//난이도 조절
		if (game != null) {
			game.gameMode(2);
		} 
		
		
		//직업 확인
		if (game == null) {
			System.out.println("존재하지 않는 직업입니다.");
		} else {
			showjob(game);
		}
		//선택한 직업 난이도
		if (game != null) {
			showMode(game);
		} 
		
		
		//코인 입력
		if (game != null) {
			game.start(2);
		} 
		
		
		//코인 확인
		if (game != null) {
			game.coinCheck();
		} 
	
		
		//게임 시작
		while(fi) {	
		
		int menuNum = scanner.nextInt();
		game.startGame(menuNum);
		
		//coin이 없으면 while문 종료
		if (game.coinCheck() == false) {
			fi = false;} 
		}
		
}
	
	
	
//직업 리스트	
	public static void showAllJob() {
		System.out.println("==========모든 직업 정보 출력==========");
		
		for(Game game : jobList) {
			System.out.println(game.showJobInfo());
		}
	}
	
//현재 난이도 출력
public static void showMode(Game game)	{
	
		System.out.println(game.showModeInfo());
	
}
	
//직업 ID로 직업 찾기
public static Game findjob(int jobId) {
	Game resultGame = null;

	for (Game game : jobList) {
		if(game.getJobId() == jobId) {
			resultGame = game;
			break;
		}
	}
	
	return resultGame;
}

//직업 이름, 스탯 출력
public static void showjob(Game game) {
	System.out.println("=============캐릭터 선택=============");
	System.out.println("캐릭터를 선택했습니다.");
	System.out.println("이름 : " + game.getName());
	System.out.println("직업 : " + game.getJob());
}



}


/*
*/