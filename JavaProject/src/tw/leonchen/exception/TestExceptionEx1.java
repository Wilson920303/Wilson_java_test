package tw.leonchen.exception;

public class TestExceptionEx1 {

	public void f1() {
		int[] data = {1,2,3,4,5};
		
		try {
			for(int i=0;i<=data.length;i++) {
				System.out.println("data[" + i + "]=" + data[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println("exception");
		}catch(Exception e) {
			System.out.println("e:" + e);
		}finally {
			System.out.println("welcome");
		}
		
		System.out.println("finished");
	}
	
	public static void main(String[] args) {
		TestExceptionEx1 test1 = new TestExceptionEx1();
		test1.f1();
	}

}


//示範 Java 的例外處理機制（try–catch–finally)，以及當發生例外時，程式如何不中斷而繼續執行。