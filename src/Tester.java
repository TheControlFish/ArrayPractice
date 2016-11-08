
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {4,12,6,8,90,5,2,7};
		ArrayMethods blah = new ArrayMethods(a);
		blah.swapFirstAndLast();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println();
		blah.shiftRight();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println();
		blah.replaceEven();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println();
		blah.replaceLarger();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println();
		blah.removeMiddle();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println();
		blah.moveEvenFront();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");
		}
		System.out.println("\n" + blah.findSecondLargest());
		System.out.println("\n" + blah.increasingOrder());
		System.out.println("\n" + blah.adjacentDuplicate());
		System.out.println("\n" + blah.duplicate());
	}

}
