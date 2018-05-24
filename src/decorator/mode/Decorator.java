package decorator.mode;

/**
 * 抽象装饰者（核心代码）
 * 
 * @author haley
 *
 */
public abstract class Decorator extends Component {

	private Component component;

	// 通过构造函数传递被修饰者
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		// 委托给被修饰者执行
		this.component.operate();
	}

}
