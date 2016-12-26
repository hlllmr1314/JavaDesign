package factory.abstractf;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {

		return new MailSender();

	}
}