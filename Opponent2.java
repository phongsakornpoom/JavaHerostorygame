public class Opponent2 extends Character{
Hero hero;
Weapon wp;
public Opponent2(String name, int hp, int atk,Weapon wp)
{
		super(name, hp, atk);
		this.wp=wp;
}


public String toString()
{
return super.toString();
}


@Override
public void Attack(Character mon, Weapon extra) {
	{
		System.out.println(mon.name+"attack");
		mon.hp-=this.atk+extra.atk;
		if(mon.hp<=0)
		{
			mon.hp=0;
			System.out.println(mon.name+" is dead");
		}
		else
		{
			System.out.println(mon.name+" is still standing");
		}	
	}
	
	
	
	
}


@Override
public void Heal()
{
	System.out.println(this.name+" heal");
	System.out.println("......");
	this.hp+=100;
}


@Override
public void Talk()
{
	System.out.println(this.name+": Why do you fight if you know you cant win");
	
	
}
}

