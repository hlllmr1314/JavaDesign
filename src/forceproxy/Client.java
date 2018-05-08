package forceproxy;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("zhangsan");
		
		//直接访问真是对象
		player.login("zs", "zs");
		player.killBoos();
		player.upgrade();
		
		IGamePlayer proxy = new GamePlayerProxy(player);
		//直接访问代理类
		proxy.login("zs", "zs");
		proxy.killBoos();
		proxy.upgrade();
		
		//强制代理类的场景
		proxy = player.getProx();
		proxy.login("zs", "zs");
		proxy.killBoos();
		proxy.upgrade();
	}

}
