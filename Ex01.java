import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
           int[][]arrya = new int[5][5];
           Scanner sc = new Scanner(System.in);
           System.out.print("���� �Է� : ");
           int a = sc.nextInt();
           
           int num = 1;
           //�Է¹�       �迭�� �� �Է��ϱ�
			for (int i = 0; i < arrya.length; i++) {
				for (int j = 0; j < arrya[i].length; j++) {
					
					arrya[i][j] = num;

					num++;
				}
            	 
             
			}
			
			for (int i = 0; i < a; i++) { //�� ������ �Է� ��ŭ �ݺ�
				for (int j = 0; j < a; j++) { //�� ������ �Է¸�ŭ �ݺ�
					System.out.print(arrya[j][i] + "\t");
                                    //��� ���� �ٲٱ� ���� 
				}
				System.out.println();
			}
		}

	}
