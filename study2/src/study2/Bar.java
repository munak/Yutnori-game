package study2;

public class Bar {
	public int[] barState = new int[4];
	public int sum;
	
	public void roll() {
		for(int i = 0; i < 4; i++)
		{
			barState[i] = (int) (Math.random()*2) + 1;
			sum += barState[i];
		}
	}
	
	public void printBar() {
		for(int i = 0; i < 4; i++)
		{
			if(barState[i] == 2)
			{
				System.out.print(" " + (i + 1) + " : " + "🀆 ");
			}
			
			else
			{
				System.out.print(" " + (i + 1) + " : " + "🀫 ");
			}
		}
		
		System.out.println();
		
		switch(sum)
		{
			case 4:
				System.out.println(" 모입니다.");
				break;
				
			case 5:
				System.out.println(" 도입니다.");
				break;
			
			case 6:
				System.out.println(" 개입니다.");
				break;
				
			case 7:
				System.out.println(" 걸입니다.");
				break;
				
			case 8:
				System.out.println(" 윷입니다.");
				break;
				
			default:
				System.out.println(" 오류입니다.");
				break;
		}
	}
}
