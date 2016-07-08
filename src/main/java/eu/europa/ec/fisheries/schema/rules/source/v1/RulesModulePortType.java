package eu.europa.ec.fisheries.schema.rules.source.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-07-08T12:24:13.990+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", name = "RulesModulePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.rules.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.ticket.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.previous.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.common.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.alarm.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.search.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.customrule.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.ticketrule.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.rules.movement.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RulesModulePortType {

    @WebResult(name = "GetSanityRulesResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetSanityRules")
    public GetSanityRulesResponse getSanityRules(
        @WebParam(partName = "body", name = "GetSanityRulesRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetSanityRulesRequest body
    ) throws RulesException;

    @WebResult(name = "CountTicketListByMovementsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CountTicketListByMovements")
    public CountTicketListByMovementsResponse countTicketListByMovements(
        @WebParam(partName = "body", name = "CountTicketListByMovementsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        CountTicketListByMovementsRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketListResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketList")
    public GetTicketListResponse getTicketList(
        @WebParam(partName = "body", name = "GetTicketListRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketListRequest body
    ) throws RulesException;

    @WebResult(name = "GetAlarmReportByAssetAndRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetAlarmReportByAssetAndRule")
    public GetAlarmReportByAssetAndRuleResponse getAlarmReportByAssetAndRule(
        @WebParam(partName = "body", name = "GetAlarmReportByAssetAndRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetAlarmReportByAssetAndRuleRequest body
    ) throws RulesException;

    @WebResult(name = "SetTicketStatusResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetTicketStatus")
    public SetTicketStatusResponse setTicketStatus(
        @WebParam(partName = "body", name = "SetTicketStatusRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        SetTicketStatusRequest body
    ) throws RulesException;

    @WebResult(name = "GetNumberOfOpenAlarmsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetNumberOfOpenAlarms")
    public GetNumberOfOpenAlarmsResponse getNumberOfOpenAlarms(
        @WebParam(partName = "body", name = "GetNumberOfOpenAlarmsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetNumberOfOpenAlarmsRequest body
    ) throws RulesException;

    @WebResult(name = "CreateCustomRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateCustomRule")
    public CreateCustomRuleResponse createCustomRule(
        @WebParam(partName = "body", name = "CreateCustomRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        CreateCustomRuleRequest body
    ) throws RulesException;

    @WebResult(name = "UpdateCustomRuleSubscriptionResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateCustomRuleSubscription")
    public UpdateCustomRuleSubscriptionResponse updateCustomRuleSubscription(
        @WebParam(partName = "body", name = "UpdateCustomRuleSubscriptionRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpdateCustomRuleSubscriptionRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketListByMovementsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketListByMovements")
    public GetTicketListByMovementsResponse getTicketListByMovements(
        @WebParam(partName = "body", name = "GetTicketListByMovementsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketListByMovementsRequest body
    ) throws RulesException;

    @WebResult(name = "GetNumberOfOpenTicketsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetNumberOfOpenTickets")
    public GetNumberOfOpenTicketsResponse getNumberOfOpenTickets(
        @WebParam(partName = "body", name = "GetNumberOfOpenTicketsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetNumberOfOpenTicketsRequest body
    ) throws RulesException;

    @WebResult(name = "GetRunnableCustomRulesResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetRunnableCustomRules")
    public GetRunnableCustomRulesResponse getRunnableCustomRules(
        @WebParam(partName = "body", name = "GetRunnableCustomRulesRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetRunnableCustomRulesRequest body
    ) throws RulesException;

    @WebResult(name = "GetNumberOfAssetsNotSendingResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetNumberOfAssetsNotSending")
    public GetNumberOfAssetsNotSendingResponse getNumberOfAssetsNotSending(
        @WebParam(partName = "body", name = "GetNumberOfAssetsNotSendingRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetNumberOfAssetsNotSendingRequest body
    ) throws RulesException;

    @WebResult(name = "UpdateTicketCountResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateTicketCount")
    public UpdateTicketCountResponse updateTicketCount(
        @WebParam(partName = "body", name = "UpdateTicketCountRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpdateTicketCountRequest body
    ) throws RulesException;

    @WebResult(name = "GetAlarmListByQueryResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetAlarmListByQuery")
    public GetAlarmListByQueryResponse getAlarmListByQuery(
        @WebParam(partName = "body", name = "GetAlarmListByQueryRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetAlarmListByQueryRequest body
    ) throws RulesException;

    @WebResult(name = "DeleteCustomRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "DeleteCustomRule")
    public DeleteCustomRuleResponse deleteCustomRule(
        @WebParam(partName = "body", name = "DeleteCustomRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        DeleteCustomRuleRequest body
    ) throws RulesException;

    @WebResult(name = "GetCustomRuleListByQueryResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetCustomRuleListByQuery")
    public GetCustomRuleListByQueryResponse getCustomRuleListByQuery(
        @WebParam(partName = "body", name = "GetCustomRuleListByQueryRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetCustomRuleListByQueryRequest body
    ) throws RulesException;

    @WebResult(name = "ReprocessAlarmResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "ReprocessAlarmReport")
    public ReprocessAlarmResponse reprocessAlarmReport(
        @WebParam(partName = "body", name = "ReprocessAlarmRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        ReprocessAlarmRequest body
    ) throws RulesException;

    @WebResult(name = "PingResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Ping")
    public PingResponse ping(
        @WebParam(partName = "body", name = "PingRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @WebResult(name = "UpdateCustomRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateCustomRule")
    public UpdateCustomRuleResponse updateCustomRule(
        @WebParam(partName = "body", name = "UpdateCustomRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpdateCustomRuleRequest body
    ) throws RulesException;

    @WebResult(name = "UpdateCustomRuleLastTriggeredResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateCustomRuleLastTriggered")
    public UpdateCustomRuleLastTriggeredResponse updateCustomRuleLastTriggered(
        @WebParam(partName = "body", name = "UpdateCustomRuleLastTriggeredRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpdateCustomRuleLastTriggeredRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketsAndRulesByMovementsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketsAndRulesByMovements")
    public GetTicketsAndRulesByMovementsResponse getTicketsAndRulesByMovements(
        @WebParam(partName = "body", name = "GetTicketsAndRulesByMovementsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketsAndRulesByMovementsRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketListByQueryResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketListByQuery")
    public GetTicketListByQueryResponse getTicketListByQuery(
        @WebParam(partName = "body", name = "GetTicketListByQueryRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketListByQueryRequest body
    ) throws RulesException;

    @WebResult(name = "UpsertPreviousReportResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpsertPreviousReport")
    public UpsertPreviousReportResponse upsertPreviousReport(
        @WebParam(partName = "body", name = "UpsertPreviousReportRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpsertPreviousReportRequest body
    ) throws RulesException;

    @WebResult(name = "CreateTicketResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateTicket")
    public CreateTicketResponse createTicket(
        @WebParam(partName = "body", name = "CreateTicketRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        CreateTicketRequest body
    ) throws RulesException;

    @WebResult(name = "GetCustomRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetCustomRule")
    public GetCustomRuleResponse getCustomRule(
        @WebParam(partName = "body", name = "GetCustomRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetCustomRuleRequest body
    ) throws RulesException;

    @WebResult(name = "SingleTicketResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicket")
    public SingleTicketResponse getTicket(
        @WebParam(partName = "body", name = "GetTicketRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketRequest body
    ) throws RulesException;

    @WebResult(name = "SingleAlarmResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetAlarm")
    public SingleAlarmResponse getAlarm(
        @WebParam(partName = "body", name = "GetAlarmRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetAlarmRequest body
    ) throws RulesException;

    @WebResult(name = "GetPreviousReportByAssetGuidResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetPreviousReportByAssetGuid")
    public GetPreviousReportByAssetGuidResponse getPreviousReportByAssetGuid(
        @WebParam(partName = "body", name = "GetPreviousReportByAssetGuidRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetPreviousReportByAssetGuidRequest body
    ) throws RulesException;

    @WebResult(name = "GetTicketByAssetAndRuleResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetTicketByAssetAndRule")
    public GetTicketByAssetAndRuleResponse getTicketByAssetAndRule(
        @WebParam(partName = "body", name = "GetTicketByAssetAndRuleRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetTicketByAssetAndRuleRequest body
    ) throws RulesException;

    @WebResult(name = "GetPreviousReportsResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetPreviousReports")
    public GetPreviousReportsResponse getPreviousReports(
        @WebParam(partName = "body", name = "GetPreviousReportsRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetPreviousReportsRequest body
    ) throws RulesException;

    @WebResult(name = "CreateAlarmReportResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateAlarmReport")
    public CreateAlarmReportResponse createAlarmReport(
        @WebParam(partName = "body", name = "CreateAlarmReportRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        CreateAlarmReportRequest body
    ) throws RulesException;

    @WebResult(name = "GetCustomRulesByUserResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetCustomRulesByUser")
    public GetCustomRulesByUserResponse getCustomRulesByUser(
        @WebParam(partName = "body", name = "GetCustomRulesByUserRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        GetCustomRulesByUserRequest body
    ) throws RulesException;

    @WebResult(name = "SetAlarmStatusResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetAlarmStatus")
    public SetAlarmStatusResponse setAlarmStatus(
        @WebParam(partName = "body", name = "SetAlarmStatusRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        SetAlarmStatusRequest body
    ) throws RulesException;

    @WebResult(name = "UpdateTicketStatusByQueryResponse", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateTicketStatusByQuery")
    public UpdateTicketStatusByQueryResponse updateTicketStatusByQuery(
        @WebParam(partName = "body", name = "UpdateTicketStatusByQueryRequest", targetNamespace = "urn:source.rules.schema.fisheries.ec.europa.eu:v1")
        UpdateTicketStatusByQueryRequest body
    ) throws RulesException;
}