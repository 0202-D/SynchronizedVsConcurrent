import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> sMap = Collections.synchronizedMap(new HashMap<>());
        ConcurrentHashMap<Integer, Integer> cMap = new ConcurrentHashMap<>();
        Maps maps = new Maps();
        maps.writeAndRead(sMap);
        System.out.println("****************************************");
        maps.writeAndRead(cMap);
    }

}
