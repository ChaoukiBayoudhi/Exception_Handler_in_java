package providerMgt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data //generates all getters and setters,no args constructor, overrides ToString, Equals and hashCode
@AllArgsConstructor
public class Provider {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
}
