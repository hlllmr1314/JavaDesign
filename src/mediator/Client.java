package mediator;

/**
 * 测试代码
 * 
 * @author haley
 *
 */
public class Client {
	public static void main(String[] args) {
		Colleague colleagueA = new ConcreteColleagueA();
		Colleague colleagueB = new ConcreteColleagueB();

		Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);
		colleagueA.setMediator(mediator);
		colleagueB.setMediator(mediator);

		((ConcreteColleagueA) colleagueA).notifyColleagueB();
		((ConcreteColleagueB) colleagueB).notifyColleagueA();
	}
}