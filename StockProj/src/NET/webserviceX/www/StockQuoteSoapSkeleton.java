/**
 * StockQuoteSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class StockQuoteSoapSkeleton implements NET.webserviceX.www.StockQuoteSoap, org.apache.axis.wsdl.Skeleton {
    private NET.webserviceX.www.StockQuoteSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getQuote", _params, new javax.xml.namespace.QName("http://www.webserviceX.NET/", "GetQuoteResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "GetQuote"));
        _oper.setSoapAction("http://www.webserviceX.NET/GetQuote");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getQuote") == null) {
            _myOperations.put("getQuote", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getQuote")).add(_oper);
    }

    public StockQuoteSoapSkeleton() {
        this.impl = new NET.webserviceX.www.StockQuoteSoapImpl();
    }

    public StockQuoteSoapSkeleton(NET.webserviceX.www.StockQuoteSoap impl) {
        this.impl = impl;
    }
    public java.lang.Float getQuote(java.lang.String symbol) throws java.rmi.RemoteException
    {
        java.lang.Float ret = impl.getQuote(symbol);
        return ret;
    }

}
