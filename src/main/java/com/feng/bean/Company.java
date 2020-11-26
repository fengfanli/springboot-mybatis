package com.feng.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "COMPANY")
public class Company implements Serializable {
    /**
     * ADTID-自增序列
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 归属省份的首字母小写,OTHER
     */
    @Id
    @Column(name = "PROVINCE")
    private String province;

    /**
     * 天眼查ID
     */
    @Column(name = "TYC_ID")
    private Long tycId;

    /**
     * 公司名称
     */
    @Column(name = "COMPANY_NAME")
    private String companyName;

    /**
     * 公司名称拼音助记码
     */
    @Column(name = "COMPANY_AIDCODE")
    private String companyAidcode;

    /**
     * 法人ID
     */
    @Column(name = "LEGAL_PERSON_ID")
    private Long legalPersonId;

    /**
     * 法人姓名
     */
    @Column(name = "LEGAL_PERSON_NAME")
    private String legalPersonName;

    /**
     * 法人类型，1 人 2 公司 3 团体4 社会组织5 政府部门
     */
    @Column(name = "LEGAL_PERSON_TYPE")
    private Integer legalPersonType;

    /**
     * 法人分数
     */
    @Column(name = "LEGAL_PERSON_SCORE")
    private Integer legalPersonScore;

    /**
     * 注册号
     */
    @Column(name = "REG_NUMBER")
    private String regNumber;

    /**
     * 公司类型代码
     */
    @Column(name = "COMPANY_TYPE")
    private Short companyType;

    /**
     * 公司类型
     */
    @Column(name = "COMPANY_ORG_TYPE")
    private String companyOrgType;

    /**
     * 公司类型分数
     */
    @Column(name = "COMPANY_TYPE_SCORE")
    private Integer companyTypeScore;

    /**
     * 注册地址
     */
    @Column(name = "REG_LOCATION")
    private String regLocation;

    /**
     * 成立日期
     */
    @Column(name = "ESTIBLISH_TIME")
    private Date estiblishTime;

    /**
     * 营业期限开始日期
     */
    @Column(name = "FROM_TIME")
    private Date fromTime;

    /**
     * 营业期限终止日期
     */
    @Column(name = "TO_TIME")
    private Date toTime;

    /**
     * 经营范围
     */
    @Column(name = "BUSINESS_SCOPE")
    private String businessScope;

    /**
     * 登记机关
     */
    @Column(name = "REG_INSTITUTE")
    private String regInstitute;

    /**
     * 核准日期
     */
    @Column(name = "APPROVED_TIME")
    private Date approvedTime;

    /**
     * 企业状态
     */
    @Column(name = "REG_STATUS")
    private String regStatus;

    /**
     * 注册资金
     */
    @Column(name = "REG_CAPITAL")
    private String regCapital;

    /**
     * 实收注册资金
     */
    @Column(name = "ACTUAL_CAPITAL")
    private String actualCapital;

    /**
     * 组织机构代码
     */
    @Column(name = "ORG_NUMBER")
    private String orgNumber;

    /**
     * 组织机构批准单位
     */
    @Column(name = "ORG_APPROVED_INSTITUTE")
    private String orgApprovedInstitute;

    /**
     * 1表示parse过，0表示没parse，3表示parse出错
     */
    @Column(name = "FLAG")
    private Short flag;

    /**
     * 上级机构ID
     */
    @Column(name = "PARENT_ID")
    private Long parentId;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 上市代码
     */
    @Column(name = "LIST_CODE")
    private String listCode;

    /**
     * 母公司控股比例
     */
    @Column(name = "OWNERSHIP_STAKE")
    private String ownershipStake;

    /**
     * 数据来源标志,0,天眼查，1，自行爬取
     */
    @Column(name = "SOURCE_FLAG")
    private Integer sourceFlag;

    /**
     * 根据名称parse出的公司后缀类型
     */
    @Column(name = "NAME_SUFFIX")
    private String nameSuffix;

    /**
     * 统一社会信用代码（Unified Social Credit Code）
     */
    @Column(name = "USC_CODE")
    private String uscCode;

    /**
     * 该公司现用公司名所对应公司（former name）
     */
    @Column(name = "FORMER_NAME")
    private String formerName;

