package TEST2;

public class necromancer extends Game  {

	public necromancer(int jobId, String name) {
		super(jobId,name);
		super.job = "강령술사";
		super.maxhp = 40;
		super.hp = maxhp;
		super.skil = "망자의 서";
		super.skildag = 15;
		super.mode = 2;
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
