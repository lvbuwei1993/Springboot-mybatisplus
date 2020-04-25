package com.entity;

import java.io.Serializable;
import java.util.Date;

public class WebUser implements Serializable {
    private Long fId;

	/** 
     * 会员账号,不能为空，长度6-25，不能为汉字，邮箱或手机号码注册
     */
    private String fUserAccount;

	/** 
     * 会员登录密码,长度6-19，字母，数字，符号
     */
    private String fUserPassword;

	/** 
     * 会员支付密码,长度6-19，字母，数字，符号
     */
    private String fUserPayPassword;

	/** 
     * 会员类型（0代表个人，1代表企业）
     */
    private String fUserClass;

	/** 
     * 真实姓名,长度1-25
     */
    private String fUserRelname;

	/** 
     * 会员昵称,不能为空，长度1-25
     */
    private String fUserNick;

	/** 
     * 会员头像
     */
    private String fUserHead;

	/** 
     * 会员性别，可选参数0、1、2（0表示女，1表示男,2表示保密）,默认为0
     */
    private Integer fUserSex;

	/** 
     * 会员年龄,默认为18
     */
    private Integer fUserAge;

	/** 
     * 会员出生日期
     */
    private Date fUserBirthday;

	/** 
     * 会员邮箱,验证
     */
    private String fUserEmail;

	/** 
     * 邮箱是否认证0表示未认证，1表示已认证
     */
    private Integer fUserEmailStatus;

	/** 
     * 会员手机,验证
     */
    private String fUserPhone;

	/** 
     * 手机号是否认证，0表示未认证，1表示已认证
     */
    private Integer fUserPhoneStatus;

	/** 
     * 证件类型(1身份证，2护照，3台胞证）
     */
    private Integer fUserIdcardType;

	/** 
     * 会员证件号,15或18位
     */
    private String fUserIdcard;

	/** 
     * 证件号是否认证，0表示未认证，1表示已认证 2待审核,3认证未通过
     */
    private Integer fUserIdcardStatus;

	/** 
     * 婚姻状况，可选值0、1、2（0表示未婚，1表示已婚，2表示保密）
     */
    private Integer fUserMarriage;

	/** 
     * 文化程度，1-10（1不限 2小学毕业 3初中及以上 4高中及以上 5中专及以上 6大专及以上 7本科及以上 8大学及以上 9硕士及以上 10博士及以上）
     */
    private Integer fUserEducation;

	/** 
     * 所属行业（职业）
     */
    private Integer fUserIndustries;

	/** 
     * 会员消费级别ID
     */
    private Long fLevelId;

	/** 
     * 微信、QQ、微博(0表示微信，1表示QQ，3表示微博)
     */
    private Integer fUserOpenSourcetype;

	/** 
     * 第三方openID
     */
    private String fUserOpenid;

	/** 
     * 所在市ID
     */
    private Integer fUserCityId;

	/** 
     * 所在区id
     */
    private Integer fUserDistrictId;

	/** 
     * 所在省id
     */
    private Integer fUserProviceId;

	/** 
     * 街道id
     */
    private Integer fUserStreetId;

	/** 
     * 所在区
     */
    private String fUserDistrict;

	/** 
     * 所在市
     */
    private String fUserCity;

	/** 
     * 所在省
     */
    private String fUserProvice;

	/** 
     * 街道名称
     */
    private String fUserStreet;

	/** 
     * 用户所在地址
     */
    private String fUserAddress;

	/** 
     * 用户所在地邮编
     */
    private String fUserPostcode;

	/** 
     * 角色类型,1普通会员，2建站会员
     */
    private Integer fUserType;

	/** 
     * 会员状态，正常、冻结（0表示正常，1表示冻结）
     */
    private Integer fUserStatus;

	/** 
     * 状态描述信息
     */
    private String fUserStatusRemark;

	/** 
     * 创建时间
     */
    private Date fCreateTime;

	/** 
     * 创建人ID
     */
    private Long fCreateUserid;

	/** 
     * 修改用户ID
     */
    private Long fUpdateUserid;

	/** 
     * 修改时间
     */
    private Date fUpdateTime;

	/** 
     * 最后登陆日期
     */
    private Date fLastLogin;

	/** 
     * 是否接受第三方服务
     */
    private Integer fIsRevice;

	/** 
     * 账户来源
     */
    private String fResource;

	/** 
     * 证件正面照
     */
    private String fUserIdcardFrontimage;

	/** 
     * 证件反面照
     */
    private String fUserIdcardBackimage;

