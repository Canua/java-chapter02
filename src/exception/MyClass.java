package exception;

public class MyClass {
	// checked Exception
	public void dangerMethod() throws MyException {
		System.out.println("normal state1");

		boolean isDanger = true;
		if (isDanger) {
			// 예외 상황 발생
			throw new MyException("예외발생"); // throw를 이용해 외부로 에러를 던져서 처리한다는 것을 명시
		}
		System.out.println("normal state2");
	}
}
