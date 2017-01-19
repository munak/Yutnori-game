package study2;

public class Board {
	
	public String[] arry1 = new String[20];
	public String[] arry2 = new String[6];
	public String[] arry3 = new String[6];
	
	public String space = "     ";
	
	final String c1 = "  T  ";
	final String c2 = "  o  ";
	
	public Board() {
		for(int i = 0; i < 20; i++)
		{
			if((i % 5) != 0)
			{
				arry1[i] = c2;
			}
			
			else
			{
				arry1[i] = c1;
			}
			
			if(i < 6)
			{
				if((i % 3) != 0)
				{
					arry2[i] = c2;
					arry3[i] = c2;
				}
				
				else
				{
					arry2[i] = c1;
					arry3[i] = c1;
				}
			}
		}
	}
	
	public void printBoard() {
		for(int i = 0; i < 11; i++)
		{
			for(int j = 0; j < 11; j++)
			{
				if(i % 2 == 0)
				{
					if((i == 0) || (i == 10))
					{
						if(j % 2 == 0)
						{
							if((i == 0) && (j == 0))
							{
								System.out.printf("%n%n" + arry3[0]);
							}
							
							else if((i == 0) && (j == 10))
							{
								System.out.print(arry2[0]);
							}
							
							else
							{
								System.out.print(arry1[10 - j/2]);
							}
						}
						
						else
						{
							System.out.print(space);
						}
					}
					
					else
					{	
						if(j == 0)
						{
							System.out.print(arry1[10 + (i / 2)]);
						}
						
						else if(j == 10)
						{
							System.out.print(arry1[5 - (i / 2)]);
						}
						
						else
						{
							System.out.print(space);
						}
					}
				}
				
				else
				{
					if(j == i)
					{
						System.out.print(arry3[(i + 1) / 2]);
					}
					
					else if((10 - j) == i)
					{
						System.out.print(arry2[(i + 1) / 2]);
					}
					
					else
					{
						System.out.print(space);
					}
					
				}
			}
			
			System.out.printf("%n%n");
		}
	}
}
