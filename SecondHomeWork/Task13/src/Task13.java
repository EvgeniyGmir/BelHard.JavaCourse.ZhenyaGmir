import java.util.Scanner;

import java.util.Random;

public class Task13 {
	public static void main (String[] args) {
		int size = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������� ����������� ������� � ������ ��� ���������� ������� ? \n 1)�������. \n 2)������.");
		int n = scan.nextInt();
		switch (n) {
		case 1: {
			System.out.println("������� ����������� �������: ");
			size = scan.nextInt();
			} break;
		case 2: {
			size = 4 + rand.nextInt(10);
			System.out.println("����������� ������� ����� " + size); break;
			}
		default: System.out.println("�� ������� �� ������ �����:)");
		}
		int [][]mas = new int[size][size];
		for(int i = 0; i < mas.length/2; i++) {
			for(int j = 0; j < (mas[i].length); j ++) {
				if(j<i || j >= (mas[i].length - i)) {
					mas[i][j] = 0;
				}else mas[i][j] = 1;
			}
		}
		 for (int i = mas.length-1; i >= mas.length/2; i--){
             for ( int j = 0; j < mas[i].length; j++){
               if ((j<(mas[i].length-1-i)) || (j>i))
                 mas[i][j]=0;
               else
                 mas[i][j]=1;}
       }
       for (int i=0;i<mas.length;i++){
           for(int j=0;j<mas[i].length;j++){
               System.out.print(mas[i][j]);
           }
           System.out.println(" ");
       }
       }
	}
