package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("some codes....");
			int k = 100000 / a;
			System.out.println("more codes....1");
		} catch (ArithmeticException ex) {
			// 기본적인 catch문 입력 사항
			// 1. 로그 남기기...(가능 하다면 파일로 남기기)
			System.out.println(ex);

			// 2. 사과
			System.out.println("죄송합니다. 예기치....");

			// 3. 정상종료
			return;

			// 4. 이거라도 안되면,
			// ex.printStackTrace();
		} finally {
			System.out.println("자원정리");
		}
		System.out.println("more codes....2");
	}
}
