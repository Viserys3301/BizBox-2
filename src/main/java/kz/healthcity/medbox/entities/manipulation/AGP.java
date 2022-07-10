package kz.healthcity.medbox.entities.manipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AGP")
public class AGP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "psDatacenter_ID")
    private Integer psDatacenter_ID;

    @Column(name = "IIN")
    private String IIN;

    @Column(name = "CustomIIN")
    private String CustomIIN;

    @Column(name = "FamilyNum")
    private Integer FamilyNum;

    @Column(name = "Lastname")
    private String Lastname;

    @Column(name = "Firstname")
    private String Firstname;

    @Column(name = "Middlename")
    private String Middlename;

    @Column(name = "Fullname")
    private String Fullname;

    @Column(name = "Exp_date")
    private Timestamp Exp_date;

    @Column(name = "Birthdate")
    private Timestamp Birthdate;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Telno")
    private String Telno;

    @Column(name = "Package")
    private String Package;

    @Column(name = "Limit")
    private BigDecimal Limit;

    @Column(name = "discontinued")
    private Boolean discontinued;
}
