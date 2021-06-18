package calculatorp;

public class CachePayment {
	private ResponsePayment responsePayment;
	private RequestPayment requestPayment;
	public CachePayment(RequestPayment requestPayment) {
		this.requestPayment = requestPayment;
	}

	public ResponsePayment chargeWithPoint() {
		responsePayment = new ResponsePayment();
		if(requestPayment.useDiscountPoint) {
			
			responsePayment.setPaymentTotal(9999);
			return responsePayment;
		}else {
			responsePayment.setPaymentTotal(1111);
			return responsePayment;
		}
	}

	public ResponsePayment chargeWithoutPoint() {
		responsePayment = new ResponsePayment();
		if(requestPayment.useDiscountPoint) {
			responsePayment.setPaymentTotal(6666);
			return responsePayment;
		}else {
			responsePayment.setPaymentTotal(4444);
			return responsePayment;
		}
	}

}
