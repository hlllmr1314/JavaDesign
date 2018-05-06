package singleton;

/**
 * （建议使用）
 * 注解：初试化静态的instance创建一次。如果我们在Singleton类里面写一个静态的方法不需要创建实例，它仍然会早早的创建一次实例。而降低内存的使用率。
 * 缺点：没有lazy loading的效果，从而降低内存的使用率。
 * 
 * @author huanglei
 *
 */
public class Singleton4 {
	private static Singleton4 instance = new Singleton4();

	public static Singleton4 getInstance() {
		return instance;
	}

	private Singleton4() {

	}
}
