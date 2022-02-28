package commandMgt;

import productMgt.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Command {
    private long code;
    private LocalDate date;
    private Map<Product,Integer> commandedProducts=new HashMap<>();
}
