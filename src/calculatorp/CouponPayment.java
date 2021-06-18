package calculatorp;

public class CouponPayment {
	private ResponsePayment responsePayment;
	private RequestPayment requestPayment;
	public CouponPayment(RequestPayment requestPayment) {
		this.requestPayment = requestPayment;
	}

	public ResponsePayment chargeWithPoint() {
		responsePayment = new ResponsePayment();
		if(requestPayment.useDiscountPoint) {
			responsePayment.setPaymentTotal(8888);
			return responsePayment;
		}else {
			responsePayment.setPaymentTotal(2222);
			return responsePayment;
		}
	}

	public ResponsePayment chargeWithoutPoint() {
		responsePayment = new ResponsePayment();
		if(requestPayment.useDiscountPoint) {
			responsePayment.setPaymentTotal(7777);
			return responsePayment;
		}else {
			responsePayment.setPaymentTotal(3333);
			return responsePayment;
		}
	}

}
