package singleton;

/**
 * 注解：只有当instance为null时，需要获取同步锁，创建一次实例。当实例被创建，则无需试图加锁。 缺点：用双重if判断，复杂，容易出错。
 * 
 * @author huanglei
 *
 */
public class Singleton3 {
	private static Singleton3 instance = null;

	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

	private Singleton3() {

	}
}