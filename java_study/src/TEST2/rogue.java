package TEST2;

public class rogue extends Game {

	public rogue(int jobId, String name) {
		super(jobId,name);
		super.job = "도적";
		super.maxhp = 30;
		super.hp = maxhp;
		super.skil = "그림자 영역";
		super.skildag = 20;
		super.mode = 3;
		
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
