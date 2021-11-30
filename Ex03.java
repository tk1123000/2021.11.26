
public class Ex03 {

	public static void main(String[] args) {

		int[][] array = new int[7][7];
		
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==0&&j==3) {
				array[i][j] = num;
				num++;
				}
				if(i==1&&(j>=2&&j<=4)) {
					array[i][j] = num;
					num++;
				}
				if(i==2&&(j>=1&&j<=5)) {
					array[i][j] = num;
					num++;
				}
				if(i==3&&(j>=0&&j<=6)) {
					array[i][j] = num;
					num++;
				}
				if(i==4&&(j>=1&&j<=5)) {
					array[i][j] = num;
					num++;
				}
				if(i==5&&(j>=2&&j<=4)) {
					array[i][j] = num;
					num++;
				}
				if(i==6&&j==3) {
					array[i][j] = num;
					num++;
				
				}
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
