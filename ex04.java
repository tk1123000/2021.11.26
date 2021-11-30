
public class ex04 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
         int num1 =5;
		int num2 = 1;
		for (int i = 0 , k=1; i < array.length; i++,k++) {
			num2=num1*k;
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = num2;
			    num2--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
