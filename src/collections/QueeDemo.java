package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;



public class QueeDemo {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<>();
		System.out.println(queue.peek());
		
		Random random=new Random();
		
		for(int i=1;i<=10;i++) {
			queue.offer(random.nextInt());	
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
