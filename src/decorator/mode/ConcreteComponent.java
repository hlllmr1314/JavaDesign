package decorator.mode;

/**
 * 具体构件
 * @author haley
 *
 */
public class ConcreteComponent extends Component {
 
	@Override
	public void operate() {
		 System.out.println("do Something");
	}

}
