package factory.methon;

/**
 * 
 * @author huanglei
 *
 */
public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}