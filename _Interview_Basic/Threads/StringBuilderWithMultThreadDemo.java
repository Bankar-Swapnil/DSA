
public class StringBuilderWithMultThreadDemo implements Runnable {
 
    StringBuilder strBuilder;
    StringBuffer strBuffer;
 
    public StringBuilderWithMultThreadDemo() {
        strBuilder = new StringBuilder();
        strBuffer = new StringBuffer();
    }
 
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            addChar();
        }
    }
 
    public void addChar() {
            strBuilder.append("A");
            strBuffer.append("B");
    }
 
    public static void main(String[] args) {
 
        StringBuilderWithMultThreadDemo strBldrWthThrdDmobj1 = new StringBuilderWithMultThreadDemo();
 
        Thread threadOne = new Thread(strBldrWthThrdDmobj1, "Thread One");
        Thread threadTwo = new Thread(strBldrWthThrdDmobj1, "Thread Two");
        threadOne.start();
        threadTwo.start();
 
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final StringBuilder Length: " + strBldrWthThrdDmobj1.strBuilder.length() );
        System.out.println("Final StringBuffer Length: " + strBldrWthThrdDmobj1.strBuffer.length() );
    }
}