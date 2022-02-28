package customerMgt;

import Enumerations.CustomerType;
import commandMgt.Command;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor //generates a constructor without paramaters
@AllArgsConstructor //generates a constructor with all attributes as parameter
//@ToString //returns all attributes values
@ToString(exclude={"phoneNumber","customerCommands"})//returns all attributes values except phoneNumber and customerCommands
//@EqualsAndHashCode //overrides eqals and hashCode using all attributes
@EqualsAndHashCode(onlyExplicitlyIncluded = true)//compares Customer objects using only attributes annotated with @EqualsAndHasCode.Include
public class Customer {
    private Long id;
    @EqualsAndHashCode.Include
    private String firstName;
    @EqualsAndHashCode.Include
    private String lastName;
    @EqualsAndHashCode.Include
    private String email;
    private String address;
    private String phoneNumber;
    private CustomerType type=CustomerType.Normal;//default value
    private Set<Command> customerCommands =new HashSet<Command>();
}
