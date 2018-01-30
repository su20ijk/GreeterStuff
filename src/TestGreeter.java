
public class TestGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter test=new Greeter();
		System.out.println("name:"+test.getName());
		System.out.println("age:"+test.getAge());
		Greeter [] testArray=new Greeter[10];
		for(int i=0; i<10; i++) {
			testArray[i]=new Greeter();
			System.out.println("name"+i+": "+testArray[i].getName());
			System.out.println("age"+i+": "+testArray[i].getAge());
		}
		
	}

}
