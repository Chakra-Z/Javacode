package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    private static final int PORT = 9999;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        // 循环获取新的客户端连接
        while (true){
            // 阻塞，等待新的客户端连接
            Socket socket = serverSocket.accept();
            // 处理这个业务可能发生阻塞
            InputStream is = socket.getInputStream();// 输入字节流
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

            OutputStream os = socket.getOutputStream();// 输出字节流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

            // 1.先接受，并打印
            // 2.响应，我已接收xxx消息

            String line;
            //=========02:47
            while ((line = br.readLine()) != null){
                System.out.println("服务器接收到数据："+line);
                bw.write("我已经接收到了"+line+"消息");// 加换行符！！！
                //bw.write("...")
                // 刷新缓冲区
                bw.flush();
            }
        }
    }
}
