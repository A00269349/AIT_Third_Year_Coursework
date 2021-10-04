public class EmployeeTester {
    public static void main(String[] args) {
        EmployeeModel model = new EmployeeModel();
        model.setName("GEORGE JEFFERSON");
        model.setId(43242);

        EmployeeView view = new EmployeeView();
        view.showDetails(model.getName(), model.getId());

        EmployeeController controller = new EmployeeController(model,view);
        controller.updateView();
controller.showDetails();
    }
}
