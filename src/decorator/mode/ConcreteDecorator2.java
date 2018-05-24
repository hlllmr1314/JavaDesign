package decorator.mode;

public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	/**
	 * 定义自己的修饰方法
	 */
	private void method2() {
		System.out.println("method2 exec");
	}
	
	/**
	 * 重写父类的方法
	 */
	@Override
	public void operate() {
		method2();
		super.operate();
	}

}
