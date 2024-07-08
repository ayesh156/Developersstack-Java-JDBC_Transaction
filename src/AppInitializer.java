import java.sql.SQLException;
import java.util.Date;

public class AppInitializer {
    public static void main(String[] args) {
        CrudManager crudManager = new CrudManager();
        Account account = new Account("A-3","Nimal",25000);
        Payment payment = new Payment("P-3", new Date(), 2500);

        try{
            System.out.println(
                    crudManager.saveData(account,payment)
            );
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
