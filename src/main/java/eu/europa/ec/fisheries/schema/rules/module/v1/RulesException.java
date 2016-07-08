
package eu.europa.ec.fisheries.schema.rules.module.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-07-08T12:24:12.387+02:00
 * Generated source version: 2.7.6
 */

@WebFault(name = "RulesFault", targetNamespace = "urn:common.rules.schema.fisheries.ec.europa.eu:v1")
public class RulesException extends Exception {
    
    private eu.europa.ec.fisheries.schema.rules.common.v1.RulesFault rulesFault;

    public RulesException() {
        super();
    }
    
    public RulesException(String message) {
        super(message);
    }
    
    public RulesException(String message, Throwable cause) {
        super(message, cause);
    }

    public RulesException(String message, eu.europa.ec.fisheries.schema.rules.common.v1.RulesFault rulesFault) {
        super(message);
        this.rulesFault = rulesFault;
    }

    public RulesException(String message, eu.europa.ec.fisheries.schema.rules.common.v1.RulesFault rulesFault, Throwable cause) {
        super(message, cause);
        this.rulesFault = rulesFault;
    }

    public eu.europa.ec.fisheries.schema.rules.common.v1.RulesFault getFaultInfo() {
        return this.rulesFault;
    }
}
