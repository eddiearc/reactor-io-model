package pro.eddievim.reactor.single;

import java.io.IOException;

/**
 * @author eddie
 * @create 2021/3/27 15:49
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new Thread(new Reactor(11111)).start();
    }
}