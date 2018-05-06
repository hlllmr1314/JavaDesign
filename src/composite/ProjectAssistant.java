package composite;

/**
 * 定义Leaf类ProjectAssistant
 * 
 * @author huanglei
 *
 */
public class ProjectAssistant extends Employer {

	public ProjectAssistant(String name) {
		setName(name);
		employers = null;// 项目助理, 表示没有下属了
	}

	@Override
	public void add(Employer employer) {

	}

	@Override
	public void delete(Employer employer) {

	}
}