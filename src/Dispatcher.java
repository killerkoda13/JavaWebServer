import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by alex on 8/12/2017.
 */
public class Dispatcher {

    public static void dispatch(Socket socket) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/index.html") );

        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\r\n\r\n");

        while(line !=null)
        {
            sb.append(line).append("\n");
            line = reader.readLine();
        }
        System.out.println(sb.toString());

        socket.getOutputStream().write(sb.toString().getBytes("UTF-8"));
    }
}
