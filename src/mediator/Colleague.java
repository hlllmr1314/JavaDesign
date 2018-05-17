package mediator;

/**
 * 抽象同事类
 * @author haley
 *
 */
public abstract class Colleague {
	 protected Mediator mediator;

	    public void setMediator(Mediator mediator) {
	        this.mediator = mediator;
	    }

	    public abstract void operation();
}
