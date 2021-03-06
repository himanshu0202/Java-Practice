package videogame;
import java.util.Arrays;
public class MonsterTwo {
	
	static char[][] battleBoard = new char[10][10];
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	
	private int health = 100;
	private int attack = 20;
	private int movement = 2;
	
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numberOfMonsters = 0;
	
	public static void buildBattleBoard(){
		for(char[] row: battleBoard){
			
			Arrays.fill(row, '*');
			
		}
	}
	
	public static void redrawBoard(){
		int k=1;
		while(k<=30){
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		for(int i=0;i<battleBoard.length;i++){
			for(int j=0;i<battleBoard[i].length;j++){
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}
	
	
	public MonsterTwo(int health,int attack,int movement,String name){
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do{
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		}while(battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
			
	}
	
	public MonsterTwo(){
		
		numberOfMonsters++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonsterTwo.buildBattleBoard();
		//char [][] tempBattleBoard = new char[10][10];
		
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		Monsters[0] = new MonsterTwo(1000,20,1,"Frank");
		Monsters[1] = new MonsterTwo(1000,20,1,"Frank");
		Monsters[2] = new MonsterTwo(1000,20,1,"Frank");
		Monsters[3] = new MonsterTwo(1000,20,1,"Frank");
		
		MonsterTwo.redrawBoard();
	}
		
	

}
