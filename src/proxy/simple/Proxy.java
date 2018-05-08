package proxy.simple;

/**
 * 
 * @author huanglei
 *
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}
}