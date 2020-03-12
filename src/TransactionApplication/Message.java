package TransactionApplication;

public class Message {

	public String messageId;
	public String senderId;
	public String receiverId;
	public int amount;

	

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", senderId=" + senderId + ", receiverId=" + receiverId + ", amount="
				+ amount + "]";
	}


	public Message(String messageId, String senderId, String receiverId, int amount) {
		super();
		this.messageId = messageId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.amount = amount;
	}
	
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
