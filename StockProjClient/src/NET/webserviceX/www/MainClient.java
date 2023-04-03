package NET.webserviceX.www;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import  NET.webserviceX.www.StockQuoteLocator;
import  NET.webserviceX.www.StockQuoteSoap;
public class MainClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockQuoteLocator sql = new StockQuoteLocator();
		try {
			StockQuoteSoap c = sql.getStockQuoteSoap();
			System.out.println(c.getQuote("BT"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}