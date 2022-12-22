package model.exceptions;

public class AmountLimitException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public  AmountLimitException(String msg) {
		super(msg);
	}
}
