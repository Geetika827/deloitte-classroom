package lambda;
interface Inter1{
	void show();
}

public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Inter1 i1=()->System.out.println("Hello");
	i1.show();
	}

}
