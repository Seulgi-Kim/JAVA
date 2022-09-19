package membership;

public class GoldCustomer extends Customer {
	
	double discountRatio;
	
	public GoldCustomer (String customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		discountRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return (int) (price - (price * discountRatio));
	}
	
	

}
