package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static final String SERVER_IP = "127.0.0.1";
    public static final int PORT_NO = 8080;
    public static void main(String[] args) {

        try (
                //  💡 ServerSocket
                //  - 클라이언트(들)로부터 요청을 받기 위한 소켓
                //  - 연결을 받아 Socket 인스턴스 반환
                ServerSocket serverSkt = new ServerSocket(PORT_NO)
        ) {
            while (true) {
                try (
                        //  💡 Socket : 클라이언트로부터 요청이 오면 반환되는 소켓
                        Socket clientSkt = serverSkt.accept();

                        //  💡 클라이언트로부터 받을 스트림
                        InputStream is = clientSkt.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        StringWriter sw = new StringWriter();
                        PrintWriter piw = new PrintWriter(sw);

                        //  💡 클라이언트에게 보낼 스트림
                        OutputStream os = clientSkt.getOutputStream();
                        //  💡 두 번째 인자 : autoflush
                        //  - 값이 프린트 될 때마다 바로 스트림으로 출력할지 여부
                        PrintWriter pow = new PrintWriter(os, true);
                ) {
                    String line;
                    int lineCount = 1;
                    while ((line = br.readLine()) != null) {
                        piw.printf(
                                "%3d :  %s%n".formatted(
                                        lineCount++, line
                                )
                        );
                        //  💡 클라이언트에게 되돌려보낼 메시지
                        pow.printf("✅ 수신: %s... 등 %d자%n".formatted(
                                line.substring(
                                        0, Math.min(3, line.length())

                                ), line.length()
                        ));
                    }
                    System.out.println(sw);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
