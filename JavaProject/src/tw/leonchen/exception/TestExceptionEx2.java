package tw.leonchen.exception;

public class TestExceptionEx2 {
	
	public void f2() throws ArithmeticException, Exception{ //Exception: checked,  ArithmeticException: unchecked
		int x=6, y=0;
		System.out.println("x/y=" + (x/y));
	}

	public static void main(String[] args) {//throws Exception {
		TestExceptionEx2 test2 = new TestExceptionEx2();
		try {
		    test2.f2();
		}catch(Exception e) {
			System.out.println("e:" + e);
		}
	}

}

//此程式示範方法宣告例外（throws），以及由呼叫端使用 try–catch 處理例外的方式。