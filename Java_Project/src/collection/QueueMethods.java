package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueMethods {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		// in priority queue heterogeneous data not allowed
		//Adding elements using add and offer method
		pq.add(100);
		pq.add(200);
		pq.offer(300);
		pq.offer(400);
		pq.offer(200);
		System.out.println(pq);// insertion order preserved and duplicate allowed
		
		//get head element
		System.out.println(pq.element());// Returns head element, if empty NoSuchElement Exception.
		System.out.println(pq.peek()); // Returns head element, if empty returns null
		
		// Return and remove element from queue
		System.out.println(pq.remove()); // removes head element and print removed element, if empty NoSuchElement Exception.
		System.out.println(pq.poll()); // removes head element and print removed element, if empty returns null.
		System.out.println(pq);
		
		
		LinkedList ls = new LinkedList();
		//Adding elements using add and offer method
		ls.add('A');
		ls.add('B');
		ls.offer('C');
		ls.offer('C');
		ls.offer('D');
		System.out.println(ls);// insertion order preserved and duplicate allowed
				
		//get head element
		System.out.println(ls.element());// Returns head element, if empty NoSuchElement Exception.
		System.out.println(ls.peek()); // Returns head element, if empty returns null
				
		// Return and remove element from queue
		System.out.println(ls.remove()); // removes head element and print removed element, if empty NoSuchElement Exception.
		System.out.println(ls.poll()); // removes head element and print removed element, if empty returns null.
		System.out.println(ls);
		
	}

}
