package tcp;

import javax.jnlp.ExtendedService;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TCPServer {

    private static final int PORT = 9999;
    /**
     * 参数1：核心线程数
     * 参数2：最大线程数
     * 参数3+4：一定数量的时间+时间单位。在时间内，临时工的线程没有任务处理，就把临时工解雇掉
     * 参数5：无边界的工作队列
     * 参数6：代表任务数量超出最大值，线程池应该怎么做（4种策略）
     */
//    private static final ThreadPoolExecutor POOL = new ThreadPoolExecutor(
//            0, Integer.MAX_VALUE,30, TimeUnit.SECONDS,
//            new LinkedBlockingQueue<Runnable>(),new ThreadPoolExecutor.CallerRunsPolicy()
//    );

    // 有新任务进来需要处理。此时若有正式工，先正式工处理，否则临时工处理
    // 都没有，则创建新的线程

//    // 单个线程的线程池: 只有一个正式工
//    private static final ExecutorService EXE = Executors.newSingleThreadExecutor();
//    // 可缓存的线程：都是临时工
    private static final ExecutorService EXE = Executors.newCachedThreadPool();
//    // 定时任务的线程池
//    private static final ExecutorService EXE = Executors.newScheduledThreadPool(1);
//    // 固定大小的线程池：固定数量的正式工
//    private static final ExecutorService EXE = Executors.newFixedThreadPool(1);


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        // 循环获取新的客户端连接

        while (true){
            // 阻塞，等待新的客户端连接
            Socket socket = serverSocket.accept();

            EXE.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 处理这个业务可能发生阻塞
                        InputStream is = socket.getInputStream();// 输入字节流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

                        OutputStream os = socket.getOutputStream();// 输出字节流
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

                        // 1.先接受，并打印
                        // 2.响应，我已接收xxx消息

                        String line;
                        //=========02:47
                        // 阻塞等待客户端新传来的数据
                        // readLine 在不停接收
                        while ((line = br.readLine()) != null){

                            System.out.println("服务器接收到数据："+line);

                            bw.write("我已经接收到了"+line+"消息\n");// 加换行符！！！
                            //bw.write("...")
                            // 刷新缓冲区
                            bw.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            });


        }
    }
}

//package tcp;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class TCPServer {
//
//    private static final int PORT = 9999;
//
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(PORT);
//        // 循环获取新的客户端连接
//
//        while (true){
//            // 阻塞，等待新的客户端连接
//            Socket socket = serverSocket.accept();
//
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        // 处理这个业务可能发生阻塞
//                        InputStream is = socket.getInputStream();// 输入字节流
//                        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
//
//                        OutputStream os = socket.getOutputStream();// 输出字节流
//                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
//
//                        // 1.先接受，并打印
//                        // 2.响应，我已接收xxx消息
//
//                        String line;
//                        //=========02:47
//                        // 阻塞等待客户端新传来的数据
//                        // readLine 在不停接收
//                        while ((line = br.readLine()) != null){
//
//                            System.out.println("服务器接收到数据："+line);
//
//                            bw.write("我已经接收到了"+line+"消息\n");// 加换行符！！！
//                            //bw.write("...")
//                            // 刷新缓冲区
//                            bw.flush();
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }).start();
//
//
//        }
//    }
//}
