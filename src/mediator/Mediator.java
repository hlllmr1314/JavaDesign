package mediator;

/**
 * 抽象中介者角色
 * 
 * @author haley
 *
 */
public abstract class Mediator {
	
	protected Colleague colleagueA;
	protected Colleague colleagueB;

	public Mediator(Colleague colleagueA, Colleague colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
	}

	public abstract void notifyColleagueA();

	public abstract void notifyColleagueB();
}
