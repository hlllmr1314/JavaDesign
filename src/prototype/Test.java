package prototype;

public class Test {

	public static void main(String[] args) {

		try {
			Prototype pro = new ConcretePrototype("prototype");
			Prototype pro2 = (Prototype) pro.clone();
			System.out.println(pro.getName());
			System.out.println(pro2.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}