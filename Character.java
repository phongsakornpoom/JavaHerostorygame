public abstract class Character implements Greet
{

	public String name;
	public int hp,atk;


	public Character()
	{
	
	}
	
	public Character(String name,int hp,int atk)
	{
		this.name=name;
		this.hp=hp;
		this.atk=atk;
	}
	
	public abstract void Attack(Character mon,Weapon wp);
	
	public abstract void Heal();
	
	public String toString()
	{
		return "name:"+this.name+"\nhp: "+this.hp+"\natk: "+this.atk;
	}
}