import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		int quit=0;
		int coin=0;
		String condition[]= {"1","2","3"};
		String conditionny[]= {"1","2"};
		int choice=0;
		Weapon wp2=new Weapon("Fishingrod",100);
	    Opponent hero2=new Opponent("Gon",100,100,wp2);
		Weapon wp=new Weapon("Yo-yo",100);
		Weapon wp1=new Weapon("Thousand hand punch shower",1000);
		Hero hero=new Hero("killua", 100, 10,wp);
		Headoftournament god=new Headoftournament(wp1);
		Weapon weaponarray[]= {wp2,wp1,wp};
		Opponent2 mon=new Opponent2("Illumi", 200, 0,wp);
		Character[] participant = {hero2,god,mon};
		
		//do here
	    System.out.println("Once upon a time there live a boy name Killua who was confine in a house but one day.");
	    System.out.println("He has find a way out to freedom but there. He got no place to go so for entertainment he went to participate in");
	    System.out.println("Fighting tournament.");
	    System.out.println("Your Character is "+hero.name);
	    System.out.println(hero);
	    hero.Talk();
	    System.out.println("================");
	    do {
			System.out.println("Who do you want to fight?");
			for(int i=0;i<participant.length;i++)
			{
				System.out.println((i+1)+". "+participant[i].name);					
			}
			choice=intChecker(3);
	do {
		System.out.println(participant[choice-1]);
		participant[choice-1].Talk();
		System.out.println("================");
		System.out.println("Do you want to attack "+participant[choice-1].name+"?\n1 for yes and n for no ");
		String answer=inputChecker(conditionny);
		switch(answer)
			{
		case "1":hero.Attack(participant[choice-1],wp);//change the character to change attack power
			break;
		case "2":System.out.println("Dont be a coward");
			}
			int chance=(int)(Math.random()*3);
	if(chance==0)
		{
			participant[choice-1].Heal();
		}
		else if(chance==1)
		{
			System.out.println("Monster did nothing");
		}
		else
		{
			participant[choice-1].Attack(hero2,weaponarray[choice-1] );
		}
		
		}while(participant[choice-1].hp!=0);	
			System.out.println("you win");
			coin++;
			System.out.println("Welcome to the Shop!");
			System.out.println("Your coin: "+coin);
			System.out.println("1.Continue 2.Attack up potion:2coin 3.quit");
			String opt=inputChecker(condition);
			switch(opt)
			{
			case "1":System.out.println(hero);
			break;
			case "2":
				if(coin>=2) 
				{
				hero.atk+=100;
				System.out.println("Your attack has increase by 100 it now "+hero.atk);
				System.out.println(hero);
				}
				else
				{
				System.out.println("Not enought coin");
				System.out.println(hero);
				}
			break;
			case "3":quit=1;
			}
		    }while(quit!=1);
		}	
	public static String inputChecker(String[] condition)
	{
		String user_input = null;
		int key = 1;
		while (key==1)
		{
			Scanner console = new Scanner(System.in); 
			String box = console.nextLine(); 
			for (int i = 0; i<condition.length; i++)
			{
				if (box.equalsIgnoreCase(condition[i]))
				{
					user_input = box;
					key=0;
					break;
				}			
				else if (i == condition.length-1 && !box.equals(condition[i]))
				{
					System.out.println("Please try again");
				}
						
			}
		
		}
		return user_input;
	}
	public static int intChecker(int max)
	{
		Scanner console = new Scanner(System.in);
		int userInput = 0;
		do
		{
			if (console.hasNextInt())
			{
				userInput = console.nextInt();
				if (userInput <= 0)
				{
					System.out.println("Please specify by postive numbers");
				}
				else if (userInput > max)
				{
					System.out.println("Too many, please try again.");
				}
			}
			else
			{
				System.out.println("Please try again using numbers");
				console.next();
			}
			
		}while (userInput <= 0 || userInput > max);
		System.out.println(String.format("intChecker: %d",	userInput));
		return userInput;
	}
	
}
