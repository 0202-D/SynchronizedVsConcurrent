import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Maps {

    public void writeAndRead(Map<Integer,Integer>map){
        int [] arr = generate();
        long start = System.nanoTime();
        new Thread(()->{
            for (int i = 0; i <1_000_000 ; i++) {
                map.put(i,arr[i]);
            }
        }).start();
        long timeForWrite = System.nanoTime()-start;
        System.out.println("Time for write : "+timeForWrite);
        long start2 = System.nanoTime();
        new Thread(()-> {
            for (int i = 0; i <1_000_000 ; i++) {
                map.get(i);
            }
        }).start();
        long timeToRead2 = System.nanoTime()-start2;
        System.out.println("Time to read : "+timeToRead2);
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
