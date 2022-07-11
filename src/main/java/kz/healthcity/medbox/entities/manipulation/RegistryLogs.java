package kz.healthcity.medbox.entities.manipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RegistryLogs")
public class RegistryLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "RegID")
    private String RegID;

    @Column(name = "Data")
    private String Data;

    @Column(name = "Date")
    private String Date;

    @Column(name = "TranID_FK_TRXNO")
    private Integer TranID_FK_TRXNO;

    @Column(name = "TranID_PK_psPatledgers")
    private Integer TranID_PK_psPatledgers;

    @Column(name = "OldDocId")
    private Integer OldDocId;

    @Column(name = "newDocID")
    private Integer newDocID;

    @Column(name = "OldDate")
    private String OldDate;

    @Column(name = "NewDate")
    private String NewDate;

    @Column(name = "Payment")
    private Integer Payment;

    @Column(name = "user_id")
    private String UserDb;

    @Column(name = "FirstPatId")
    private String FirstPatId;

    @Column(name = "SecondPatId")
    private String SecondPatId;
}
