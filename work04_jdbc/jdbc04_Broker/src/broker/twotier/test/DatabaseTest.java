package broker.twotier.test;

import java.util.ArrayList;

import broker.twotier.dao.Database;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.StockRec;

public class DatabaseTest {

	public static void main(String[] args)throws Exception{
		
		Database db = new Database("127.0.0.1");
//		db.addCustomer(new CustomerRec("888-888", "하바리", "다산동"));
//		db.addCustomer(new CustomerRec("777-777", "하바리", "다산동"));
//		db.addCustomer(new CustomerRec("999-999", "James1", "NY1"));
//		db.deleteCustomer("888-888");
//		db.updateCustomer(new CustomerRec("777-777", "하바리1", "약수동1"));
		
//		ArrayList<SharesRec> v = db.getPortfolio("111-111");
//		for(SharesRec sr : v)System.out.println(v);
		
//		ArrayList<StockRec> s = db.getAllStocks();
//		for(StockRec sr : s) System.out.println(sr);
//		}
	
		ArrayList<CustomerRec> c = db.getAllCustomers();
		for(CustomerRec cr : c) System.out.println(cr);
	}
}
