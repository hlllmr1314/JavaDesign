package command;


/**
 * 具体的Command类的方法
 * @author haley
 *
 */
public class ConcreteCommand2 extends Command{

	private Receiver receiver;
	
	public ConcreteCommand2(Receiver receiver) {
		this.receiver  = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
