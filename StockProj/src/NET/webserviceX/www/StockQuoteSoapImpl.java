/**
 * StockQuoteSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class StockQuoteSoapImpl implements NET.webserviceX.www.StockQuoteSoap{


	public java.lang.Float getQuote(java.lang.String symbol) throws java.rmi.RemoteException {
        
        if (symbol=="BT") {
        	return (float) 6.64 ;
        }
        if (symbol=="SFBT") {
        	return (float) 18.99 ;
        }
        if (symbol=="TELNET") {
        	return (float) 8.44 ;
        }
        if (symbol=="STB") {
        	return (float) 3.34 ;
        }
        if (symbol=="UIB") {
        	return (float) 17.02 ;
        }
        else {
        	return (float) 4.48 ;
        }
        
    }

}