    /**
     * 公司英文名称
     */
    @Column(name = "COMPANY_ENNAME")
    private String companyEnname;

    /**
     * 对应新公司companyId
     */
    @Column(name = "NEW_COM_ID")
    private Long newComId;

    @Column(name = "USE_FLAG")
    private Integer useFlag;

    /**
     * 预留字段01
     */
    @Column(name = "DESC01")
    private String desc01;

    /**
     * 预留字段02
     */
    @Column(name = "DESC02")
    private String desc02;

    /**
     * 预留字段03
     */
    @Column(name = "DESC03")
    private String desc03;

    /**
     * 预留字段04
     */
    @Column(name = "DESC04")
    private String desc04;

    /**
     * 预留字段05
     */
    @Column(name = "DESC05")
    private String desc05;

    /**
     * 预留字段06
     */
    @Column(name = "DESC06")
    private String desc06;

    /**
     * 预留字段07
     */
    @Column(name = "DESC07")
    private String desc07;

    /**
     * 预留字段08
     */
    @Column(name = "DESC08")
    private String desc08;

    /**
     * 预留字段09
     */
    @Column(name = "DESC09")
    private String desc09;

    /**
     * 预留字段10
     */
    @Column(name = "DESC10")
    private String desc10;

    /**
     * 解析完成时间
     */
    @Column(name = "CRAWLED_TIME")
    private Date crawledTime;

    /**
     * 数据发布时间
     */
    @Column(name = "PUBLISH_TIME")
    private Date publishTime;

    /**
     * 原始链接URL
     */
    @Column(name = "URL_LINK")
    private String urlLink;

    /**
     * 数据采集人名
     */
    @Column(name = "COLLECTOR_NAME")
    private String collectorName;

    /**
     * 数据采集时间
     */
    @Column(name = "COLLECT_TIME")
    private Date collectTime;

    /**
     *  default ‘0’数据采集处理标志，0，未进行，1执行中，2完成，9 错误
     */
    @Column(name = "COLLECT_FLAG")
    private Integer collectFlag;

    /**
     * 数据清洗人名
     */
    @Column(name = "CLEANER_NAME")
    private String cleanerName;

    /**
     * 数据清洗时间
     */
    @Column(name = "CLEAN_TIME")
    private Date cleanTime;

    /**
     * 数据清洗标志0，未进行，1执行中，2完成，9 错误
     */
    @Column(name = "CLEAN_FLAG")
    private Integer cleanFlag;

    /**
     * 数据更新原因
     */
    @Column(name = "UPDATE_REASON")
    private String updateReason;

    /**
     * 时间戳
     */
    @Column(name = "TIME_STAMP")
    private Date timeStamp;

    /**
     * 版本号，初始版本0
     */
    @Column(name = "VERSION_ID")
    private Integer versionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ADTID-自增序列
     *
     * @return ID - ADTID-自增序列
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ADTID-自增序列
     *
     * @param id ADTID-自增序列
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取归属省份的首字母小写,OTHER
     *
     * @return PROVINCE - 归属省份的首字母小写,OTHER
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置归属省份的首字母小写,OTHER
     *
     * @param province 归属省份的首字母小写,OTHER
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取天眼查ID
     *
     * @return TYC_ID - 天眼查ID
     */
    public Long getTycId() {
        return tycId;
    }

    /**
     * 设置天眼查ID
     *
     * @param tycId 天眼查ID
     */
    public void setTycId(Long tycId) {
        this.tycId = tycId;
    }

    /**
     * 获取公司名称
     *
     * @return COMPANY_NAME - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取公司名称拼音助记码
     *
     * @return COMPANY_AIDCODE - 公司名称拼音助记码
     */
    public String getCompanyAidcode() {
        return companyAidcode;
    }

    /**
     * 设置公司名称拼音助记码
     *
     * @param companyAidcode 公司名称拼音助记码
     */
    public void setCompanyAidcode(String companyAidcode) {
        this.companyAidcode = companyAidcode == null ? null : companyAidcode.trim();
    }

    /**
     * 获取法人ID
     *
     * @return LEGAL_PERSON_ID - 法人ID
     */
    public Long getLegalPersonId() {
        return legalPersonId;
    }

