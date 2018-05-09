package proxy.dynamic;

public class RealSubject implements Subject {

	@Override
	public void doSomethig(String str) {
		System.out.println("do something -->" + str);
	}

}
