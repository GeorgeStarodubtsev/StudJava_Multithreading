public class Test {
    public static void main(String[] args) {

        System.out.println("Hello");
        MyThread thred = new MyThread();
        thred.start();


    }
}

class MyThread extends Thread {
    public void run(){
        while (true){
            System.out.println("World!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
