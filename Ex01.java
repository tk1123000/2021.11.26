import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
           int[][]arrya = new int[5][5];
           Scanner sc = new Scanner(System.in);
           System.out.print("정수 입력 : ");
           int a = sc.nextInt();
           
           int num = 1;
           //입력문       배열의 수 입력하기
			for (int i = 0; i < arrya.length; i++) {
				for (int j = 0; j < arrya[i].length; j++) {
					
					arrya[i][j] = num;

					num++;
				}
            	 
             
			}
			
			for (int i = 0; i < a; i++) { //행 정수의 입력 만큼 반복
				for (int j = 0; j < a; j++) { //열 정수의 입력만큼 반복
					System.out.print(arrya[j][i] + "\t");
                                    //행과 열을 바꾸기 위함 
				}
				System.out.println();
			}
		}

	}
