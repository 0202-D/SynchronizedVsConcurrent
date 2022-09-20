import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> sMap = Collections.synchronizedMap(new HashMap<Integer, Integer>());
        ConcurrentHashMap<Integer, Integer> cMap = new ConcurrentHashMap<Integer, Integer>();
        Maps maps = new Maps();
        long currentTime = System.currentTimeMillis();
        maps.writeAndRead(sMap);
        long result = System.currentTimeMillis() - currentTime;
        System.out.println(result);
        System.out.println("****************************************");
        long currentTime2 = System.currentTimeMillis();
        maps.writeAndRead(cMap);
        long result2 = System.currentTimeMillis() - currentTime2;
        System.out.println(result2);
    }

}
