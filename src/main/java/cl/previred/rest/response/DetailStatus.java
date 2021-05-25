package cl.previred.rest.response;

public class DetailStatus {

	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DetailStatus [status=" + status + ", toString()=" + super.toString() + "]";
	}

}