package chapter2;

public class LinearSearchMain {
	public static void main(String[] args) {
		LinearSearch table = new LinearSearch();

		table.add(1,"one");
		table.add(10,"ten");
		table.add(2,"two");

		String x;
		x = (String)table.search(10);
		if(x != null) {
			System.out.println("value=" + x);
		}else {
			System.out.println("Not fonud");
		}

	}

}
