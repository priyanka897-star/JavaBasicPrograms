package basicjavaprograms;

public class TripletsAddZero {
	public static void main(String[] args) {
		int mainArray[] =  { 0, -1, 2, -3, 1 };
		int arrayLength = mainArray.length;
		findTriplets(mainArray, arrayLength);

	}

	public static void findTriplets(int[] array, int n) {
		boolean isfound = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						isfound = true;
						System.out.println("The Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}
		if (isfound == false)
			System.out.println("sum of triples element  0 is  not exist in an array ");

	}
}
