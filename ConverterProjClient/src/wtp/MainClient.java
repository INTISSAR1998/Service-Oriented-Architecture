package wtp;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import DefaultNamespace.Converter;
import DefaultNamespace.ConverterServiceLocator;
public class MainClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverterServiceLocator csl = new ConverterServiceLocator();
		try {
			Converter c = csl.getConverter();
			System.out.println(c.celsiusToFarenheit(30));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}