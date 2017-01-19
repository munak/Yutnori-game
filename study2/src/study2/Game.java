package study2;

 import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int exitNum;
		int playerNum = 0, pieceNum = 0;
		String playerName, pieceName;
		
		Scanner input = new Scanner (System.in);
		
		while((playerNum < 2) || (playerNum > 4))
		{
			System.out.print(" 참가자 수 입력 (2 ~ 4) : ");
		
			playerNum = input.nextInt();
		}
		
		Player[] p = new Player[playerNum];

		for(int i = 0; i < playerNum; i++)
		{
			p[i] = new Player((char) ('A' + i));
			
			p[i].printName();
			playerName = input.next();
			p[i].setName(playerName);
		}
		
		for(int i = 0; i < playerNum; i++)
		{
			p[i].printName();
			p[i].printPiece();
		}
		
		
		System.out.print(" 말을 골라주세요 (1 ~ 4) : ");
		pieceNum = input.nextInt();
		
		pieceName = p[0].piece[pieceNum];
		p[0].piece[pieceNum] = "XX";
		
		//for(int i = 0; i < playerNum; i++)
		{
			p[0].roll();
			p[0].printBar();
		}
		
		if(p[0].sum != 4)
		{
			p[0].pieceLocation[pieceNum - 1] += (p[0].sum - 4);
		}
		
		else
		{
			p[0].pieceLocation[pieceNum - 1] += (p[0].sum + 1);
		}
		
		Board b1 = new Board();
		
		b1.arry1[p[0].pieceLocation[pieceNum - 1]] = "  " + pieceName + " ";
		
		b1.printBoard();
		
	}

}
