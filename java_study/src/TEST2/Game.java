package TEST2;

public class Game {
//	필드
	int coin; //목숨
	protected String name; //캐릭명
	protected String job; //직업명
	protected int jobId; //직업ID
	int lv = 1; // 캐릭터 레벨
	int maxhp= 10; //캐릭터 최대체력  
	int hp= maxhp; //캐릭터 현재체력
	int armor = 0; //캐릭터 방어력
	protected String skil = "";
	protected int skildag = 0;
	int mode ;
	int modeLv = 1; //몬스터 레벨
	int monster = (int) (Math.random() * 50) + 1; //몬스터 체력
	public String getName() {
		return name;
	}

	



	int monsterhp = monster;
	int num;
	boolean run = true;
	
	//	생성자  즁요! 인스턴스가 생성될때 한번만 실행!
	
	
 	public Game(int jobId, String name) {
 		this.name = name;
 		this.jobId = jobId;
 	}
	
//	메소드 중요! 메소드는 여러번 실행된다.
 	 public int gameMode(int Mode) {
 		 //1. 캐릭터 마다 난이도를 변경한다.
 		maxhp += (Mode + mode);
 		modeLv += (Mode + mode);
 		//2. 캐릭터 난이도를 리턴
 		return Mode;
 	}
// 	void Mode() {
// 		gameMode(mode);	
//	}
// 	 
 	void start(int coin) { 
		this.coin += coin;
		System.out.println("=============게임 시작=============");
		System.out.println("적이 나타났습니다.");
		System.out.println("몬스터 Lv : " + modeLv + " / " + "적의 남은 HP : " + monster + "/" + monsterhp);
		
 	}
 	
 	boolean coinCheck() { //
		if (coin <= 0) {
			System.out.println("coin이 없습니다.");
			System.out.println("게임을 종료합니다.");
			return false; //메소드 종료
		}
		System.out.println("--------------------------------------");
		System.out.println("1.공격 2.스킬 3.방어 4.도망 " + " coin 잔량 : " + coin);
		System.out.println("--------------------------------------");
		return true; //메소드 종료
	}
 	
 	
 	
 	
 	void startGame(int num) {
 		
 		while(run) {

 			
 			    if(this.coin > 0) { 
 			    //코인이 있으면 게임시작
 				
 			    // 데미지 초기 설정
 				int dag = (int) (Math.random() * 8) + lv;
 				int mondag = (int) (Math.random() * 5) + modeLv;
 				
 				// 유저 입력 시 동작 기능
				switch (num) {
				case 1:
					System.out.println("공격 했습니다.");
					System.out.println("데미지 : " + dag  );
					monster -= dag;
					System.out.println("적의 남은 HP : " + monster + "/" + monsterhp);
					break;
				case 2:
					System.out.println("스킬 사용 : " + this.skil);
					System.out.println("데미지 : " + this.skildag);
					monster -= skildag;
					System.out.println("적의 남은 HP : " + monster + "/" + monsterhp);
					break;
				case 3:
					System.out.println("방어 했습니다.");
					armor += 1;
					break;
				case 4:
					System.out.println("도망쳤습니다.");
//					run = false;
					break;
				}
				
				if(mondag - armor >= 0 && monster > 0) {
					System.out.println("===============================");
					System.out.println("적이 공격합니다.");
					System.out.println("데미지 : " + mondag  );
					hp -= (mondag - armor);
					if(hp <= 0 && coin > 1) {
						System.out.println("===============================");
						coin -= 1; 
						hp = maxhp;
						System.out.println("사망했지만 코인을 사용해 부활 했습니다. / " + "현재 코인 : " + coin);
					} else if (hp <= 0 && coin <= 1) {	
						coin -= 1; 
						System.out.println("===============================");
						System.out.println("게임오버");
						System.out.println("===============================");
					}
				} else {
					System.out.println("공격을 회피했습니다.");
				}
						
				System.out.println("나의 HP : " + hp + "/" + maxhp);
					
				if (monster <= 0) {
					System.out.println("몬스터를 해치웠습니다.");
					lv += 1;
					System.out.println("=================레벨업==============");
					System.out.println("현재 레벨 : " + lv);
					monster = monsterhp + 10;
					monsterhp += 10;
					System.out.println("새로운 적 등장");
					System.out.println("적 HP : " + monster + "/" + monsterhp);
				}
				return;
			}
		}
 		
 	}
 	
 	public String getSkil() {
		return skil;
	}

	public void setSkil(String skil) {
		this.skil = skil;
	}

	public int getSkildag() {
		return skildag;
	}

	public void setSkildag(int skildag) {
		this.skildag = skildag;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public int getJobId() {
		return jobId;
	}

public String showJobInfo() {
	return "직업 : " + job + " / " + "스킬 : " + skil + " / " +"난이도 : " + gameMode(0) ;
}

public String showModeInfo() {
	return "현재 난이도 : " + gameMode(0);
}

	
	}


