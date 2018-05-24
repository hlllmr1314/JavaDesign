package decorator;

/**
 * 
 * @author huanglei
 *
 */
public class ManagerA extends Manager {

	public ManagerA(Project project) {
		super(project);
	}

	/**
	 * 项目经理自己的事情：做早期工作
	 */
	@Override
	public void doEarlyWork() {
		System.out.println("项目经理A 在做需求分析");
		System.out.println("项目经理A 在做架构设计");
		System.out.println("项目经理A 在做详细设计");
	}
	
	@Override
	public void doEndWork() {
		System.out.println("项目经理B 收尾工作");
	}

}