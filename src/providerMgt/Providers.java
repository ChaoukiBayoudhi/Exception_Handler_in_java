package providerMgt;

import Exceptions.ProviderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Providers {
    private static List<Provider> lstProviders = new ArrayList<Provider>();
    public static boolean findProvider(Provider p) throws ProviderNotFoundException
    {
        if(!lstProviders.contains(p))
            throw new ProviderNotFoundException("The product's provider is not found");
        return true;
    }
}
