
public class Headoftournament extends Character{
 Weapon wp;
	
	public Headoftournament(Weapon wp)
	{
		super.name="netero";
		super.atk=1000000000;
		super.hp=1000;
		this.wp=wp;
	}
	
	
	
	public String toString()
	{
		return super.toString()+wp.toString();
	}


	@Override
	public void Attack(Character mon, Weapon extra) {
		{
			System.out.println(this.name+" attack with "+this.wp.name+" the attack power is "+this.atk+extra.atk);
			mon.hp-=this.atk+extra.atk;
			if(mon.hp<=0)
			{
				mon.hp=0;
				System.out.println(mon.name+" is dead");
			}
			else
			{
				System.out.println("monster is not dead keep attacking");
				System.out.println(mon.name+" remaining hp "+mon.hp);
			}
		}
		
	}



	@Override
	public void Heal() {
		
		System.out.println("Healing.....");
		System.out.println("......");
		this.hp+=100;
		System.out.println("Healed now hp is "+this.hp);
		
	}



	@Override
	public void Talk() {
		System.out.println(this.name+":hmmm It been awhile there a worthy challenger");
		
	}
}
