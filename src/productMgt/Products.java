package productMgt;

import Exceptions.ProviderNotFoundException;
import Exceptions.RequiredValueException;
import providerMgt.Providers;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> lstProducts=new ArrayList<>();
    //with propagation
    public void add(Product p) throws ProviderNotFoundException, RequiredValueException
    {
        if(Providers.findProvider(p.getProductProvider()))
            if(p.getLabel().equals("")|| p.getExpirationDate()==null|| p.getFabricationDate()==null)
                throw new RequiredValueException("Label, expriration date and fabrication date are required");
        int index=-1;
        if((index=lstProducts.indexOf(p))!=-1)
            lstProducts.add(p);
        //lstProducts.get(index).setStock(lstProducts.get(index).getStock()+p.getStock());
        Product p1=lstProducts.get(index);//get exsitent product
        int stock=p1.getStock();//existent stock
        p1.setStock(stock+p.getStock());

        System.out.println("Product has beeen successufly added");

    }
    //without propagation
    public void addV2(Product p)
    {
        try {
            if (Providers.findProvider(p.getProductProvider()))
                if (p.getLabel().equals("") || p.getExpirationDate() == null || p.getFabricationDate() == null)
                    throw new RequiredValueException("Label, expriration date and fabrication date are required");
            int index = -1;
            if ((index = lstProducts.indexOf(p)) != -1)
                lstProducts.add(p);
            //lstProducts.get(index).setStock(lstProducts.get(index).getStock()+p.getStock());
            Product p1 = lstProducts.get(index);//get exsitent product
            int stock = p1.getStock();//existent stock
            p1.setStock(stock + p.getStock());

            System.out.println("Product has beeen successufly added");
        }
        catch (RequiredValueException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ProviderNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void showProducts()
    {

    }
    public List<Product> soldOutProducts()
    {
        List<Product> lst1=new ArrayList<>();

        return lst1;
    }
}
