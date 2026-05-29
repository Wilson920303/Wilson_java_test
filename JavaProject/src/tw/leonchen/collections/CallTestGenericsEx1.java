package tw.leonchen.collections;

class TestInteger{
	
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}
	
}

class TestDouble{
	
	private Double d1;

	public Double getD1() {
		return d1;
	}

	public void setD1(Double d1) {
		this.d1 = d1;
	}
	
}

//...

class TestGenericsEx1<T>{
	
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}	
	
}


public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		TestInteger test1 = new TestInteger();
		test1.setI1(6);
		Integer result1 = test1.getI1();
		System.out.println("result1:" + result1);
		
		TestDouble test2 = new TestDouble();
		test2.setD1(3.14);
		Double result2 = test2.getD1();
		System.out.println("result2:" + result2);
		
		TestGenericsEx1<Integer> test3 = new TestGenericsEx1<Integer>();
		test3.setT1(7);
		Integer result3 = test3.getT1();
		System.out.println("result3:" + result3);
	}

}

//用來說明「沒有泛型」會產生重複類別，而「使用泛型」可以用同一個類別處理不同資料型別。
