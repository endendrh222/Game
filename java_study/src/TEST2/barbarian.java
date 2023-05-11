package TEST2;

public class barbarian extends Game {


	
	public barbarian(int jobId, String name) {
		super(jobId,name);
		super.job = "야만용사";
		super.maxhp = 50;
		super.hp = maxhp;
		super.skil = "선조의 망치";
		super.skildag = 10;
		super.mode = 0;
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
