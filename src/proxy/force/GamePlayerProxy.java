package proxy.force;

public class GamePlayerProxy implements IGamePlayer {
	
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String username, String password) {
		gamePlayer.login(username, password);
	}

	@Override
	public void killBoos() {
		gamePlayer.killBoos();
	}

	@Override
	public void upgrade() {
		gamePlayer.upgrade();
	}

	@Override
	public IGamePlayer getProx() {
		return this;
	}

}
