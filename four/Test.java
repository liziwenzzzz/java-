package four;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("input the absolute path of file:");
		String path = new Scanner(System.in).nextLine();
		Helper it = new Helper();
		it.getFileContent(path);

		int flag = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1.get count of letter\n2.get count of word");
			flag = input.nextInt();
			switch (flag) {
			case 1:
				it.countLetter();
				it.showLetterCount();
				break;
			case 2:
				it.countWord();
				it.showWordCount();
				break;
			default:
				System.out.println("input wrong,exit!");
				return;
			}
		}
	}
}
