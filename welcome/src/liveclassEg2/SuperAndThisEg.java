package liveclassEg2;
class Employee {
    int id;
    String name;
    float salary;
    public Employee() {
            this.id  =123;
            this.name = "Unknown";
            this.salary = 8000;
    }
    public Employee(int id) {
        this();                        // calling empty constructor using this()
        this.id = id;
        //this.name = "Unknown";
        //this.salary = 8000;
    }
    public Employee(int id, String name) {
        this(id);
        //this.id = id;
        this.name = name;
        //this.salary = 8000;
    }
    public Employee(int id, String name, float salary) {
        this(id,name);
        this.salary = salary;
    }
    void dis() {
        System.out.println(" id is "+id);
        System.out.println("name is "+name);
        System.out.println("salary is "+salary);
    }
}


public class SuperAndThisEg {
	public static void main(String[] args) {
		Employee emp1 = new Employee();                                emp1.dis();
		Employee emp2 = new Employee(1);                                emp2.dis();
		Employee emp3 = new Employee(2,"Ravi");                    emp3.dis();
		Employee emp4 = new Employee(3, "Ajay", 14000);     emp4.dis();
		}

}
