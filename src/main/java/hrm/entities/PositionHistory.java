package hrm.entities;

import java.sql.Date;

public class PositionHistory extends EntityBase {
    private Date startDate;
    private Date endDate;

    private int employeeId;
    private int positionId;
    private int departmentId;

    public PositionHistory() {

    }

    public PositionHistory(Date _startDate, Date _endDate, int _employeeId, int _positionId, int _departmentId) {
        startDate = _startDate;
        endDate = _endDate;
        employeeId = _employeeId;
        positionId = _positionId;
        departmentId = _departmentId;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
