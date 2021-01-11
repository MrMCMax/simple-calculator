
public class Calculator {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: calculator int1 int2");
			System.exit(0);
		}
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + " + " + b + " = " + (a + b));
		} catch (NumberFormatException e) {
			System.out.println("Please input valid numbers");
		} finally {
			System.exit(0);
		}
	}
}
