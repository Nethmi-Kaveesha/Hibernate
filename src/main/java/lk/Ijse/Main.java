package lk.Ijse;

import lk.Ijse.config.FactoryConfiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import lk.Ijse.entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Session and Transaction for Student entity
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        FullName fullName = new FullName("Nethmi", "Kaveesha");
        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Moratuwa");

        session.save(student);
        transaction.commit();
        session.close();

        // Session and Transaction for Vehicle entity
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();

        Vehicle vehicle = new Vehicle();
        vehicle.setNumber("nk001");
        vehicle.setModel("Suzuki");
        vehicle.setName("Alto");
        vehicle.setColor("red");

        session1.save(vehicle);
        transaction1.commit();
        session1.close();
    }
}
