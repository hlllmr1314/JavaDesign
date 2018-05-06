package composite;

import java.util.List;

/**
 * 定义Component 类Employer
 * 
 * @author huanglei
 *
 */
public abstract class Employer {

	private String name;

	public List<Employer> employers;

	public abstract void add(Employer employer);

	public abstract void delete(Employer employer);

	public List<Employer> getEmployers() {
		return this.employers;
	}

	public String getName() {
		return this.name;
	}

	public void printInfo() {
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}
}