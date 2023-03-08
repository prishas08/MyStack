import java.util.Stack;

public class runner {
	
	public static void main(String args[])
	{
		StackProbs m = new StackProbs();
		StackProbs.makeStack(new int[] {1,2,3,4});
		Stack<Integer> x = new Stack<>();
		Stack<Integer> y = new Stack<>();
		Stack<Integer> n = new Stack<>();
		
		//testing doubleUp
		x.push(1);
		x.push(3);
		x.push(5);
		x.push(0);
		x.push(-1);
		StackProbs.doubleUp(x);
		System.out.println(x);
		
		//testing posAndNeg
		y.push(2);
		y.push(9);
		y.push(-4);
		y.push(3);
		y.push(-1);
		y.push(0);
		y.push(-6);
		StackProbs.posAndNeg(y);
		System.out.println(y);		
		
		//testing shiftByN
		n.push(7);
		n.push(23);
		n.push(-7);
		n.push(0);
		n.push(22);
		n.push(-8);
		n.push(4);
		n.push(5);
		StackProbs.shiftByN(n,3);
		System.out.println(n);		
		
		//testing reverseVowels
		System.out.println(StackProbs.reverseVowels("hello how are you"));	
		
		//testing bracketBalance
		System.out.println(StackProbs.bracketBalance("(([()])))"));	
		System.out.println(StackProbs.bracketBalance("([()[]()])()"));	
	}
	
	
	

}
