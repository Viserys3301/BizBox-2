package kz.healthcity.medbox.entities.manipulation.corp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Assistance_list")
public class AssistanceList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "psDatacenter_ID")
    private Integer datacenter_ID;

    @Column(name = "psDatacenter_REF")
    private Integer datacenter_REF;

    @Column(name ="Assistance_clients_ID")
    private Integer Assistance_clients_ID;

    @Column(name = "Assistance_packages_ID")
    private Integer Assistance_packages_ID;

    @Column(name = "isDiscontinued")
    private Integer isDiscontinued;

    @Column(name = "Expired_Date")
    private Timestamp Expired_Date;

    @Transient
    private String clientName;
    @Transient
    private String clientRefName;
    @Transient
    private String companyName;
    @Transient
    private String packageName;
}
