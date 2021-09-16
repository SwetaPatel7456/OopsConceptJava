package oopsassignment2;

public class Email extends Document{
	String sender;
	String recipient;
	String subject;
	public String getSender() {
		return sender;
	}
		public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Email(String sender, String recipient, String subject) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.subject = subject;
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", subject=" + subject + ", text=" + text + "]";
	}
	


}
