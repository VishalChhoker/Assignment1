package CompanyAssignment;

import java.util.Collections;
import java.util.PriorityQueue;

public class Question3 {
	  static PriorityQueue<Integer> left = new PriorityQueue<>();
	    static PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder());

	    public static void insertHeap(int x) {
	        
	        if (left.size()==right.size()) {
	            right.add(x);
	            left.add(right.remove());
	        } else {
	            left.add(x);
	            right.add(left.remove());
	        }
	    }

//	    public static void balanceHeaps() {
//	        // Currently not used; balancing is handled in insertHeap
//	    }

	    public static double getMedian() {
	        if (left.size()==right.size()) {
	            return (left.peek()+right.peek())/2.0;
	        } else {
	            return left.peek()*1.0;
	        }
	    }
	

	public static void main(String[] args) {
		int [] arr= {5,15,1,13};
		for(int num :arr) {
			insertHeap(num);
			System.out.println("Current median:" + getMedian());
		}

	}

}
