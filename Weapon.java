
public class Weapon {
 String name;
 int atk;
 
 public Weapon()
 {
	 this.name="none";
	 this.atk=0;
 }
 
 
 public Weapon(String name,int atk)
 {
	 this.name = name;
	 this.atk = atk;
 }
 
 
 public String toString()
 {
	 return "\nWeapon name: "+this.name+"\nAtk of weapon: "+this.atk;
 }
 
 
 
 
}
