public class EmployeeController {
    private EmployeeModel EMPLOYEE_MODEL;
    private EmployeeView EMPLOYEE_VIEW;

    public EmployeeController(EmployeeModel EMPLOYEE_MODEL, EmployeeView EMPLOYEE_VIEW) {
        this.EMPLOYEE_MODEL = EMPLOYEE_MODEL;
        this.EMPLOYEE_VIEW = EMPLOYEE_VIEW;
    }
    public int getEmployeeID() {
        return EMPLOYEE_MODEL.getId();
    }
    public String getEmployeeName() {
        return EMPLOYEE_MODEL.getName();
    }
    public void setEmployeeId(int id) {
        EMPLOYEE_MODEL.setId(id);
    }
    public void setEmployeeName(String name) {
        EMPLOYEE_MODEL.setName(name);
    }
public void updateView(){
        EMPLOYEE_VIEW.showDetails(EMPLOYEE_MODEL.getName(),EMPLOYEE_MODEL.getId());
}
public void showDetails(){
        EMPLOYEE_VIEW.printDetails(EMPLOYEE_MODEL.getName(),EMPLOYEE_MODEL.getId());
}
}
