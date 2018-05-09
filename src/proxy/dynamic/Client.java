package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("zs");
		InvocationHandler handler = new GamePlayIH(player);
		// 获取ClassLoader
		ClassLoader loader = player.getClass().getClassLoader();
		// 动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[] { IGamePlayer.class }, handler);
		proxy.login("zs", "zs");
		proxy.killBoos();
		proxy.upgrade();

		Subject subject = new RealSubject();
		Subject proxy2 = SubjectDynamicProxy.newProxyInstance(subject);
		proxy2.doSomethig("搞事情！");
	}

}
