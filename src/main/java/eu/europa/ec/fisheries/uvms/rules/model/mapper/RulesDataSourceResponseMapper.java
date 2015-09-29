package eu.europa.ec.fisheries.uvms.rules.model.mapper;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.europa.ec.fisheries.schema.rules.alarm.v1.AlarmType;
import eu.europa.ec.fisheries.schema.rules.module.v1.CreateCustomRuleResponse;
import eu.europa.ec.fisheries.schema.rules.module.v1.GetCustomRuleListResponse;
import eu.europa.ec.fisheries.schema.rules.source.v1.GetAlarmListByQueryResponse;
import eu.europa.ec.fisheries.schema.rules.v1.CustomRuleType;
import eu.europa.ec.fisheries.uvms.rules.model.dto.AlarmListResponseDto;
import eu.europa.ec.fisheries.uvms.rules.model.exception.RulesModelMapperException;

public class RulesDataSourceResponseMapper {

    final static Logger LOG = LoggerFactory.getLogger(RulesDataSourceResponseMapper.class);

    /**
     * Validates a response
     *
     * @param response
     * @param correlationId
     * @throws RulesModelMapperException
     * @throws JMSException
     */
    private static void validateResponse(TextMessage response, String correlationId) throws RulesModelMapperException, JMSException {

        if (response == null) {
            LOG.error("[ Error when validating response in ResponseMapper: Response is Null ]");
            throw new RulesModelMapperException("[ Error when validating response in ResponseMapper: Response is Null ]");
        }

        if (response.getJMSCorrelationID() == null) {
            LOG.error("[ No corelationId in response.] Expected was: {} ", correlationId);
            throw new RulesModelMapperException("[ No corelationId in response (Null) ] . Expected was: " + correlationId);
        }

        if (!correlationId.equalsIgnoreCase(response.getJMSCorrelationID())) {
            LOG.error("[ Wrong corelationId in response. Expected was {0} But actual was: {1} ]", correlationId, response.getJMSCorrelationID());
            throw new RulesModelMapperException("[ Wrong corelationId in response. ] Expected was: " + correlationId + "But actual was: "
                    + response.getJMSCorrelationID());
        }

    }

    public static CustomRuleType mapToCreateCustomRuleFromResponse(TextMessage message) throws RulesModelMapperException {
        CreateCustomRuleResponse response = JAXBMarshaller.unmarshallTextMessage(message, CreateCustomRuleResponse.class);
        return response.getCustomRule();
    }

    public static String createCustomRuleResponse(CustomRuleType customRule) throws RulesModelMapperException {
        CreateCustomRuleResponse response = new CreateCustomRuleResponse();
        response.setCustomRule(customRule);
        return JAXBMarshaller.marshallJaxBObjectToString(response);
    }

    public static List<CustomRuleType> mapToCustomRuleListFromResponse(TextMessage message) throws RulesModelMapperException {
        GetCustomRuleListResponse response = JAXBMarshaller.unmarshallTextMessage(message, GetCustomRuleListResponse.class);
        return response.getCustomRules();
    }

    public static String getCustomRuleListResponse(List<CustomRuleType> customRules) throws RulesModelMapperException {
        GetCustomRuleListResponse response = new GetCustomRuleListResponse();
        response.getCustomRules().addAll(customRules);
        return JAXBMarshaller.marshallJaxBObjectToString(response);
    }

    public static List<AlarmType> mapToAlarmListFromResponse(TextMessage message) throws RulesModelMapperException {
        GetAlarmListByQueryResponse response = JAXBMarshaller.unmarshallTextMessage(message, GetAlarmListByQueryResponse.class);
        return response.getAlarms();
    }

    public static String createAlarmListResponse(AlarmListResponseDto responseDto) throws RulesModelMapperException {
        GetAlarmListByQueryResponse response = new GetAlarmListByQueryResponse();
        response.getAlarms().addAll(responseDto.getAlarmList());
        // TODO: intValue() should not be necessary - something is fishy with
        // the wsdl
        response.setCurrentPage(responseDto.getCurrentPage().intValue());
        response.setTotalNumberOfPages(responseDto.getTotalNumberOfPages().intValue());
        return JAXBMarshaller.marshallJaxBObjectToString(response);
    }

}
