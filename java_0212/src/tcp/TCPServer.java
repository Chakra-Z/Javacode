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
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
        }



    }
}
