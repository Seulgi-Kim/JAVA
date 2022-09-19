package membership;

/**
 * The VIPCustomer class child class of Customer class.
 * Customer id, name, grade, bonuspoint and bonus ratio
 * are inherited from its parent class and it holds 
 * clerk id and discount ratio.
 * 
 * VIP customer's grade can be classified as "VIP" and 
 * their bonus ratio is 5 percents, saved for every purchase.
 * 10% discount is applied for VIP cusotmer.
 * 
 * @author Seulgi Kim
 *
 */

public class VIPCustomer extends Customer{

	private int clerkID;
	double discountRatio;
	
//	public VIPCustomer() {
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		discountRatio = 0.1;
//	}
	
	public VIPCustomer (String customerID, String customerName, int clerkID) {
		super(customerID, customerName);
		this.clerkID = clerkID;
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int) (price - (price * discountRatio));
	}
	

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()
				+ " The id number of clerk in charge of is "
				+ clerkID;
	}

	/**
	 * gets id of the particular clerk
	 * @return String clerkID
	 */

	public int getClerkID() {
		return clerkID;
	}
	
	/**
	 * sets id of the particular clerk
	 * @param clerkID
	 */

	public void setClerkID(int clerkID) {
		this.clerkID = clerkID;
	}	
	
}
