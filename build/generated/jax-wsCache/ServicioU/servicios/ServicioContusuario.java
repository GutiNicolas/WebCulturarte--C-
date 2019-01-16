
package servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioContusuario", targetNamespace = "http://WebServices/", wsdlLocation = "http://localhost:8580/ServicioU?wsdl")
public class ServicioContusuario
    extends Service
{

    private final static URL SERVICIOCONTUSUARIO_WSDL_LOCATION;
    private final static WebServiceException SERVICIOCONTUSUARIO_EXCEPTION;
    private final static QName SERVICIOCONTUSUARIO_QNAME = new QName("http://WebServices/", "ServicioContusuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8580/ServicioU?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOCONTUSUARIO_WSDL_LOCATION = url;
        SERVICIOCONTUSUARIO_EXCEPTION = e;
    }

    public ServicioContusuario() {
        super(__getWsdlLocation(), SERVICIOCONTUSUARIO_QNAME);
    }

    public ServicioContusuario(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOCONTUSUARIO_QNAME, features);
    }

    public ServicioContusuario(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOCONTUSUARIO_QNAME);
    }

    public ServicioContusuario(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOCONTUSUARIO_QNAME, features);
    }

    public ServicioContusuario(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioContusuario(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceContUsusario
     */
    @WebEndpoint(name = "WebServiceContUsusarioPort")
    public WebServiceContUsusario getWebServiceContUsusarioPort() {
        return super.getPort(new QName("http://WebServices/", "WebServiceContUsusarioPort"), WebServiceContUsusario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceContUsusario
     */
    @WebEndpoint(name = "WebServiceContUsusarioPort")
    public WebServiceContUsusario getWebServiceContUsusarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServices/", "WebServiceContUsusarioPort"), WebServiceContUsusario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOCONTUSUARIO_EXCEPTION!= null) {
            throw SERVICIOCONTUSUARIO_EXCEPTION;
        }
        return SERVICIOCONTUSUARIO_WSDL_LOCATION;
    }

}