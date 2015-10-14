package eu.europa.ec.fisheries.uvms.rules.model.dto;

import java.io.Serializable;
import java.util.List;

import eu.europa.ec.fisheries.schema.rules.alarm.v1.AlarmReportType;

public class AlarmListResponseDto implements Serializable {

    private static final long serialVersionUID = 1;

    private List<AlarmReportType> alarmList;
    private int totalNumberOfPages;
    private int currentPage;

    public List<AlarmReportType> getAlarmList() {
        return alarmList;
    }

    public void setAlarmList(List<AlarmReportType> alarmList) {
        this.alarmList = alarmList;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}