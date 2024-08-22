package lk.Ijse;

import lk.Ijse.config.FactoryConfiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Session session = FactoryConfiguration.getInstance().getSession();
        FullName fullName =new FullName("Nethmi","kaveesha");
        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Moratuwa");
        //open transaction
        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();
        //(home work)delete,get(study karanana),another table add(aluthen table ekak daganna),note ekath hadanna
        session.close();
        }
    }
