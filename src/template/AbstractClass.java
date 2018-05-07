package template;

/**
 * 抽象模版
 * @author haley
 *
 */
public abstract class AbstractClass {

	//基本方法
	protected abstract void doSomething();
	//基本方法
	protected abstract void doAnything();
	//模版方法
	public void templateMethod() {
		/**
		 * 调用基本方法，完成相关逻辑
		 */
		this.doSomething();
		this.doAnything();
	}
	
}
