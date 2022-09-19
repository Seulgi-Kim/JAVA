package membership;

import java.util.ArrayList;

/**
 * The membership test class is to test the information of each customer.
 * Customer informations are added in the ArrayList.
 * 
 * @author Seulgi Kim
 *
 */

public class membershipTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerA = new Customer("s0001", "Andre");
		Customer customerB = new Customer("s0001", "Becky");
		Customer customerC = new GoldCustomer("g0001", "Cody");
		Customer customerD = new GoldCustomer("g0001", "David");
		Customer customerE = new VIPCustomer("v0001", "Ellena", 123);
		
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		
		System.out.println("==========Customer Information==========");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==========Discount ration & Bonus Points==========");
		
		int price = 1000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerGrade() + " customer " + customer.getCustomerName() + " paid "
					+ cost);
			System.out.println(customer.getCustomerName() + "'s current points are " 
					+ customer.bonusPoint);
		}
	}


}
