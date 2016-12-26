package adapter;

/**
 * 类适配器：类的适配器模式把适配的类的API转换成为目标类的API。
 * 
 * @author huanglei
 *
 */
public class ClassAdapter extends Adaptee implements Target {
	/**
	 * 由于源类Adaptee没有方法sampleOperation2() 因此适配器补充上这个方法
	 */
	@Override
	public void sampleOperation2() {
		// 写相关的代码
	}

}