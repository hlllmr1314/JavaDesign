package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	private Object obj;

	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
