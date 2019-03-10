import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
//입력:키보드로 두수의 입력을 받는다.
		// 출력:화면에 두수의 합을 출력한다.
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두수의 합을 구하시오");
		s1 = scanner.next();
		s2 = scanner.next();
//String s1,s2를 integer.parseInt로 사용하여 int형으로 형변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		System.out.printf("%d와%d의합은%d입니다.", a, b, a + b);
		scanner.close();
	}

}
