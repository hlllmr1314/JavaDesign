package builder;

/**
 * 
 * @author huanglei
 *
 */
public interface PersonBuilder {

	void buildBody();

	void buildFoot();

	void buildHead();

	Person buildPerson();
}