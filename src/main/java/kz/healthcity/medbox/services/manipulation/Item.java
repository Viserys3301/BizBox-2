package kz.healthcity.medbox.services.manipulation;

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
@Table(name = "iwitems")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_iwItems")
    private String primaryKey;

    @Column(name = "tstamp")
    private Byte[] tstamp;

    @Column(name = "FK_mscItemCategory")
    private Integer FK_mscItemCategory;

    @Column(name = "FK_mscExamTypes")
    private Integer FK_mscExamTypes;

    @Column(name = "FK_mscPHICCategory")
    private Integer FK_mscPHICCategory;

    @Column(name = "FK_faVendors")
    private Integer FK_faVendors;

    @Column(name = "FK_mscDrugAdminGroup")
    private Integer FK_mscDrugAdminGroup;

    @Column(name = "FK_mscDoctorServiceClass")
    private Integer FK_mscDoctorServiceClass;

    @Column(name = "conversion")
    private Integer conversion;

    @Column(name = "orderqty")
    private Integer orderqty;

    @Column(name = "poqty")
    private Integer poqty;

    @Column(name = "FK_mscCPTSections")
    private Integer FK_mscCPTSections;

    @Column(name = "FK_mscCPTSubSections")
    private Integer FK_mscCPTSubSections;

    @Column(name = "ruvno")
    private Integer ruvno;

    @Column(name = "LeadTime")
    private Integer LeadTime;

    @Column(name = "reorderbufferdays")
    private Integer reorderbufferdays;

    @Column(name = "FK_mscWarehouse_reorder")
    private Integer FK_mscWarehouse_reorder;

    @Column(name = "FK_mscOtherHospitalServices")
    private Integer FK_mscOtherHospitalServices;

    @Column(name = "FK_mscModalities")
    private Integer FK_mscModalities;

    @Column(name = "FK_emdTempSpecializations")
    private Integer FK_emdTempSpecializations;

    @Column(name = "FK_mscSpecimens")
    private Integer FK_mscSpecimens;

    @Column(name = "saleprice")
    private BigDecimal saleprice;

    @Column(name = "purcprice")
    private BigDecimal purcprice;

    @Column(name = "phicprice")
    private BigDecimal phicprice;

    @Column(name = "dctrrbbase")
    private BigDecimal dctrrbbase;

    @Column(name = "agentrbbase")
    private BigDecimal agentrbbase;

    @Column(name = "lowinven")
    private BigDecimal lowinven;

    @Column(name = "maxinven")
    private BigDecimal maxinven;

    @Column(name = "statpercent")
    private BigDecimal statpercent;

    @Column(name = "rfbase")
    private BigDecimal rfbase;


    @Column(name = "scbasepriceipd")
    private BigDecimal scbasepriceipd;

    @Column(name = "scbasepriceopd")
    private BigDecimal scbasepriceopd;

    @Column(name = "scbasepriceerd")
    private BigDecimal scbasepriceerd;

    @Column(name = "lastpurcprice")
    private BigDecimal lastpurcprice;

    @Column(name = "landcost")
    private BigDecimal landcost;

    @Column(name = "minsaleprice")
    private BigDecimal minsaleprice;

    @Column(name = "maxsaleprice")
    private BigDecimal maxsaleprice;

    @Column(name = "lastrrqty")
    private BigDecimal lastrrqty;

    @Column(name = "lastprqty")
    private BigDecimal lastprqty;

    @Column(name = "ReOrderRate")
    private BigDecimal ReOrderRate;

    @Column(name = "bulkcost")
    private BigDecimal bulkcost;

    @Column(name = "rbrate")
    private BigDecimal rbrate;

    @Column(name = "avgcost")
    private BigDecimal avgcost;

    @Column(name = "ruvrate")
    private BigDecimal ruvrate;

    @Column(name = "drsbase")
    private BigDecimal drsbase;

    @Column(name = "allowedcost")
    private BigDecimal allowedcost;

    @Column(name = "rebateRateReq")
    private BigDecimal rebateRateReq;

    @Column(name = "rebateRateAnnual")
    private BigDecimal rebateRateAnnual;

    @Column(name = "isallowstat")
    private Boolean isallowstat;

    @Column(name = "isphicdeductable")
    private Boolean isphicdeductable;

    @Column(name = "isactive")
    private Boolean isactive;

    @Column(name = "isfixedasset")
    private Boolean isfixedasset;

    @Column(name = "isallowdiscount")
    private Boolean isallowdiscount;

    @Column(name = "isopenprice")
    private Boolean isopenprice;

    @Column(name = "isreagentonly")
    private Boolean isreagentonly;

    @Column(name = "isactvresult")
    private Boolean isactvresult;

    @Column(name = "issingletest")
    private Boolean issingletest;

    @Column(name = "isproductiononly")
    private Boolean isproductiononly;

    @Column(name = "isvatable")
    private Boolean isvatable;

    @Column(name = "isPHICItemAnalysis")
    private Boolean isPHICItemAnalysis;

    @Column(name = "isInventory")
    private Boolean isInventory;

    @Column(name = "isConsignment")
    private Boolean isConsignment;

    @Column(name = "isallowrb")
    private Boolean isallowrb;

    @Column(name = "isHS8Item")
    private Boolean isHS8Item;

    @Column(name = "isConsultation")
    private Boolean isConsultation;

    @Column(name = "isIncludeinAutoSPupdate")
    private Boolean isIncludeinAutoSPupdate;

    @Column(name = "isreorderitem")
    private Boolean isreorderitem;

    @Column(name = "isRequireLotNo")
    private Boolean isRequireLotNo;

    @Column(name = "isRequireExpDate")
    private Boolean isRequireExpDate;

    @Column(name = "includeinRebateAnnual")
    private Boolean includeinRebateAnnual;

    @Column(name = "isERDRebate")
    private Boolean isERDRebate;

    @Column(name = "isOPDRebate")
    private Boolean isOPDRebate;

    @Column(name = "isIPDRebate")
    private Boolean isIPDRebate;

    @Column(name = "isdoctorfee")
    private Boolean isdoctorfee;

    @Column(name = "isVATExempt")
    private Boolean isVATExempt;

    @Column(name = "isZeroRated")
    private Boolean isZeroRated;

    @Column(name = "IsImmunization")
    private Boolean IsImmunization;

    @Column(name = "ispathology")
    private Boolean ispathology;

    @Column(name = "isprimarymedteam")
    private Boolean isprimarymedteam;

    @Column(name = "isOrthoSpine")
    private Boolean isOrthoSpine;

    @Column(name = "includeinRebatePriceScheme")
    private Boolean includeinRebatePriceScheme;

    @Column(name = "picture")
    private Byte[] picture;

    @Column(name = "slowdays")
    private Short slowdays;

    @Column(name = "saledate")
    private Timestamp saledate;

    @Column(name = "lastpurcdate")
    private Timestamp lastpurcdate;

    @Column(name = "lastrrdate")
    private Timestamp lastrrdate;

    @Column(name = "lastprdate")
    private Timestamp lastprdate;

    @Column(name = "purcdate")
    private Timestamp purcdate;

    @Column(name = "reorderdatestart")
    private Timestamp reorderdatestart;

    @Column(name = "FK_mscPrintCategory")
    private String FK_mscPrintCategory;

    @Column(name = "FK_faGLAcctSalesIPD")
    private String FK_faGLAcctSalesIPD;

    @Column(name = "FK_faGLAcctSalesOPD")
    private String FK_faGLAcctSalesOPD;

    @Column(name = "FK_faGLAcctSalesERD")
    private String FK_faGLAcctSalesERD;

    @Column(name = "FK_faGLAcctCostIPD")
    private String FK_faGLAcctCostIPD;

    @Column(name = "FK_faGLAcctCostOPD")
    private String FK_faGLAcctCostOPD;

    @Column(name = "FK_faGLAcctCostERD")
    private String FK_faGLAcctCostERD;

    @Column(name = "FK_faGLAcctRF")
    private String FK_faGLAcctRF;

    @Column(name = "FK_faGLAcctInven")
    private String FK_faGLAcctInven;

    @Column(name = "FK_faGLAcctExpense")
    private String FK_faGLAcctExpense;

    @Column(name = "FK_faGLAcctPurchase")
    private String FK_faGLAcctPurchase;

    @Column(name = "hs7itemid")
    private String hs7itemid;

    @Column(name = "itemgroup")
    private String itemgroup;

    @Column(name = "barcodeid")
    private String barcodeid;

    @Column(name = "barcodeidcustom")
    private String barcodeidcustom;

    @Column(name = "itemdesc")
    private String itemdesc;

    @Column(name = "itemdesccustom")
    private String itemdesccustom;

    @Column(name = "itemabbrev")
    private String itemabbrev;

    @Column(name = "specs")
    private String specs;

    @Column(name = "unit")
    private String unit;

    @Column(name = "bigunit")
    private String bigunit;

    @Column(name = "resultcateg")
    private String resultcateg;

    @Column(name = "printsection")
    private String printsection;

    @Column(name = "purcdiscountspecs")
    private String purcdiscountspecs;

    @Column(name = "surgicaltype")
    private String surgicaltype;

    @Column(name = "dctrrboption")
    private String dctrrboption;

    @Column(name = "agentrboption")
    private String agentrboption;

    @Column(name = "rfsetup")
    private String rfsetup;

    @Column(name = "rfcomptype")
    private String rfcomptype;

    @Column(name = "othinfo")
    private String othinfo;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "invtype")
    private String invtype;

    @Column(name = "printcateg")
    private String printcateg;

    @Column(name = "cptcode")
    private String cptcode;

    @Column(name = "cptsymbol")
    private String cptsymbol;

    @Column(name = "AutoSPupdateOption")
    private String AutoSPupdateOption;

    @Column(name = "drsharetype")
    private String drsharetype;

    @Column(name = "EDPMSDrugCode")
    private String EDPMSDrugCode;

    @Column(name = "SAPCustID")
    private String SAPCustID;


































}
