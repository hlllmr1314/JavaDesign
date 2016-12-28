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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void add(Employer employer);

	public abstract void delete(Employer employer);

	public List<Employer> employers;

	public void printInfo() {
		System.out.println(name);
	}

	public List<Employer> getEmployers() {
		return this.employers;
	}
}