package org.opensgip.message;


public class DeliveryResponse extends AbstractMessage {
	public class Body extends SimpleResponseBody {
		public Body() {
			super();
		}
		public Body(long result, String reserve) {
			super(result,reserve);
		}
	}
	
	public DeliveryResponse() {
		header = new MessageHeader();
		body = new Body();
	}
	
	public DeliveryResponse(long result, String reserve) {
		header = new MessageHeader();
		
		Body b = new Body(result, reserve);		
		body = b;
	}
	
	public Body getBody() {
		return (Body)body;
	}	
}
