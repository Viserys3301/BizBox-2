package kz.healthcity.medbox.entities.manipulation.corp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Assistance_clients")
public class Assistance_clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private  Integer ID;

    @Column(name = "faCustomers_ID")
    private Integer faCustomers_ID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "AbbrName")
    private String AbbrName;

    @Column(name = "Contract")
    private String Contract;

    @Column(name = "Expiration_date")
    private Date Expiration_date;

    @Column(name = "Assistance_types_ID")
    private Integer Assistance_types_ID;
}
