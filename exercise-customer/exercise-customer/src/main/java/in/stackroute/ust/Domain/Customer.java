package in.stackroute.ust.Domain;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private int customerId;
    private String customerName;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street",column = @Column(name = "home_street")),
            @AttributeOverride(name = "city",column = @Column(name = "home_city")),
            @AttributeOverride(name = "state",column = @Column(name = "home_state")),
            @AttributeOverride(name = "country",column = @Column(name = "home_country"))
    })
    private Address homeaddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street",column = @Column(name = "work_street")),
            @AttributeOverride(name="city",column = @Column(name = "work_city")),
            @AttributeOverride(name="state",column = @Column(name = "work_state")),
            @AttributeOverride(name="country",column = @Column(name = "work_country"))
    })
    private Address workaddress;
}
