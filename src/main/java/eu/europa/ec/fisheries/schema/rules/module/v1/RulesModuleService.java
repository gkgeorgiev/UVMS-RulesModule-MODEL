package eu.europa.ec.fisheries.schema.rules.module.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-12-06T12:39:27.851+01:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "RulesModuleService", 
                  wsdlLocation = "file:/C:/uvms-2.1.3-morgoth/models/RulesModule/src/main/resources/contract/RulesModuleService.wsdl",
                  targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1") 
public class RulesModuleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:module.rules.schema.fisheries.ec.europa.eu:v1", "RulesModuleService");
    public final static QName RulesModulePortType = new QName("urn:module.rules.schema.fisheries.ec.europa.eu:v1", "RulesModulePortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/uvms-2.1.3-morgoth/models/RulesModule/src/main/resources/contract/RulesModuleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RulesModuleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/uvms-2.1.3-morgoth/models/RulesModule/src/main/resources/contract/RulesModuleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RulesModuleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RulesModuleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RulesModuleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RulesModuleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RulesModuleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RulesModuleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RulesModulePortType
     */
    @WebEndpoint(name = "RulesModulePortType")
    public RulesModulePortType getRulesModulePortType() {
        return super.getPort(RulesModulePortType, RulesModulePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RulesModulePortType
     */
    @WebEndpoint(name = "RulesModulePortType")
    public RulesModulePortType getRulesModulePortType(WebServiceFeature... features) {
        return super.getPort(RulesModulePortType, RulesModulePortType.class, features);
    }

}
