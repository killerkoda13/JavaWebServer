import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by alex on 8/12/2017.
 */
public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Starting web server . . .");


        //Register port listener
        ListenerRegistry registry = new ListenerRegistry();
        registry.registerListener(8080);

        System.out.println("Listening on port 8080");



    }
}
