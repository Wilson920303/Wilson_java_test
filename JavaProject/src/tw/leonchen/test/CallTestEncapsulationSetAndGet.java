package tw.leonchen.test;

public class CallTestEncapsulationSetAndGet {
    public static void main(String[] args) {
        TestEncapsulationSetAndGet setandget = new TestEncapsulationSetAndGet();
        setandget.setName("Michael Jordan");
        String theName = setandget.getName();
        System.out.println("theName=" + theName);
    }
}