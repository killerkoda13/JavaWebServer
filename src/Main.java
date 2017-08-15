/**
 * Created by alex on 8/14/2017.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class Main {
    public static void main(String args[]) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Starting to listen on port 8080");
        while (true) {
            try (Socket socket = server.accept()) {

                Date todaysDate = new Date();




                String response = "HTTP/1.1 200 OK\r\n\r\n";


                StringBuilder sb = new StringBuilder();

                BufferedReader bufferedReader = new BufferedReader(new FileReader("src/index.html"));

                String line = response+bufferedReader.readLine();
                while(line !=null)
                {
                    sb.append(line);
                    line = bufferedReader.readLine();
                }


                socket.getOutputStream().write(sb.toString().getBytes("UTF-8"));
            }
        }
    }
}

