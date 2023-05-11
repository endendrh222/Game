package TEST2;

public class sorcerer extends Game {

	public sorcerer(int jobId, String name) {
		super(jobId,name);
		super.job = "원소술사";
		super.maxhp = 20;
		super.hp = maxhp;
		super.skil = "마법 강화";
		super.skildag = 20;
		super.mode = 4;
}
	@Override
	public int  gameMode(int Mode) {
		 //1. 난이도별 밸런스 변경한다.
		maxhp -= (Mode + mode);
		modeLv += (Mode + mode);
		mode += Mode;
		hp = maxhp;
 		//2. 캐릭터 난이도를 리턴
 		return Mode + (int)(mode);
	}
}
