package membership;

/** 
 * The Customer class holds customer id, name, grade, bonus point 
 * and bonus ratio of particular customer.
 * General customer's grade can be classified as "SILVER" and 
 * their bonus ratio is 1 percent, saved for every purchase.
 * 
 * @author Seulgi Kim
 *
 */

public class Customer {
	
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//	}
	
	public Customer(String customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	
	/**
	 * Constructor
	 * @param price
	 * @return price
	 */
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}	
	
	/**
	 * gets id of the particular customer
	 * @return String customerID
	 */
	
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * sets id of the particular customer
	 * @param customerID
	 */
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	/**
	 * gets name of the particular customer
	 * @return String customerName
	 */

	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * sets name of the particular customer
	 * @param customerName
	 */

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * gets grade of the particular customer
	 * @return String customerGrade
	 */

	public String getCustomerGrade() {
		return customerGrade;
	}
	
	/**
	 * sets grade of the particular customer
	 * @param customerGrade
	 */

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	/**
	 * show the information of particular customer.
	 * @return Information with customer name and grade.
	 */

	public String showCustomerInfo() {
		return customerName + "'s grade is " + customerGrade
				+ " and current bonus points are " + bonusPoint;
	}

}
