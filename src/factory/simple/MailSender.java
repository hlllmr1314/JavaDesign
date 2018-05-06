package factory.simple;

/**
 * 
 * @author huanglei
 *
 */
public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}