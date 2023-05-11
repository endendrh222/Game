package test3;

import java.util.ArrayList;

public class Monster {
	private int monsterId; //몬스터번호
	private String monsterName; //이름
	private Dungeon majorDungeon; //등장던전
	private ArrayList<Rank> rankList = new ArrayList<>(); //몬스터 전투력 리스트
	
	public Monster(int monsterId, String monsterName,Dungeon majorDungeon) {
		this.monsterId = monsterId;
		this.monsterName = monsterName;
		this.majorDungeon = majorDungeon;		
	}
	
	public void addDungeonRank(Rank rank) {
		rankList.add(rank);
	}

	public int getMonsterId() {
		return monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	public Dungeon getMajorDungeon() {
		return majorDungeon;
	}

	public void setMajorDungeon(Dungeon majorDungeon) {
		this.majorDungeon = majorDungeon;
	}

	public ArrayList<Rank> getRankList() {
		return rankList;
	}

	public void setRankList(ArrayList<Rank> rankList) {
		this.rankList = rankList;
	}
		
	
}
