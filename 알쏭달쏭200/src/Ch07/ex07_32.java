package Ch07;

import java.util.Scanner;

public class ex07_32 {

	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	static void printBits(short x) {
		for (int i = 15; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	static void printBits(long x) {
		for (int i = 63; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("byte�� ���� a�� ��:");
		byte a = sc.nextByte();
		System.out.println("shotr�� ���� b�� ��:");
		short b = sc.nextShort();
		System.out.println("int�� ���� c�� ��:");
		int c = sc.nextInt();
		System.out.println("long�� ���� d�� ��:");
		long d = sc.nextLong();

		System.out.println("a�� ��Ʈ:");
		printBits(a);
		System.out.println("\nb�� ��Ʈ:");
		printBits(b);
		System.out.println("\nc�� ��Ʈ:");
		printBits(c);
		System.out.println("\nd�� ��Ʈ:");
		printBits(d);
		
	}

}
