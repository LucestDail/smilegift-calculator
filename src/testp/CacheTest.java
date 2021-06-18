package testp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import calculatorp.Budget;
import calculatorp.Calculator;
import calculatorp.RequestPayment;

public class CacheTest {
	
	
	
	
	
	@Test
	public void paymentTesting() {
		
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
		
		
		assertEquals(2500,cal.chargePaymentToCacheMoney().getPaymentTotal());
		
		assertEquals(2500,cal.chargePaymentToCouponMoney().getPaymentTotal());
		
		
		}
	
	
	
	
	
	
	
	
	
	@Test
	public void returnTesting() {
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
		
		
		
		assertEquals(0,cal.chargePaymentToCacheMoney().getCacheMoney());
		assertEquals(0, cal.chargePaymentToCacheMoney().getCouponMoney());
		assertEquals(0, cal.chargePaymentToCacheMoney().getDiscountPoint());
		assertEquals(0, cal.chargePaymentToCacheMoney().getPresentPoint());
		
		assertEquals(0, cal.chargePaymentToCouponMoney());
	}
}
