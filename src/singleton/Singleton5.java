package singleton;

/**
 * （建议使用）
 * 注解：定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
 * 优点：达到了lazy loading的效果，即按需创建实例。
 * 
 * @author huanglei
 *
 */
public class Singleton5 {
	private static class SingletonHolder {
		private final static Singleton5 instance = new Singleton5();
	}

	public static Singleton5 getInstance() {
		return SingletonHolder.instance;
	}

	private Singleton5() {

	}
}
