
public class entcompworkertester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m = new manager("ive");
		manager s = new manager("ive");
		m.show();
		System.out.println(s);
		
		entcompworker e = new entcompworker();
		e.show();
		
		idol i = new idol("ive", "Gaeul");
		i.show();
		System.out.println(i);
		i.dance();
		i.dance("Love Dive");
	}

}
