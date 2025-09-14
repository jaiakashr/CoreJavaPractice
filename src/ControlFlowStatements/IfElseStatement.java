package ControlFlowStatements;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		int tamil = 87;
		int english = 65;
		int maths = 00;
		int science = 79;
		int social = 91;
		
		int total = tamil + english + maths + science + social;
		
		if (tamil<35 && english <35 && maths<35 && science<35 && social<35) {
			System.out.println(" Sorry, You are Fail!. ");
		}
		
		else if (total <= 175)
		{
			System.out.println(" Sorry, You are Fail!. ");
		}
		else {
			System.out.println(" Great, You got a pass mark!. ");
		}
	}

}