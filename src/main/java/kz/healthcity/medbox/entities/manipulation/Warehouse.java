package kz.healthcity.medbox.entities.manipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mscWarehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_mscWarehouse")
    private Short primaryKey;

    @Column(name = "tstamp")
    private Byte[] tstamp;

    @Column(name = "FK_mscWarehouseGrp")
    private Integer FK_mscWarehouseGrp;

    @Column(name = "FK_mscBranches")
    private Short keyBranches;

    @Column(name = "FK_faGLAcctGrp")
    private String FK_faGLAcctGrp;

    @Column(name = "hs7whcode")
    private String hs7whcode;

    @Column(name = "description")
    private String description;

    @Column(name = "shortname")
    private String shortname;

    @Column(name = "location")
    private String location;

    @Column(name = "chrgno")
    private Integer chrgno;

    @Column(name = "cashno")
    private Integer cashno;

    @Column(name = "prno")
    private Integer prno;

    @Column(name = "pono")
    private Integer pono;

    @Column(name = "stkreqno")
    private Integer stkreqno;

    @Column(name = "stkissno")
    private Integer stkissno;

    @Column(name = "expreqno")
    private Integer expreqno;

    @Column(name = "expissno")
    private Integer expissno;

    @Column(name = "isupdatecomp")
    private Boolean isupdatecomp;

    @Column(name = "isspecialarea")
    private Boolean isspecialarea;

    @Column(name = "isstaggered")
    private Boolean isstaggered;

    @Column(name = "iscentralizereq")
    private Boolean iscentralizereq;

    @Column(name = "isautoprint")
    private Boolean isautoprint;

    @Column(name = "isprofitdept")
    private Boolean isprofitdept;

    @Column(name = "iswithresult")
    private Boolean iswithresult;

    @Column(name = "isdiscountable")
    private Boolean isdiscountable;

    @Column(name = "isissueor")
    private Boolean isissueor;

    @Column(name = "isrenreqflag")
    private Boolean isrenreqflag;

    @Column(name = "isautorendertodep")
    private Boolean isautorendertodep;

    @Column(name = "isautorenderbydep")
    private Boolean isautorenderbydep;

    @Column(name = "isenforcerestrictmms")
    private Boolean isenforcerestrictmms;

    @Column(name = "ispurchasingdept")
    private Boolean ispurchasingdept;

    @Column(name = "isenforceopdvat")
    private Boolean isenforceopdvat;

    @Column(name = "isenforceipdvat")
    private Boolean isenforceipdvat;

    @Column(name = "isenforceerdvat")
    private Boolean isenforceerdvat;

    @Column(name = "isenforcerelocation")
    private Boolean isenforcerelocation;

    @Column(name = "isenableallergyalert")
    private Boolean isenableallergyalert;

    @Column(name = "isSystemDefault")
    private Boolean isSystemDefault;

    @Column(name = "isMedicines")
    private Boolean isMedicines;

    @Column(name = "isExams")
    private Boolean isExams;

    @Column(name = "isSupplies")
    private Boolean isSupplies;

    @Column(name = "isProcedures")
    private Boolean isProcedures;

    @Column(name = "isAssets")
    private Boolean isAssets;

    @Column(name = "isOthers")
    private Boolean isOthers;

    @Column(name = "isWithSection")
    private Boolean isWithSection;

    @Column(name = "isApplySAPricetoNSARequest")
    private Boolean isApplySAPricetoNSARequest;

    @Column(name = "maxreqchrgitemno")
    private Short maxreqchrgitemno;

    @Column(name = "chslipipdrdlfilename")
    private String chslipipdrdlfilename;

    @Column(name = "chslipopdrdlfilename")
    private String chslipopdrdlfilename;

    @Column(name = "chsliperdrdlfilename")
    private String chsliperdrdlfilename;

    @Column(name = "caslipipdrdlfilename")
    private String caslipipdrdlfilename;

    @Column(name = "caslipopdrdlfilename")
    private String caslipopdrdlfilename;

    @Column(name = "casliperdrdlfilename")
    private String casliperdrdlfilename;

    @Column(name = "reagentpostsetup")
    private String reagentpostsetup;

    @Column(name = "SeriesnoCA")
    private Long SeriesnoCA;

    @Column(name = "SeriesnoCH")
    private Long SeriesnoCH;

    @Column(name = "InvTemp")
    private String InvTemp;

    @Column(name = "enableBarcodeIDperTransaction")
    private Boolean enableBarcodeIDperTransaction;

    @Column(name = "isenforceexclusiveopdvat")
    private Boolean isenforceexclusiveopdvat;

    @Column(name = "isenforceexclusiveipdvat")
    private Boolean isenforceexclusiveipdvat;

    @Column(name = "isenforceexclusiveerdvat")
    private Boolean isenforceexclusiveerdvat;

    @Column(name = "isEnableInventoryBarcoding")
    private Boolean isEnableInventoryBarcoding;

    @Column(name = "rxmedno")
    private Integer rxmedno;



























}
