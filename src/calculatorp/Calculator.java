package calculatorp;

public class Calculator {
	private RequestPayment requestPayment;
	private ResponsePayment responsePayment;
	public Calculator(RequestPayment requestPayment) {
		this.requestPayment = requestPayment;
	}
	
	public ResponsePayment chargePaymentToCacheMoney() {
		CachePayment cachePayment = new CachePayment(requestPayment);
		return requestPayment.usePoint ? cachePayment.chargeWithPoint() : cachePayment.chargeWithoutPoint();
	}
	
	public ResponsePayment chargePaymentToCouponMoney() {
		CouponPayment couponPayment = new CouponPayment(requestPayment);
		return requestPayment.usePoint ? couponPayment.chargeWithPoint() : couponPayment.chargeWithoutPoint();
	}
}