	/** 
     * 5.正常用户,1.冻结,2.黄色限制,3.红色限制,4.橙色限制,0.恢复正常
     */
    private Integer fHandlerStatus;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfUserAccount() {
        return fUserAccount;
    }

    public void setfUserAccount(String fUserAccount) {
        this.fUserAccount = fUserAccount == null ? null : fUserAccount.trim();
    }

    public String getfUserPassword() {
        return fUserPassword;
    }

    public void setfUserPassword(String fUserPassword) {
        this.fUserPassword = fUserPassword == null ? null : fUserPassword.trim();
    }

    public String getfUserPayPassword() {
        return fUserPayPassword;
    }

    public void setfUserPayPassword(String fUserPayPassword) {
        this.fUserPayPassword = fUserPayPassword == null ? null : fUserPayPassword.trim();
    }

    public String getfUserClass() {
        return fUserClass;
    }

    public void setfUserClass(String fUserClass) {
        this.fUserClass = fUserClass == null ? null : fUserClass.trim();
    }

    public String getfUserRelname() {
        return fUserRelname;
    }

    public void setfUserRelname(String fUserRelname) {
        this.fUserRelname = fUserRelname == null ? null : fUserRelname.trim();
    }

    public String getfUserNick() {
        return fUserNick;
    }

    public void setfUserNick(String fUserNick) {
        this.fUserNick = fUserNick == null ? null : fUserNick.trim();
    }

    public String getfUserHead() {
        return fUserHead;
    }

    public void setfUserHead(String fUserHead) {
        this.fUserHead = fUserHead == null ? null : fUserHead.trim();
    }

    public Integer getfUserSex() {
        return fUserSex;
    }

    public void setfUserSex(Integer fUserSex) {
        this.fUserSex = fUserSex;
    }

    public Integer getfUserAge() {
        return fUserAge;
    }

    public void setfUserAge(Integer fUserAge) {
        this.fUserAge = fUserAge;
    }

    public Date getfUserBirthday() {
        return fUserBirthday;
    }

    public void setfUserBirthday(Date fUserBirthday) {
        this.fUserBirthday = fUserBirthday;
    }

    public String getfUserEmail() {
        return fUserEmail;
    }

    public void setfUserEmail(String fUserEmail) {
        this.fUserEmail = fUserEmail == null ? null : fUserEmail.trim();
    }

    public Integer getfUserEmailStatus() {
        return fUserEmailStatus;
    }

    public void setfUserEmailStatus(Integer fUserEmailStatus) {
        this.fUserEmailStatus = fUserEmailStatus;
    }

    public String getfUserPhone() {
        return fUserPhone;
    }

    public void setfUserPhone(String fUserPhone) {
        this.fUserPhone = fUserPhone == null ? null : fUserPhone.trim();
    }

    public Integer getfUserPhoneStatus() {
        return fUserPhoneStatus;
    }

    public void setfUserPhoneStatus(Integer fUserPhoneStatus) {
        this.fUserPhoneStatus = fUserPhoneStatus;
    }

    public Integer getfUserIdcardType() {
        return fUserIdcardType;
    }

    public void setfUserIdcardType(Integer fUserIdcardType) {
        this.fUserIdcardType = fUserIdcardType;
    }

    public String getfUserIdcard() {
        return fUserIdcard;
    }

    public void setfUserIdcard(String fUserIdcard) {
        this.fUserIdcard = fUserIdcard == null ? null : fUserIdcard.trim();
    }

    public Integer getfUserIdcardStatus() {
        return fUserIdcardStatus;
    }

    public void setfUserIdcardStatus(Integer fUserIdcardStatus) {
        this.fUserIdcardStatus = fUserIdcardStatus;
    }

    public Integer getfUserMarriage() {
        return fUserMarriage;
    }

    public void setfUserMarriage(Integer fUserMarriage) {
        this.fUserMarriage = fUserMarriage;
    }

    public Integer getfUserEducation() {
        return fUserEducation;
    }

    public void setfUserEducation(Integer fUserEducation) {
        this.fUserEducation = fUserEducation;
    }

    public Integer getfUserIndustries() {
        return fUserIndustries;
    }

    public void setfUserIndustries(Integer fUserIndustries) {
        this.fUserIndustries = fUserIndustries;
    }

    public Long getfLevelId() {
        return fLevelId;
    }

    public void setfLevelId(Long fLevelId) {
        this.fLevelId = fLevelId;
    }

    public Integer getfUserOpenSourcetype() {
        return fUserOpenSourcetype;
    }

    public void setfUserOpenSourcetype(Integer fUserOpenSourcetype) {
        this.fUserOpenSourcetype = fUserOpenSourcetype;
    }

