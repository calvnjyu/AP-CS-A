
public class entcompworker {
	private String name;
	private int age;
	protected int salary;
	
	public entcompworker() {
		name = "";
		age = 0;
		salary = 0;
	}
	
	public entcompworker(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public int getsal() {
		return salary;
	}
	
	public void show() {
		System.out.println("This is a person working under " + name + ". They are " + age + " and their annual salary is " + salary + ".");
	}
	
	public boolean equals(Object other) {
		entcompworker e = (entcompworker) other;
		return (e.name.equals(this.name) && e.age == this.age && this.salary == e.salary);
	}
	
	public String toString() {
		return this.name;
	}
}
