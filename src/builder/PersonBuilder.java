package builder;

/**
 * 
 * @author huanglei
 *
 */
public interface PersonBuilder {

	void buildHead();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}