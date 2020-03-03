package package_thread;

public class CreateThreadTest {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        //thread.run();
        thread.start();// 启动子线程和主线程是同时运行的
        while (true){

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
        }
        //System.out.println(Thread.currentThread().getName());

    }
}
