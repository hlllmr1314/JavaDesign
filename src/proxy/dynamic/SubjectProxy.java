package proxy.dynamic;

public class SubjectProxy implements Subject {

	private Subject target;
	public SubjectProxy(Subject subject) {
			this.target = subject;
	}
	
	@Override
	public void doSomethig(String str) {
		System.out.println("我是SubjectProxy代理类");
		target.doSomethig(str);
		System.out.println("代理类结束");
	}

}
