package command;


/**
 * 具体的Command类的方法
 * @author haley
 *
 */
public class ConcreteCommand1 extends Command{

	private Receiver receiver;
	
	//除非非必要，实际应用中我们尽量封装掉，较少高层模块对底层模块的依赖关系。
	public ConcreteCommand1(Receiver receiver) {
		this.receiver  = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
