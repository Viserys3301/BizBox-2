package kz.healthcity.medbox.entities.manipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "psDatacenter")
public class DatacenterPatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_psDatacenter")
    private Long primaryKey;

    //PK_psDatacenter

    @Column(name = "tstamp")
    private Byte[] tstamp;

    @Column(name = "hs7dcno")
    private Integer hs7dcno;

    @Column(name = "rectype")
    private String rectype;

    @Column(name = "category")
    private String  category;

    @Column(name = "id")
    private String id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "fullname2")
    private String fullname2;

    @Column(name = "customname")
    private String  customname;

    @Column(name = "mobilephone")
    private String mobilephone;

    @Column(name = "telefax")
    private String telefax;

    @Column(name = "email")
    private String email;

    @Column(name = "prcontactperson")
    private String prcontactperson;

    @Column(name = "prtelno")
    private String prtelno;

    @Column(name = "prfaxno")
    private String prfaxno;

    @Column(name = "premail")
    private String premail;

    @Column(name = "prstreetbldg1")
    private String prstreetbldg1;

    @Column(name = "prstreetbldg2")
    private String prstreetbldg2;

    @Column(name = "prstreetbldg3")
    private String prstreetbldg3;

    @Column(name = "prbarangay")
    private String prbarangay;

    @Column(name = "prtowncity")
    private String prtowncity;

    @Column(name = "prprovince")
    private String prprovince;

    @Column(name = "prcountry")
    private String prcountry;

    @Column(name = "prregion")
    private String prregion;

    @Column(name = "prarea")
    private String prarea;

    @Column(name = "przipcode")
    private String przipcode;

    @Column(name = "praddress")
    private String praddress;

    @Column(name = "sdcontactperson")
    private String sdcontactperson;

    @Column(name = "sdtelno")
    private String sdtelno;

    @Column(name = "sdfaxno")
    private String sdfaxno;

    @Column(name = "sdemail")
    private String sdemail;

    @Column(name = "sdstreetbldg1")
    private String sdstreetbldg1;

    @Column(name = "sdstreetbldg2")
    private String sdstreetbldg2;

    @Column(name = "sdstreetbldg3")
    private String sdstreetbldg3;

    @Column(name = "sdbarangay")
    private String sdbarangay;

    @Column(name = "sdtowncity")
    private String sdtowncity;

    @Column(name = "sdprovince")
    private String sdprovince;

    @Column(name = "sdcountry")
    private String sdcountry;

    @Column(name = "sdregion")
    private String sdregion;

    @Column(name = "sdarea")
    private String sdarea;

    @Column(name = "sdzipcode")
    private String  sdzipcode;

    @Column(name = "sdaddress")
    private String sdaddress;

    @Column(name = "billflag")
    private Boolean billflag;

    @Column(name = "delvflag")
    private Boolean delvflag;

    @Column(name = "lcustomer")
    private Boolean lcustomer;

    @Column(name = "lvendor")
    private Boolean lvendor;

    @Column(name = "lemployee")
    private Boolean lemployee;

    @Column(name = "lpatient")
    private Boolean lpatient;

    @Column(name = "ldoctor")
    private Boolean ldoctor;

    @Column(name = "lsysuser")
    private Boolean lsysuser;

    @Column(name = "lapplicant")
    private Boolean lapplicant;

    @Column(name = "tin")
    private String tin;

    @Column(name = "sssgsisno")
    private String sssgsisno;

    @Column(name = "phicno")
    private String phicno;

    @Column(name = "pagibig")
    private String pagibig;

    @Column(name = "passportno")
    private String passportno;

    @Column(name = "driverlicenseno")
    private String driverlicenseno;

    @Column(name = "postdate")
    private Timestamp postdate;

    @Column(name = "postdcno")
    private String postdcno;

    @Column(name = "proflicenseno")
    private String proflicenseno;

    @Column(name = "localization")
    private String localization;

    @Column(name = "prcountrycode")
    private Integer prcountrycode;

    @Column(name = "othercontact")
    private String othercontact;

    @Column(name = "pagerno")
    private String pagerno;

    @Column(name = "mobilephone2")
    private String mobilephone2;

}
