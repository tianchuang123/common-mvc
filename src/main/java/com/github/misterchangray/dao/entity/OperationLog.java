package com.github.misterchangray.dao.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.github.misterchangray.dao.entity.OperationLog")
public class OperationLog {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="signature调用方法的限定名")
    private String signature;

    @ApiModelProperty(value="businessName方法的业务名称")
    private String businessName;

    @ApiModelProperty(value="userId操作人用户表ID")
    private Integer userId;

    @ApiModelProperty(value="userName操作人名称")
    private String userName;

    @ApiModelProperty(value="createDate")
    private Date createDate;

    @ApiModelProperty(value="data")
    private String data;

    public Integer getId() {
        return id;
    }

    public OperationLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSignature() {
        return signature;
    }

    public OperationLog setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
        return this;
    }

    public String getBusinessName() {
        return businessName;
    }

    public OperationLog setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public OperationLog setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public OperationLog setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public OperationLog setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getData() {
        return data;
    }

    public OperationLog setData(String data) {
        this.data = data == null ? null : data.trim();
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", signature=").append(signature);
        sb.append(", businessName=").append(businessName);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", createDate=").append(createDate);
        sb.append(", data=").append(data);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table operation_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        signature("Signature"),
        businessName("business_name"),
        userId("user_id"),
        userName("user_name"),
        createDate("create_date"),
        data("data");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table operation_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}