    /**
     * 设置法人ID
     *
     * @param legalPersonId 法人ID
     */
    public void setLegalPersonId(Long legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    /**
     * 获取法人姓名
     *
     * @return LEGAL_PERSON_NAME - 法人姓名
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * 设置法人姓名
     *
     * @param legalPersonName 法人姓名
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    /**
     * 获取法人类型，1 人 2 公司 3 团体4 社会组织5 政府部门
     *
     * @return LEGAL_PERSON_TYPE - 法人类型，1 人 2 公司 3 团体4 社会组织5 政府部门
     */
    public Integer getLegalPersonType() {
        return legalPersonType;
    }

    /**
     * 设置法人类型，1 人 2 公司 3 团体4 社会组织5 政府部门
     *
     * @param legalPersonType 法人类型，1 人 2 公司 3 团体4 社会组织5 政府部门
     */
    public void setLegalPersonType(Integer legalPersonType) {
        this.legalPersonType = legalPersonType;
    }

    /**
     * 获取法人分数
     *
     * @return LEGAL_PERSON_SCORE - 法人分数
     */
    public Integer getLegalPersonScore() {
        return legalPersonScore;
    }

    /**
     * 设置法人分数
     *
     * @param legalPersonScore 法人分数
     */
    public void setLegalPersonScore(Integer legalPersonScore) {
        this.legalPersonScore = legalPersonScore;
    }

    /**
     * 获取注册号
     *
     * @return REG_NUMBER - 注册号
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * 设置注册号
     *
     * @param regNumber 注册号
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber == null ? null : regNumber.trim();
    }

    /**
     * 获取公司类型代码
     *
     * @return COMPANY_TYPE - 公司类型代码
     */
    public Short getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类型代码
     *
     * @param companyType 公司类型代码
     */
    public void setCompanyType(Short companyType) {
        this.companyType = companyType;
    }

    /**
     * 获取公司类型
     *
     * @return COMPANY_ORG_TYPE - 公司类型
     */
    public String getCompanyOrgType() {
        return companyOrgType;
    }

    /**
     * 设置公司类型
     *
     * @param companyOrgType 公司类型
     */
    public void setCompanyOrgType(String companyOrgType) {
        this.companyOrgType = companyOrgType == null ? null : companyOrgType.trim();
    }

    /**
     * 获取公司类型分数
     *
     * @return COMPANY_TYPE_SCORE - 公司类型分数
     */
    public Integer getCompanyTypeScore() {
        return companyTypeScore;
    }

    /**
     * 设置公司类型分数
     *
     * @param companyTypeScore 公司类型分数
     */
    public void setCompanyTypeScore(Integer companyTypeScore) {
        this.companyTypeScore = companyTypeScore;
    }

    /**
     * 获取注册地址
     *
     * @return REG_LOCATION - 注册地址
     */
    public String getRegLocation() {
        return regLocation;
    }

    /**
     * 设置注册地址
     *
     * @param regLocation 注册地址
     */
    public void setRegLocation(String regLocation) {
        this.regLocation = regLocation == null ? null : regLocation.trim();
    }

    /**
     * 获取成立日期
     *
     * @return ESTIBLISH_TIME - 成立日期
     */
    public Date getEstiblishTime() {
        return estiblishTime;
    }

    /**
     * 设置成立日期
     *
     * @param estiblishTime 成立日期
     */
    public void setEstiblishTime(Date estiblishTime) {
        this.estiblishTime = estiblishTime;
    }

    /**
     * 获取营业期限开始日期
     *
     * @return FROM_TIME - 营业期限开始日期
     */
    public Date getFromTime() {
        return fromTime;
    }

    /**
     * 设置营业期限开始日期
     *
     * @param fromTime 营业期限开始日期
     */
    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * 获取营业期限终止日期
     *
     * @return TO_TIME - 营业期限终止日期
     */
    public Date getToTime() {
        return toTime;
    }

    /**
     * 设置营业期限终止日期
     *
     * @param toTime 营业期限终止日期
     */
    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    /**
     * 获取经营范围
     *
     * @return BUSINESS_SCOPE - 经营范围
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * 设置经营范围
     *
     * @param businessScope 经营范围
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    /**
     * 获取登记机关
     *
     * @return REG_INSTITUTE - 登记机关
     */
    public String getRegInstitute() {
        return regInstitute;
    }

    /**
     * 设置登记机关
     *
     * @param regInstitute 登记机关
     */
    public void setRegInstitute(String regInstitute) {
        this.regInstitute = regInstitute == null ? null : regInstitute.trim();
    }

    /**
     * 获取核准日期
     *
     * @return APPROVED_TIME - 核准日期
     */
    public Date getApprovedTime() {
        return approvedTime;
    }

    /**
     * 设置核准日期
     *
     * @param approvedTime 核准日期
     */
    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }

