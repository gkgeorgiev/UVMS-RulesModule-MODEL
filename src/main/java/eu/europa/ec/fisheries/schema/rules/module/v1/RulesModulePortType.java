package eu.europa.ec.fisheries.schema.rules.module.v1;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-07-08T12:24:12.415+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", name = "RulesModulePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.rules.exchange.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.ticket.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.common.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.alarm.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.search.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.customrule.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.ticketrule.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.movement.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RulesModulePortType {

    @WebResult(name = "GetCustomRuleResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetCustomRule")
    public GetCustomRuleResponse getCustomRule(
        @WebParam(partName = "body", name = "GetCustomRuleRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetCustomRuleRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketListByQueryResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketListByQuery")
    public GetTicketListByQueryResponse getTicketListByQuery(
        @WebParam(partName = "body", name = "GetTicketListByQueryRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketListByQueryRequest body
    ) throws RulesException;

    @WebResult(name = "PingResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Ping")
    public PingResponse ping(
        @WebParam(partName = "body", name = "PingRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @WebResult(name = "GetAlarmListByQueryResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetAlarmListByQuery")
    public GetAlarmListByQueryResponse getAlarmListByQuery(
        @WebParam(partName = "body", name = "GetAlarmListByQueryRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetAlarmListByQueryRequest body
    ) throws RulesException;

    @WebResult(name = "CountTicketsByMovementsResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CountTicketsByMovements")
    public CountTicketsByMovementsResponse countTicketsByMovements(
        @WebParam(partName = "body", name = "CountTicketsByMovementsRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        CountTicketsByMovementsRequest body
    ) throws RulesException;

    @Oneway
    @WebMethod(operationName = "SetMovementReport")
    public void setMovementReport(
        @WebParam(partName = "body", name = "SetMovementReportRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        SetMovementReportRequest body
    ) throws RulesException;

    @WebResult(name = "CreateAlarmReportResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateAlarmReport")
    public CreateAlarmReportResponse createAlarmReport(
        @WebParam(partName = "body", name = "CreateAlarmReportRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        CreateAlarmReportRequest body
    ) throws RulesException;

    @WebResult(name = "CreateTicketResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateTicket")
    public CreateTicketResponse createTicket(
        @WebParam(partName = "body", name = "CreateTicketRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        CreateTicketRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketListResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketList")
    public GetTicketListResponse getTicketList(
        @WebParam(partName = "body", name = "GetTicketListRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketListRequest body
    ) throws RulesException;

    @WebResult(name = "GetCustomRuleListResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetCustomRuleList")
    public GetCustomRuleListResponse getCustomRuleList(
        @WebParam(partName = "body", name = "GetCustomRuleListRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetCustomRuleListRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketsAndRulesByMovementsResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketsAndRulesByMovements")
    public GetTicketsAndRulesByMovementsResponse getTicketsAndRulesByMovements(
        @WebParam(partName = "body", name = "GetTicketsAndRulesByMovementsRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketsAndRulesByMovementsRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketsByMovementsResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketsByMovements")
    public GetTicketsByMovementsResponse getTicketsByMovements(
        @WebParam(partName = "body", name = "GetTicketsByMovementsRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketsByMovementsRequest body
    ) throws RulesException;

    @WebResult(name = "CreateCustomRuleResponse", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateCustomRule")
    public CreateCustomRuleResponse createCustomRule(
        @WebParam(partName = "body", name = "CreateCustomRuleRequest", targetNamespace = "urn:module.rules.schema.fisheries.ec.europa.eu:v1")
        CreateCustomRuleRequest body
    ) throws RulesException;
}