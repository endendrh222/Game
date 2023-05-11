package game;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
	private static Game instance = null;
	private static String GAME_NAME = "Good Game";
	private ArrayList<Monster> monsterList = new ArrayList<>();
	private ArrayList<Dungeon> dungeonList = new ArrayList<>();

	private Game() {}
	
	public static Game getInstance() {
		if(instance == null) {
			instance = new Game();
		}
		return instance;
	}
	
	//몬스터 추가
	public void addMonster(Monster monster) {
		monsterList.add(monster);
	}
	
	//던전 추가
	public void addDungeon(Dungeon dungeon) {
		dungeonList.add(dungeon);
	}
	
	//게임에 등록한 몬스터리스트 출력
	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}
	
	//게임에 등록한 던전리스트 출력
	public ArrayList<Dungeon> getDungeonList() {
		return dungeonList;
	}
	
}
