package kz.healthcity.medbox.entities.manipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mscBranches")
public class Branches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_mscBranches")
    private Short primaryKey;

    @Column(name = "tstamp")
    private Byte[] tstamp;

    @Column(name = "branchname")
    private String branchname;

    @Column(name = "branchaddress")
    private String branchaddress;

    @Column(name = "branchtelephone")
    private String  branchtelephone;

    @Column(name = "branchcontact")
    private String branchcontact;

    @Column(name = "isSystemDefault")
    private Boolean isSystemDefault;

    @Column(name = "Prefix")
    private String Prefix;

    @Column(name = "Postfix")
    private String Postfix;

    @Column(name = "SeriesnoCA")
    private Long SeriesnoCA;

    @Column(name = "SeriesnoCH")
    private Long SeriesnoCH;

    @Column(name = "InvTemp")
    private String InvTemp;

    @Column(name = "customcode")
    private String customcode;

    @Column(name = "branchID")
    private String branchID;

    @Column(name = "FK_mscEntity")
    private Short FK_mscEntity;

    @Column(name = "BranchLogo")
    private Byte[] BranchLogo;

    @Column(name = "BranchTIN")
    private String BranchTIN;

    @Column(name = "BranchWebsite")
    private String BranchWebsite;

    @Column(name = "branchdatabase")
    private String branchdatabase;

}
