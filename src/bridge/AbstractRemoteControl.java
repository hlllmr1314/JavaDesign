package bridge;

public abstract class AbstractRemoteControl {
	/**
	 * @uml.property name="tv"
	 * @uml.associationEnd
	 */
	private ITV tv;

	public AbstractRemoteControl(ITV tv) {
		this.tv = tv;
	}

	public void setChannel(int channel) {
		tv.switchChannel(channel);
	}

	public void turnOff() {
		tv.off();
	}

	public void turnOn() {
		tv.on();
	}
}
