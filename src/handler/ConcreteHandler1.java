package handler;

/**
 * 具体处理者1
 * 
 * @author haley
 *
 */
public class ConcreteHandler1 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		// 设置自己的处理级别
		return null;
	}

	@Override
	protected Response echo(Request request) {
		// 完成处理逻辑
		return null;
	}

}
