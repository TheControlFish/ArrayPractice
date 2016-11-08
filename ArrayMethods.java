
public class ArrayMethods {
	private int[] values;
	public ArrayMethods(int[] initialValues){
		values = initialValues;
	}
	public void swapFirstAndLast(){
		int first = values[0];
		values[0] = values[values.length-1];
		values [values.length-1] = first;
	}
	public void shiftRight(){
		int last = values[values.length - 1];
		for (int n = values.length - 1; n > 0; n--){
			values[n] = values[n - 1];
		}
		values[0] = last;
	}
	public void replaceEven(){
		for (int n = 0; n < values.length; n++){
			if (values[n] % 2 == 0){
				values[n] = 0;
			}
		}
	}
	public void replaceLarger(){
		for (int n = 1; n < values.length - 1; n++){
			if (values[n - 1] > values[n+1]){
				values[n] = values[n-1];
			}
			else {
				values[n] = values[n+1];
			}
		}
	}
	public void removeMiddle(){
		if (values.length % 2 == 0){
			values[values.length / 2 - 1] = 0;
			values[values.length / 2] = 0;
		}
		else {
			values[values.length / 2] = 0;
		}
	}
	public void moveEvenFront(){
		int []even = new int[values.length];
		int []odd = new int[values.length];
		int evenNum = 0;
		int oddNum = 0;
		for (int n = 0; n < values.length; n++){
			if (values[n] % 2 == 0){
				even[evenNum] = values[n];
				evenNum++;
			}
			else {
				odd[oddNum] = values[n];
				oddNum++;
			}
		}
		for (int n = 0; n < evenNum; n++){
			values[n] = even[n];
		}
		for (int n = 0; n < oddNum; n++){
			values[n + evenNum] = odd[n];
		}
	}
	public int findSecondLargest(){
		int largest = values[0];
		int largest2 = values[0];
		for (int n = 1; n < values.length; n++){
			if (values[n] > largest){
				largest = values[n];
			}
		}
		for (int n = 1; n < values.length; n++){
			if (values[n] > largest2 && values[n] < largest){
				largest2 = values[n];
			}
		}
		return largest2;
	}
	public boolean increasingOrder(){
		boolean inc = true;
		for (int n = 1; n < values.length; n++){
			if (values[n] < values[n-1]){
				inc = false;
			}
		}
		return inc;
	}
	public boolean adjacentDuplicate(){
		boolean duplicate = false;
		for (int n = 1; n < values.length; n++){
			if (values[n] == values[n-1]){
				duplicate = true;
			}
		}
		return duplicate;
	}
	public boolean duplicate(){
		boolean duplicate = false; 
		for (int n = 0; n < values.length; n++){
			for (int i = n + 1; i < values.length; i++){
				if (values[n] == values[i]){
					duplicate = true;
				}
			}
		}
		return duplicate;
	}
}
