package com.feng.bean;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
    private Long id;

    private String province;

    private Long tycId;

    private String companyName;

    private String companyAidcode;

    private Long legalPersonId;

    private String legalPersonName;

    private Integer legalPersonType;

    private Integer legalPersonScore;

    private String regNumber;

    private Short companyType;

    private String companyOrgType;

    private Integer companyTypeScore;

    private String regLocation;

    private Date estiblishTime;

    private Date fromTime;

    private Date toTime;

    private String businessScope;

    private String regInstitute;

    private Date approvedTime;

    private String regStatus;

    private String regCapital;

    private String actualCapital;

    private String orgNumber;

    private String orgApprovedInstitute;

    private Short flag;

    private Long parentId;

    private Date updateDate;

    private String listCode;

    private String ownershipStake;

    private Integer sourceFlag;

    private String nameSuffix;

    private String uscCode;

    private String formerName;

    private String companyEnname;

    private Long newComId;

    private Integer useFlag;

    private String desc01;

    private String desc02;

    private String desc03;

    private String desc04;

    private String desc05;

    private String desc06;

    private String desc07;

    private String desc08;

    private String desc09;

    private String desc10;

    private Date crawledTime;

    private Date publishTime;

    private String urlLink;

    private String collectorName;

    private Date collectTime;

    private Integer collectFlag;

    private String cleanerName;

    private Date cleanTime;

    private Integer cleanFlag;

    private String updateReason;

    private Date timeStamp;

    private Integer versionId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Long getTycId() {
        return tycId;
    }

    public void setTycId(Long tycId) {
        this.tycId = tycId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAidcode() {
        return companyAidcode;
    }

    public void setCompanyAidcode(String companyAidcode) {
        this.companyAidcode = companyAidcode == null ? null : companyAidcode.trim();
    }

    public Long getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(Long legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public Integer getLegalPersonType() {
        return legalPersonType;
    }

    public void setLegalPersonType(Integer legalPersonType) {
        this.legalPersonType = legalPersonType;
    }

    public Integer getLegalPersonScore() {
        return legalPersonScore;
    }

    public void setLegalPersonScore(Integer legalPersonScore) {
        this.legalPersonScore = legalPersonScore;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber == null ? null : regNumber.trim();
    }

    public Short getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Short companyType) {
        this.companyType = companyType;
    }

    public String getCompanyOrgType() {
        return companyOrgType;
    }

    public void setCompanyOrgType(String companyOrgType) {
        this.companyOrgType = companyOrgType == null ? null : companyOrgType.trim();
    }

    public Integer getCompanyTypeScore() {
        return companyTypeScore;
    }

    public void setCompanyTypeScore(Integer companyTypeScore) {
        this.companyTypeScore = companyTypeScore;
    }

    public String getRegLocation() {
        return regLocation;
    }

    public void setRegLocation(String regLocation) {
        this.regLocation = regLocation == null ? null : regLocation.trim();
    }

    public Date getEstiblishTime() {
        return estiblishTime;
    }

    public void setEstiblishTime(Date estiblishTime) {
        this.estiblishTime = estiblishTime;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getRegInstitute() {
        return regInstitute;
    }

    public void setRegInstitute(String regInstitute) {
        this.regInstitute = regInstitute == null ? null : regInstitute.trim();
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus == null ? null : regStatus.trim();
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    public String getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(String actualCapital) {
        this.actualCapital = actualCapital == null ? null : actualCapital.trim();
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber == null ? null : orgNumber.trim();
    }

    public String getOrgApprovedInstitute() {
        return orgApprovedInstitute;
    }

    public void setOrgApprovedInstitute(String orgApprovedInstitute) {
        this.orgApprovedInstitute = orgApprovedInstitute == null ? null : orgApprovedInstitute.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getListCode() {
        return listCode;
    }

    public void setListCode(String listCode) {
        this.listCode = listCode == null ? null : listCode.trim();
    }

    public String getOwnershipStake() {
        return ownershipStake;
    }

    public void setOwnershipStake(String ownershipStake) {
        this.ownershipStake = ownershipStake == null ? null : ownershipStake.trim();
    }

    public Integer getSourceFlag() {
        return sourceFlag;
    }

    public void setSourceFlag(Integer sourceFlag) {
        this.sourceFlag = sourceFlag;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix == null ? null : nameSuffix.trim();
    }

    public String getUscCode() {
        return uscCode;
    }

    public void setUscCode(String uscCode) {
        this.uscCode = uscCode == null ? null : uscCode.trim();
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    public String getCompanyEnname() {
        return companyEnname;
    }

    public void setCompanyEnname(String companyEnname) {
        this.companyEnname = companyEnname == null ? null : companyEnname.trim();
    }

    public Long getNewComId() {
        return newComId;
    }

    public void setNewComId(Long newComId) {
        this.newComId = newComId;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public String getDesc01() {
        return desc01;
    }

    public void setDesc01(String desc01) {
        this.desc01 = desc01 == null ? null : desc01.trim();
    }

    public String getDesc02() {
        return desc02;
    }

    public void setDesc02(String desc02) {
        this.desc02 = desc02 == null ? null : desc02.trim();
    }

    public String getDesc03() {
        return desc03;
    }

    public void setDesc03(String desc03) {
        this.desc03 = desc03 == null ? null : desc03.trim();
    }

    public String getDesc04() {
        return desc04;
    }

    public void setDesc04(String desc04) {
        this.desc04 = desc04 == null ? null : desc04.trim();
    }

    public String getDesc05() {
        return desc05;
    }

    public void setDesc05(String desc05) {
        this.desc05 = desc05 == null ? null : desc05.trim();
    }

    public String getDesc06() {
        return desc06;
    }

    public void setDesc06(String desc06) {
        this.desc06 = desc06 == null ? null : desc06.trim();
    }

    public String getDesc07() {
        return desc07;
    }

    public void setDesc07(String desc07) {
        this.desc07 = desc07 == null ? null : desc07.trim();
    }

    public String getDesc08() {
        return desc08;
    }

    public void setDesc08(String desc08) {
        this.desc08 = desc08 == null ? null : desc08.trim();
    }

    public String getDesc09() {
        return desc09;
    }

    public void setDesc09(String desc09) {
        this.desc09 = desc09 == null ? null : desc09.trim();
    }

    public String getDesc10() {
        return desc10;
    }

    public void setDesc10(String desc10) {
        this.desc10 = desc10 == null ? null : desc10.trim();
    }

    public Date getCrawledTime() {
        return crawledTime;
    }

    public void setCrawledTime(Date crawledTime) {
        this.crawledTime = crawledTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink == null ? null : urlLink.trim();
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName == null ? null : collectorName.trim();
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getCollectFlag() {
        return collectFlag;
    }

    public void setCollectFlag(Integer collectFlag) {
        this.collectFlag = collectFlag;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName == null ? null : cleanerName.trim();
    }

    public Date getCleanTime() {
        return cleanTime;
    }

    public void setCleanTime(Date cleanTime) {
        this.cleanTime = cleanTime;
    }

    public Integer getCleanFlag() {
        return cleanFlag;
    }

    public void setCleanFlag(Integer cleanFlag) {
        this.cleanFlag = cleanFlag;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason == null ? null : updateReason.trim();
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getVersionId() {
        return versionId;
    }

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