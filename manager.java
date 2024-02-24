
public class manager extends entcompworker{
	String groupmanaged;
	
	public manager(String gm) {
		super("starship ent", 32, 50000);
		groupmanaged = gm;
	}
	
	public void show() {
		System.out.println("This is the manager of " + groupmanaged + ". They are " + getage() + " and their annual salary is " + getsal() + ".");
	}
	
	public boolean equals(Object other) {
		manager e = (manager) other;
		return (this.groupmanaged.equals(e.groupmanaged));
	}
	
	public String toString() {
		return "[authorized personell ID required]";
	}
	
}
