package decorator.mode;

public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	/**
	 * 定义自己的修饰方法
	 */
	private void method1() {
		System.out.println("method1 exec");
	}
	
	/**
	 * 重写父类的方法
	 */
	@Override
	public void operate() {
		method1();
		super.operate();
	}

}
