package forceproxy;

public interface IGamePlayer {

	void login(String username,String password);
	
	void killBoos();
	
	void upgrade();
	
	//每个人都可以找一下自己的代理类
	IGamePlayer getProx();
}
