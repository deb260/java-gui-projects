public class MVCPDemo{
public static void main(String[] args){
Student model=new Student();
model.setName("Deb");
model.setRollNo("101");

StudentView view=new studentView();

StudentController controller=new StudentController(model, view);

controller.updateView();

controller.setStudentName("Boon");
controller.setStudentRollNo("102");
controller.updateView();
}
}
