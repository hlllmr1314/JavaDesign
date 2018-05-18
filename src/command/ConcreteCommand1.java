package command;


/**
 * 具体的Command类的方法
 * @author haley
 *
 */
public class ConcreteCommand1 extends Command{

	private Receiver receiver;
	
	public ConcreteCommand1(Receiver receiver) {
		this.receiver  = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
