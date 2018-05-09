package proxy.dynamic;

public class GamePlayer implements IGamePlayer {

	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String username, String password) {
		System.out.println("player login username:" + username + " password:" + password);
	}

	@Override
	public void killBoos() {
		System.out.println("player killBoos");
	}

	@Override
	public void upgrade() {
		System.out.println("player upgrade");
	}

}
