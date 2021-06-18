package calculatorp;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Budget b = new Budget();
		b.setCacheMoney(1000);
		b.setCouponMoney(1500);
		b.setDiscountPoint(1000);
		b.setPresentPoint(1000);
		
		b.setCacheMoneyDcRate(20);
		b.setCouponMoneyDcRate(10);
		b.setDiscountPointUsageRate(20);
		b.setPresentPointDcRate(0);
		
		int targetPrice = 2500;
		
		RequestPayment requestPayment = new RequestPayment(b,true,true, targetPrice);
		
		Calculator cal = new Calculator(requestPayment);
		
		System.out.println(cal.chargePaymentToCacheMoney().getPaymentTotal());
		System.out.println(cal.chargePaymentToCouponMoney().getPaymentTotal());
		
	}
}
