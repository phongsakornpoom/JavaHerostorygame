
public class Killua 
{
	String name,race;
	int atk;
	Weapon wp;
	public Killua(int atk,Weapon wp)
	{
		this.name="Killua";
		this.race="human";
		this.atk=atk;		
		this.wp=wp;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\nRace: "+this.race+"\nAttack point: "+this.atk+"\nWeapon: "+this.wp.name;
	}
	
	public String Weaponinfo()
	{
		return "Weapon name: "+this.wp.name+"\nuser: "+this.name+"\nTotal attack: "+(this.wp.atk+this.atk);
	}
	
	public void quit()
	{
		System.out.println(this.name+" win");
	}

}
