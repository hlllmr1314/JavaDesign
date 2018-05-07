package builder;

/**
 *  抽象建造者类
 * @author huanglei
 *
 */
public interface PersonBuilder {

	void buildBody();

	void buildFoot();

	void buildHead();

	Person buildPerson();
}