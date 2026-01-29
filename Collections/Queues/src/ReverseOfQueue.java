import java.util.LinkedList;
import java.util.Queue;

public class ReverseOfQueue {
    static void queuerev(Queue<Integer> q){
       if(q.isEmpty())
           return;
       int x=q.remove();
       queuerev(q);
        q.add(x)  ;
    }
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        queuerev(q);
        System.out.print(q);
    }
}
