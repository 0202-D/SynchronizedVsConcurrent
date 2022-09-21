import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Maps {

    public void writeAndRead(Map<Integer,Integer>map){
        int [] arr = generate();
        new Thread(()->{
            for (int i = 0; i <1_000_000 ; i++) {
                map.put(i,arr[i]);
            }
        }).start();
        new Thread(()-> {
            for (int i = 0; i <1_000_000 ; i++) {
                map.get(i);
            }
        }).start();
    }
    public  int[] generate() {
        int[] array = new int[1_000_000];
        Random r = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            array[i] = r.nextInt(5000);
        }
        return array;
    }

}
