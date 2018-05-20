package handler;

public abstract class Handler {

	private Handler nextHandler;

	// 每个处理者都必须要对请求做处理
	public final Response handleMessage(Request request) {

		Response response = null;
		// 判断是否是自己的处理级别
		if (getHandlerLevel().equals(request.getLevel())) {
			response = this.echo(request);
		} else {// 不属于自己的处理级别
				// 判断是否是下一个处理者
			if (getHandlerLevel().equals(nextHandler.getHandlerLevel())) {
				response = this.nextHandler.handleMessage(request);
			}else {
				//没有适当的处理者，业务自行处理
			}
		}
		
		return response;

	}

	// 设置下一个处理者是谁
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}

	// 每个处理者都有个级别
	protected abstract Level getHandlerLevel();

	// 每个处理者都有必须实现处理任务
	protected abstract Response echo(Request request);
}
