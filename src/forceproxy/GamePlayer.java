package forceproxy;

public class GamePlayer implements IGamePlayer {

	private String name;

	private IGamePlayer proxy = null;

	public GamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public void login(String username, String password) {
		if (isProxy()) {
			System.out.println("player login username:" + username + " password:" + password);
		} else {
			System.out.println("请使用指定的代理类访问");
		}
	}

	@Override
	public void killBoos() {
		if (isProxy()) {
			System.out.println("player killBoos");
		} else {
			System.out.println("请使用指定的代理类访问");
		}
	}

	@Override
	public void upgrade() {
		if (isProxy()) {
			System.out.println("player upgrade");
		} else {
			System.out.println("请使用指定的代理类访问");
		}

	}

	@Override
	public IGamePlayer getProx() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	public boolean isProxy() {
		return proxy != null;
	}

}
