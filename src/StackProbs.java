import java.util.Stack;

public class StackProbs {
	
	public static Stack<Integer> makeStack(int[] nums)
	{
		Stack<Integer> stack = new Stack<>();
		for(int num: nums)
		{
			stack.push(num);
		}
		return stack;
	}
	
	public static Stack<Integer> doubleUp (Stack<Integer> nums)
	{
		Stack<Integer> temp = new Stack<>();
		while(nums.isEmpty()==false)
		{
			temp.push(nums.pop());
		}
		while(temp.isEmpty()==false)
		{
			nums.push(temp.peek());
			nums.push(temp.pop());
		}
		return nums;
	}
	
	public static Stack<Integer> posAndNeg(Stack<Integer> nums)
	{
		Stack<Integer> tempPos = new Stack<>();
		Stack<Integer> tempNeg = new Stack<>();
		while(nums.isEmpty()==false)
		{
			if(nums.peek()>=0)
			{
				tempPos.push(nums.pop());
			}
			else
			{
				tempNeg.push(nums.pop());
			}
		}
		while(tempNeg.isEmpty()==false)
		{
			nums.push(tempNeg.pop());
		}
		while(tempPos.isEmpty()==false)
		{
			nums.push(tempPos.pop());
		}
		return nums;
	}
	
	public static Stack<Integer> shiftByN(Stack<Integer> nums, int n)
	{
		Stack<Integer> tem = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		int i = nums.size();
		for(int x = i; x>0; x--)
		{
			if(x>n)
			{
				tem.push(nums.pop());
			}
			else
			{
				temp.push(nums.pop());
			}
		}
		while(tem.isEmpty()==false)
		{
			nums.push(tem.pop());
		}
		while(temp.isEmpty()==false)
		{
			nums.push(temp.pop());
		}
		return nums;
	}
	
	public static String reverseVowels(String str)
	{
		Stack<String> vowelStack = new Stack<>();
		int i = 0;
		while(i<str.length())
		{
			if(str.substring(i,i+1).equals("a") || str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("i") || str.substring(i,i+1).equals("o") || str.substring(i,i+1).equals("u"))
			{
				vowelStack.push(str.substring(i, i+1));
			}
			i++;
				
		}
		int x = 0;
		String str2 = "";
		while(x<str.length())
		{
			if(str.substring(x,x+1).equals("a") || str.substring(x,x+1).equals("e") || str.substring(x,x+1).equals("i") || str.substring(x,x+1).equals("o") || str.substring(x,x+1).equals("u"))
			{
				str2+=vowelStack.pop();
			}
			else
			{
				str2+=str.substring(x,x+1);
			}
			x++;
		}
		
		return str2;
	}
	

	public static boolean bracketBalance(String s)
	{
		int i = 0;
		Stack<String> bracketStack = new Stack<>();
		String newString = "";
		while(i < s.length())
		{
			if(i!=s.length()-1)
			{
				if((s.substring(i,i+2).equals("()")) || (s.substring(i,i+2).equals("[]")) )
				{
					i++;
				}else
				{
					newString+=s.substring(i,i+1);
				}
			}
			else
			{
				newString+=s.substring(i,i+1);
			}
			
			i++;
		}
		if(newString.length()%2==1)
		{
			return false;
		}
		int x = newString.length()/2;
		String[] str = new String[x];
		int l = 0;
		while(l < x)
		{
			if(newString.substring(l,l+1).equals("("))
			{
				str[l] = "Open Parenthesis";
			}
			else if(newString.substring(l,l+1).equals("["))
			{
				str[l] = "Open Bracket";
			}
			else
			{
				return false;
			}
			l++;
		}
		int y = 0;
		while(bracketStack.size()<x)
		{
			if(newString.substring(y+x, y+x+1).equals(")"))
			{
				bracketStack.push("Close Parenthesis");
			}
			else if(newString.substring(y+x, y+x+1).equals("]"))
			{
				bracketStack.push("Close Bracket");
			}
			else
			{
				return false;
			}
			y++;
		}
		
		int p = 0;
		while(bracketStack.size()>0)
		{
			if(bracketStack.peek().equals("Close Parenthesis") && str[p].equals("Open Parenthesis"))
			{
				bracketStack.pop();
			}
			else if( bracketStack.peek().equals("Close Bracket") && str[p].equals("Open Bracket"))
			{
				bracketStack.pop();
			}
			else
			{
				return false;
			}
			p++;
		}
		return true;
	}

}
