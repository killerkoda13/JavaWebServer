import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by alex on 8/12/2017.
 */
public class Dispatcher {

    public static void dispatch(Socket socket) throws IOException {

        Date date = new Date(); //Current time
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + date + " Web Server";
        socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
    }
}
