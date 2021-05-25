package cl.previred.rest.response;

public class Status {
	
	private Integer code;
	private String message;
	private String exception;
	
	

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String Message() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Status [code=");
		builder.append(code);
		builder.append(", message=");
		builder.append(message);
		builder.append(", exception=");
		builder.append(exception);
		builder.append("]");
		return builder.toString();
	}



	
}