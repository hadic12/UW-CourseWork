package Lab9;

public class foo implements Runnable {
	private String name = "";

	public foo(String newName) {
		name = newName;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			int nl = name.length();
			if (i == 10) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Name: " + name + " Size of name: " + nl);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new foo("foo1"));
		Thread t2 = new Thread(new foo("foo2"));

		t1.start();
		t2.start();
	}
}
