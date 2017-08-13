import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by alex on 8/12/2017.
 */
public class ListenerRegistry {

    static ServerSocket server;

    public void registerListener(int port) throws IOException {
        this.server = new ServerSocket(port);

        while (true){
            try(Socket socket = server.accept()){
                Dispatcher.dispatch(socket);
            }
        }

    }
}
