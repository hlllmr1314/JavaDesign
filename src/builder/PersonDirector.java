package builder;

/**
 * 导演类，负责安排已有模块的顺序，然后告诉Builder开始建造
 * @author huanglei
 *
 */
public class PersonDirector {

	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}

}