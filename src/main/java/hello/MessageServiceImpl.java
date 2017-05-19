package main.java.hello;

public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "Hello New World!";
	}

	@Override
	public String getMessage2() {
		return "Message 2";
	}
	
}