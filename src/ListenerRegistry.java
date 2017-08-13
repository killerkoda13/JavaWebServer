import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by alex on 8/12/2017.
 */
public class ListenerRegistry {

    static ServerSocket server;

    public void registerListener(int port) throws IOException {
        this.server = new ServerSocket(port);
    }
}