    public String getfUserOpenid() {
        return fUserOpenid;
    }

    public void setfUserOpenid(String fUserOpenid) {
        this.fUserOpenid = fUserOpenid == null ? null : fUserOpenid.trim();
    }

    public Integer getfUserCityId() {
        return fUserCityId;
    }

    public void setfUserCityId(Integer fUserCityId) {
        this.fUserCityId = fUserCityId;
    }

    public Integer getfUserDistrictId() {
        return fUserDistrictId;
    }

    public void setfUserDistrictId(Integer fUserDistrictId) {
        this.fUserDistrictId = fUserDistrictId;
    }

    public Integer getfUserProviceId() {
        return fUserProviceId;
    }

    public void setfUserProviceId(Integer fUserProviceId) {
        this.fUserProviceId = fUserProviceId;
    }

    public Integer getfUserStreetId() {
        return fUserStreetId;
    }

    public void setfUserStreetId(Integer fUserStreetId) {
        this.fUserStreetId = fUserStreetId;
    }

    public String getfUserDistrict() {
        return fUserDistrict;
    }

    public void setfUserDistrict(String fUserDistrict) {
        this.fUserDistrict = fUserDistrict == null ? null : fUserDistrict.trim();
    }

    public String getfUserCity() {
        return fUserCity;
    }

    public void setfUserCity(String fUserCity) {
        this.fUserCity = fUserCity == null ? null : fUserCity.trim();
    }

    public String getfUserProvice() {
        return fUserProvice;
    }

    public void setfUserProvice(String fUserProvice) {
        this.fUserProvice = fUserProvice == null ? null : fUserProvice.trim();
    }

    public String getfUserStreet() {
        return fUserStreet;
    }

    public void setfUserStreet(String fUserStreet) {
        this.fUserStreet = fUserStreet == null ? null : fUserStreet.trim();
    }

    public String getfUserAddress() {
        return fUserAddress;
    }

    public void setfUserAddress(String fUserAddress) {
        this.fUserAddress = fUserAddress == null ? null : fUserAddress.trim();
    }

    public String getfUserPostcode() {
        return fUserPostcode;
    }

    public void setfUserPostcode(String fUserPostcode) {
        this.fUserPostcode = fUserPostcode == null ? null : fUserPostcode.trim();
    }

    public Integer getfUserType() {
        return fUserType;
    }

    public void setfUserType(Integer fUserType) {
        this.fUserType = fUserType;
    }

    public Integer getfUserStatus() {
        return fUserStatus;
    }

    public void setfUserStatus(Integer fUserStatus) {
        this.fUserStatus = fUserStatus;
    }

    public String getfUserStatusRemark() {
        return fUserStatusRemark;
    }

    public void setfUserStatusRemark(String fUserStatusRemark) {
        this.fUserStatusRemark = fUserStatusRemark == null ? null : fUserStatusRemark.trim();
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public Long getfCreateUserid() {
        return fCreateUserid;
    }

    public void setfCreateUserid(Long fCreateUserid) {
        this.fCreateUserid = fCreateUserid;
    }

    public Long getfUpdateUserid() {
        return fUpdateUserid;
    }

    public void setfUpdateUserid(Long fUpdateUserid) {
        this.fUpdateUserid = fUpdateUserid;
    }

    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    public Date getfLastLogin() {
        return fLastLogin;
    }

    public void setfLastLogin(Date fLastLogin) {
        this.fLastLogin = fLastLogin;
    }

    public Integer getfIsRevice() {
        return fIsRevice;
    }

    public void setfIsRevice(Integer fIsRevice) {
        this.fIsRevice = fIsRevice;
    }

    public String getfResource() {
        return fResource;
    }

    public void setfResource(String fResource) {
        this.fResource = fResource == null ? null : fResource.trim();
    }

    public String getfUserIdcardFrontimage() {
        return fUserIdcardFrontimage;
    }

    public void setfUserIdcardFrontimage(String fUserIdcardFrontimage) {
        this.fUserIdcardFrontimage = fUserIdcardFrontimage == null ? null : fUserIdcardFrontimage.trim();
    }

    public String getfUserIdcardBackimage() {
        return fUserIdcardBackimage;
    }

    public void setfUserIdcardBackimage(String fUserIdcardBackimage) {
        this.fUserIdcardBackimage = fUserIdcardBackimage == null ? null : fUserIdcardBackimage.trim();
    }

    public Integer getfHandlerStatus() {
        return fHandlerStatus;
    }

    public void setfHandlerStatus(Integer fHandlerStatus) {
        this.fHandlerStatus = fHandlerStatus;
    }
}