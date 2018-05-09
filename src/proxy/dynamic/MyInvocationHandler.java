package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object _obj) {
		this.target = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);
	}

}
