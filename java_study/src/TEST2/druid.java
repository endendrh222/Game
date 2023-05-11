package TEST2;

public class druid extends Game {

	public druid(int jobId, String name) {
		super(jobId,name);
		super.job = "드루이드";
		super.maxhp = 48;
		super.hp = maxhp;
		super.skil = "영혼 은총";
		super.skildag = 12;
		super.mode = 1;
}
	
	@Override
	public int  gameMode(int Mode) {
		 //1. 난이도별 밸런스 변경한다.
		maxhp -= (Mode + mode);
		hp = maxhp;
		modeLv += (Mode + mode);
		mode += Mode;
 		//2. 캐릭터 난이도를 리턴
 		return Mode + (int)(mode);
	}
}
