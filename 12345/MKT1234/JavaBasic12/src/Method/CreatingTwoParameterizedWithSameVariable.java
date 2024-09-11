package Method;

public class CreatingTwoParameterizedWithSameVariable {
	CreatingTwoParameterizedWithSameVariable(int a){
		System.out.println(" I am a constructor 1");
	}
	CreatingTwoParameterizedWithSameVariable(int a){
		System.out.println(" I am a constructor 2");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingTwoParameterizedWithSameVariable ct =new CreatingTwoParameterizedWithSameVariable(1);
	}

}
