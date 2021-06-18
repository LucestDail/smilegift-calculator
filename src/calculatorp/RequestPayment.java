package calculatorp;

public class RequestPayment{
	
	boolean usePoint;
	boolean useDiscountPoint;
	int targetPrice;
	Budget b;
	public RequestPayment(Budget b, boolean usePoint, boolean useDiscountPoint, int targetPrice) {
		this.b = b;
		this.usePoint = usePoint;
		this.useDiscountPoint = useDiscountPoint;
		this.targetPrice = targetPrice;
	}
	
	
	public boolean isUseDiscountPoint() {
		return useDiscountPoint;
	}


	public void setUseDiscountPoint(boolean useDiscountPoint) {
		this.useDiscountPoint = useDiscountPoint;
	}


	public int getTargetPrice() {
		return targetPrice;
	}


	public void setTargetPrice(int targetPrice) {
		this.targetPrice = targetPrice;
	}


	public void setUsePoint(boolean usePoint) {
		this.usePoint = usePoint;
	}


	public void setB(Budget b) {
		this.b = b;
	}

}
