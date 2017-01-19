package study2;

public class Player extends Bar {
	
	public String name;
	public int location;
	
	public String[] piece = new String[5];
	public int[] pieceLocation = new int[4];
	
	
	public Player(char pieces) {
		name = "";
		
		location = -1;
		
		piece[0] = Character.toString(pieces);
		for(int i = 0; i < 4; i++)
		{
			piece[i + 1] = Character.toString(pieces) + (i + 1);
			pieceLocation[i] = 0;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(int location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}
	
	public int getLocation() {
		return location;
	}
	
	public void printName() {
		System.out.printf("%n 플레이어[%s] : " + name, piece[0]);
	}
	
	public void printPiece() {
		System.out.printf("%n 현재 말 : ");
		
		for(int i = 1; i < 5; i++)
		{
			System.out.print(piece[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
}