    /**
     * 获取企业状态
     *
     * @return REG_STATUS - 企业状态
     */
    public String getRegStatus() {
        return regStatus;
    }

    /**
     * 设置企业状态
     *
     * @param regStatus 企业状态
     */
    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus == null ? null : regStatus.trim();
    }

    /**
     * 获取注册资金
     *
     * @return REG_CAPITAL - 注册资金
     */
    public String getRegCapital() {
        return regCapital;
    }

    /**
     * 设置注册资金
     *
     * @param regCapital 注册资金
     */
    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    /**
     * 获取实收注册资金
     *
     * @return ACTUAL_CAPITAL - 实收注册资金
     */
    public String getActualCapital() {
        return actualCapital;
    }

    /**
     * 设置实收注册资金
     *
     * @param actualCapital 实收注册资金
     */
    public void setActualCapital(String actualCapital) {
        this.actualCapital = actualCapital == null ? null : actualCapital.trim();
    }

    /**
     * 获取组织机构代码
     *
     * @return ORG_NUMBER - 组织机构代码
     */
    public String getOrgNumber() {
        return orgNumber;
    }

    /**
     * 设置组织机构代码
     *
     * @param orgNumber 组织机构代码
     */
    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber == null ? null : orgNumber.trim();
    }

    /**
     * 获取组织机构批准单位
     *
     * @return ORG_APPROVED_INSTITUTE - 组织机构批准单位
     */
    public String getOrgApprovedInstitute() {
        return orgApprovedInstitute;
    }

    /**
     * 设置组织机构批准单位
     *
     * @param orgApprovedInstitute 组织机构批准单位
     */
    public void setOrgApprovedInstitute(String orgApprovedInstitute) {
        this.orgApprovedInstitute = orgApprovedInstitute == null ? null : orgApprovedInstitute.trim();
    }

    /**
     * 获取1表示parse过，0表示没parse，3表示parse出错
     *
     * @return FLAG - 1表示parse过，0表示没parse，3表示parse出错
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * 设置1表示parse过，0表示没parse，3表示parse出错
     *
     * @param flag 1表示parse过，0表示没parse，3表示parse出错
     */
    public void setFlag(Short flag) {
        this.flag = flag;
    }

    /**
     * 获取上级机构ID
     *
     * @return PARENT_ID - 上级机构ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级机构ID
     *
     * @param parentId 上级机构ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_DATE - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取上市代码
     *
     * @return LIST_CODE - 上市代码
     */
    public String getListCode() {
        return listCode;
    }

    /**
     * 设置上市代码
     *
     * @param listCode 上市代码
     */
    public void setListCode(String listCode) {
        this.listCode = listCode == null ? null : listCode.trim();
    }

    /**
     * 获取母公司控股比例
     *
     * @return OWNERSHIP_STAKE - 母公司控股比例
     */
    public String getOwnershipStake() {
        return ownershipStake;
    }

    /**
     * 设置母公司控股比例
     *
     * @param ownershipStake 母公司控股比例
     */
    public void setOwnershipStake(String ownershipStake) {
        this.ownershipStake = ownershipStake == null ? null : ownershipStake.trim();
    }

    /**
     * 获取数据来源标志,0,天眼查，1，自行爬取
     *
     * @return SOURCE_FLAG - 数据来源标志,0,天眼查，1，自行爬取
     */
    public Integer getSourceFlag() {
        return sourceFlag;
    }

    /**
     * 设置数据来源标志,0,天眼查，1，自行爬取
     *
     * @param sourceFlag 数据来源标志,0,天眼查，1，自行爬取
     */
    public void setSourceFlag(Integer sourceFlag) {
        this.sourceFlag = sourceFlag;
    }

    /**
     * 获取根据名称parse出的公司后缀类型
     *
     * @return NAME_SUFFIX - 根据名称parse出的公司后缀类型
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * 设置根据名称parse出的公司后缀类型
     *
     * @param nameSuffix 根据名称parse出的公司后缀类型
     */
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix == null ? null : nameSuffix.trim();
    }

    /**
     * 获取统一社会信用代码（Unified Social Credit Code）
     *
     * @return USC_CODE - 统一社会信用代码（Unified Social Credit Code）
     */
    public String getUscCode() {
        return uscCode;
    }

    /**
     * 设置统一社会信用代码（Unified Social Credit Code）
     *
     * @param uscCode 统一社会信用代码（Unified Social Credit Code）
     */
    public void setUscCode(String uscCode) {
        this.uscCode = uscCode == null ? null : uscCode.trim();
    }

    /**
     * 获取该公司现用公司名所对应公司（former name）
     *
     * @return FORMER_NAME - 该公司现用公司名所对应公司（former name）
     */
    public String getFormerName() {
        return formerName;
    }

    /**
     * 设置该公司现用公司名所对应公司（former name）
     *
     * @param formerName 该公司现用公司名所对应公司（former name）
     */
    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    /**
     * 获取公司英文名称
     *
     * @return COMPANY_ENNAME - 公司英文名称
     */
    public String getCompanyEnname() {
        return companyEnname;
    }

    /**
     * 设置公司英文名称
     *
     * @param companyEnname 公司英文名称
     */
    public void setCompanyEnname(String companyEnname) {
        this.companyEnname = companyEnname == null ? null : companyEnname.trim();
    }

    /**
     * 获取对应新公司companyId
     *
     * @return NEW_COM_ID - 对应新公司companyId
     */
    public Long getNewComId() {
        return newComId;
    }

    /**
     * 设置对应新公司companyId
     *
     * @param newComId 对应新公司companyId
     */
    public void setNewComId(Long newComId) {
        this.newComId = newComId;
    }

    /**
     * @return USE_FLAG
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * @param useFlag
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 获取预留字段01
     *
     * @return DESC01 - 预留字段01
     */
    public String getDesc01() {
        return desc01;
    }

    /**
     * 设置预留字段01
     *
     * @param desc01 预留字段01
     */
    public void setDesc01(String desc01) {
        this.desc01 = desc01 == null ? null : desc01.trim();
    }

    /**
     * 获取预留字段02
     *
     * @return DESC02 - 预留字段02
     */
    public String getDesc02() {
        return desc02;
    }

    /**
     * 设置预留字段02
     *
     * @param desc02 预留字段02
     */
    public void setDesc02(String desc02) {
        this.desc02 = desc02 == null ? null : desc02.trim();
    }

    /**
     * 获取预留字段03
     *
     * @return DESC03 - 预留字段03
     */
    public String getDesc03() {
        return desc03;
    }

    /**
     * 设置预留字段03
     *
     * @param desc03 预留字段03
     */
    public void setDesc03(String desc03) {
        this.desc03 = desc03 == null ? null : desc03.trim();
    }

    /**
     * 获取预留字段04
     *
     * @return DESC04 - 预留字段04
     */
    public String getDesc04() {
        return desc04;
    }

    /**
     * 设置预留字段04
     *
     * @param desc04 预留字段04
     */
    public void setDesc04(String desc04) {
        this.desc04 = desc04 == null ? null : desc04.trim();
    }

    /**
     * 获取预留字段05
     *
     * @return DESC05 - 预留字段05
     */
    public String getDesc05() {
        return desc05;
    }

    /**
     * 设置预留字段05
     *
     * @param desc05 预留字段05
     */
    public void setDesc05(String desc05) {
        this.desc05 = desc05 == null ? null : desc05.trim();
    }

    /**
     * 获取预留字段06
     *
     * @return DESC06 - 预留字段06
     */
    public String getDesc06() {
        return desc06;
    }

    /**
     * 设置预留字段06
     *
     * @param desc06 预留字段06
     */
    public void setDesc06(String desc06) {
        this.desc06 = desc06 == null ? null : desc06.trim();
    }

    /**
     * 获取预留字段07
     *
     * @return DESC07 - 预留字段07
     */
    public String getDesc07() {
        return desc07;
    }

    /**
     * 设置预留字段07
     *
     * @param desc07 预留字段07
     */
    public void setDesc07(String desc07) {
        this.desc07 = desc07 == null ? null : desc07.trim();
    }

    /**
     * 获取预留字段08
     *
     * @return DESC08 - 预留字段08
     */
    public String getDesc08() {
        return desc08;
    }

    /**
     * 设置预留字段08
     *
     * @param desc08 预留字段08
     */
    public void setDesc08(String desc08) {
        this.desc08 = desc08 == null ? null : desc08.trim();
    }

    /**
     * 获取预留字段09
     *
     * @return DESC09 - 预留字段09
     */
    public String getDesc09() {
        return desc09;
    }

    /**
     * 设置预留字段09
     *
     * @param desc09 预留字段09
     */
    public void setDesc09(String desc09) {
        this.desc09 = desc09 == null ? null : desc09.trim();
    }

    /**
     * 获取预留字段10
     *
     * @return DESC10 - 预留字段10
     */
    public String getDesc10() {
        return desc10;
    }

    /**
     * 设置预留字段10
     *
     * @param desc10 预留字段10
     */
    public void setDesc10(String desc10) {
        this.desc10 = desc10 == null ? null : desc10.trim();
    }

    /**
     * 获取解析完成时间
     *
     * @return CRAWLED_TIME - 解析完成时间
     */
    public Date getCrawledTime() {
        return crawledTime;
    }

    /**
     * 设置解析完成时间
     *
     * @param crawledTime 解析完成时间
     */
    public void setCrawledTime(Date crawledTime) {
        this.crawledTime = crawledTime;
    }

    /**
     * 获取数据发布时间
     *
     * @return PUBLISH_TIME - 数据发布时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置数据发布时间
     *
     * @param publishTime 数据发布时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获取原始链接URL
     *
     * @return URL_LINK - 原始链接URL
     */
    public String getUrlLink() {
        return urlLink;
    }

    /**
     * 设置原始链接URL
     *
     * @param urlLink 原始链接URL
     */
    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink == null ? null : urlLink.trim();
    }

    /**
     * 获取数据采集人名
     *
     * @return COLLECTOR_NAME - 数据采集人名
     */
    public String getCollectorName() {
        return collectorName;
    }

    /**
     * 设置数据采集人名
     *
     * @param collectorName 数据采集人名
     */
    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName == null ? null : collectorName.trim();
    }

    /**
     * 获取数据采集时间
     *
     * @return COLLECT_TIME - 数据采集时间
     */
    public Date getCollectTime() {
        return collectTime;
    }

    /**
     * 设置数据采集时间
     *
     * @param collectTime 数据采集时间
     */
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    /**
     * 获取 default ‘0’数据采集处理标志，0，未进行，1执行中，2完成，9 错误
     *
     * @return COLLECT_FLAG -  default ‘0’数据采集处理标志，0，未进行，1执行中，2完成，9 错误
     */
    public Integer getCollectFlag() {
        return collectFlag;
    }

    /**
     * 设置 default ‘0’数据采集处理标志，0，未进行，1执行中，2完成，9 错误
     *
     * @param collectFlag  default ‘0’数据采集处理标志，0，未进行，1执行中，2完成，9 错误
     */
    public void setCollectFlag(Integer collectFlag) {
        this.collectFlag = collectFlag;
    }

    /**
     * 获取数据清洗人名
     *
     * @return CLEANER_NAME - 数据清洗人名
     */
    public String getCleanerName() {
        return cleanerName;
    }

    /**
     * 设置数据清洗人名
     *
     * @param cleanerName 数据清洗人名
     */
    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName == null ? null : cleanerName.trim();
    }

    /**
     * 获取数据清洗时间
     *
     * @return CLEAN_TIME - 数据清洗时间
     */
    public Date getCleanTime() {
        return cleanTime;
    }

    /**
     * 设置数据清洗时间
     *
     * @param cleanTime 数据清洗时间
     */
    public void setCleanTime(Date cleanTime) {
        this.cleanTime = cleanTime;
    }

    /**
     * 获取数据清洗标志0，未进行，1执行中，2完成，9 错误
     *
     * @return CLEAN_FLAG - 数据清洗标志0，未进行，1执行中，2完成，9 错误
     */
    public Integer getCleanFlag() {
        return cleanFlag;
    }

    /**
     * 设置数据清洗标志0，未进行，1执行中，2完成，9 错误
     *
     * @param cleanFlag 数据清洗标志0，未进行，1执行中，2完成，9 错误
     */
    public void setCleanFlag(Integer cleanFlag) {
        this.cleanFlag = cleanFlag;
    }

    /**
     * 获取数据更新原因
     *
     * @return UPDATE_REASON - 数据更新原因
     */
    public String getUpdateReason() {
        return updateReason;
    }

    /**
     * 设置数据更新原因
     *
     * @param updateReason 数据更新原因
     */
    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason == null ? null : updateReason.trim();
    }

    /**
     * 获取时间戳
     *
     * @return TIME_STAMP - 时间戳
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置时间戳
     *
     * @param timeStamp 时间戳
     */
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 获取版本号，初始版本0
     *
     * @return VERSION_ID - 版本号，初始版本0
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本号，初始版本0
     *
     * @param versionId 版本号，初始版本0
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", province=").append(province);
        sb.append(", tycId=").append(tycId);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyAidcode=").append(companyAidcode);
        sb.append(", legalPersonId=").append(legalPersonId);
        sb.append(", legalPersonName=").append(legalPersonName);
        sb.append(", legalPersonType=").append(legalPersonType);
        sb.append(", legalPersonScore=").append(legalPersonScore);
        sb.append(", regNumber=").append(regNumber);
        sb.append(", companyType=").append(companyType);
        sb.append(", companyOrgType=").append(companyOrgType);
        sb.append(", companyTypeScore=").append(companyTypeScore);
        sb.append(", regLocation=").append(regLocation);
        sb.append(", estiblishTime=").append(estiblishTime);
        sb.append(", fromTime=").append(fromTime);
        sb.append(", toTime=").append(toTime);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", regInstitute=").append(regInstitute);
        sb.append(", approvedTime=").append(approvedTime);
        sb.append(", regStatus=").append(regStatus);
        sb.append(", regCapital=").append(regCapital);
        sb.append(", actualCapital=").append(actualCapital);
        sb.append(", orgNumber=").append(orgNumber);
        sb.append(", orgApprovedInstitute=").append(orgApprovedInstitute);
        sb.append(", flag=").append(flag);
        sb.append(", parentId=").append(parentId);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", listCode=").append(listCode);
        sb.append(", ownershipStake=").append(ownershipStake);
        sb.append(", sourceFlag=").append(sourceFlag);
        sb.append(", nameSuffix=").append(nameSuffix);
        sb.append(", uscCode=").append(uscCode);
        sb.append(", formerName=").append(formerName);
        sb.append(", companyEnname=").append(companyEnname);
        sb.append(", newComId=").append(newComId);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", desc01=").append(desc01);
        sb.append(", desc02=").append(desc02);
        sb.append(", desc03=").append(desc03);
        sb.append(", desc04=").append(desc04);
        sb.append(", desc05=").append(desc05);
        sb.append(", desc06=").append(desc06);
        sb.append(", desc07=").append(desc07);
        sb.append(", desc08=").append(desc08);
        sb.append(", desc09=").append(desc09);
        sb.append(", desc10=").append(desc10);
        sb.append(", crawledTime=").append(crawledTime);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", urlLink=").append(urlLink);
        sb.append(", collectorName=").append(collectorName);
        sb.append(", collectTime=").append(collectTime);
        sb.append(", collectFlag=").append(collectFlag);
        sb.append(", cleanerName=").append(cleanerName);
        sb.append(", cleanTime=").append(cleanTime);
        sb.append(", cleanFlag=").append(cleanFlag);
        sb.append(", updateReason=").append(updateReason);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append(", versionId=").append(versionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}