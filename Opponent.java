
public class Opponent extends Character {
Weapon wp;
    public Opponent(String name,int hp,int atk,Weapon wp) {
		super(name,hp,atk);
		this.wp=wp;
	}
	@Override
	public void Talk() {
		System.out.println(this.name+":let have fun");
		
	}
	@Override
	public void Attack(Character mon, Weapon extra) {
		System.out.println(this.name+" attack with "+this.wp.name+" the attack power is "+this.atk+extra.atk);
		mon.hp-=this.atk+extra.atk;
		if(mon.hp<=0) {
			mon.hp=0;
			System.out.println("jajaken gu "+mon.name+" is dust");
		}
		else
		{
		System.out.println(mon.name+"is still standing with "+mon.hp+" hp");	
		}
	}

	@Override
	public void Heal() {
		System.out.println("healing");
		this.hp+=100;
		System.out.println("your hp is "+this.hp);
		
	}
	
	public String toString()
	{
		return super.toString()+wp.toString();
	}

}
