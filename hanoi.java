/**
 * This program solves hanoi tower using recursive function
 */
class hanoi {
	static void towerOfHanoi(int n, char rightrod,
							char leftrod, char midrod)
	{
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, rightrod, midrod, leftrod);
		System.out.println("Move disk " + n + " from rod "
						+ rightrod + " to rod "
						+ leftrod);
		towerOfHanoi(n - 1, midrod, leftrod, rightrod);
	}
	public static void main(String args[])
	{
		int N = 3;

		towerOfHanoi(N, 'A', 'C', 'B'); //naming the rods
	}
}

