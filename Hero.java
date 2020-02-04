
public class Hero extends Character{
Weapon wp;


public Hero(String name, int hp, int atk,Weapon weapon) 
{
		super(name, hp, atk);
		this.wp=weapon;
	
	}

public String toString()
{
	return super.toString()+wp.toString();
}





public void Attack(Character mon, Weapon extra) {
	{
		int fullatk=this.atk+extra.atk;
		System.out.println(this.name+" attack with "+this.wp.name+" the attack power is "+fullatk);
		mon.hp-=this.atk+extra.atk;
		if(mon.hp<=0)
		{
			mon.hp=0;
			System.out.println(mon.name+" is dead");
		}
		else
		{
			System.out.println(mon.name+" is still alive monster hp remain is "+mon.hp);
		}
	}
	
}

@Override
public void Heal()
{
	System.out.println("Healing.....");
	System.out.println("......");
	this.hp+=100;
	System.out.println("Healed now hp is "+this.hp);
	
}

@Override
public void Talk() {
	System.out.println(this.name+": You doesnt look that tough this will be quick");
	
}
}