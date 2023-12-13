package LearningJava;

import java.io.*;

class Employee implements Serializable {
    String emp_name;
    int emp_id;
    double emp_sal;

    public Employee(String emp_name, int emp_id, double emp_sal) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
    }

    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_id=" + emp_id +
                ", emp_sal=" + emp_sal +
                '}';
    }
}

public class ObjectToFile {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 101, 50000.0);

        serializeObjectToFile(employee, "employee.txt");

        Employee deserializedEmployee = (Employee) deserializeObjectFromFile("employee.txt");

        System.out.println("Deserialized Employee Object: " + deserializedEmployee);
    }

    // Serialize the object to a file
    private static void serializeObjectToFile(Object obj, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
            System.out.println("Object serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize the object from a file
    private static Object deserializeObjectFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
