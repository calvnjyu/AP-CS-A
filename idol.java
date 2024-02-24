
public class idol extends entcompworker{
	String partof;
	String name;
	
	public idol(String gm, String n) {
		super("starship ent", 18, 65000);
		partof = gm;
		name = n;
	}
	
	public void dance(String song) {
		System.out.println(name + " does a dance to " + song + ".");
	}
	
	public void show() {
		System.out.println("This is " + name + ". They are " + getage() + ", their annual salary is " + getsal() + ", and they are a part of the group " + partof + ".");
	}
	
	public void dance() {
		System.out.println(name + " does a silly dance.");
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean equals(Object other) {
		idol i = (idol) other;
		return (this.name.equals(i.name) && this.partof.equals(i.partof));
	}
}
