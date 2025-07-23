public class First {
	public static void main(String[] args) {
		AOps ops=new AOps();
		Inputs inp=new Inputs();
		conditions con=new conditions();

// Tester Arithmetic ops using pre-entered inputs
		
		ops.add();
		ops.sub();
		ops.mul();
		ops.div();
		
// Tester Arithmetic ops using inputs from user 
		
		inp.Add();
		inp.Sub();
		inp.Mul();
		inp.Div();
		System.out.println(inp);
		
// Conditions
		
		con.addition();
		
	}
}
