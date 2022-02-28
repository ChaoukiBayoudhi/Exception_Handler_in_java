package customerMgt;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private List<Customer> lstCustomers=new ArrayList<>();
    public void add(Customer c1)
    {
        try {
            if(lstCustomers.contains(c1))
                throw new Exception("Customer already exist");
            if(c1.getFirstName()==null||c1.getFirstName().trim().equals(""))
                throw new Exception("The firstname is required and could not be blank");
            if(c1.getLastName()==null||c1.getLastName().trim().equals(""))
                throw new Exception("The lastname is required and could not be blank");
        //...
            lstCustomers.add(c1);
            System.out.println("Customer has been added successufly");
        } catch (Exception e) {
            //e.printStackTrace();//prints the hole path of the exception
            System.out.println(e.getMessage());
        }
    }
}
