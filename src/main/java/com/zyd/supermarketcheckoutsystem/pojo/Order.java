package com.zyd.supermarketcheckoutsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName order
 */
@TableName(value ="t_order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer oid;

    /**
     * 
     */
    private String orderdetail;


    /**
     *
     */
    private Integer vipnum;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 
     */
    public String getOrderdetail(){return orderdetail;}

    public void setOrderdetail(String orderdetail) {
        this.orderdetail = orderdetail;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOrderdetail() == null) ? 0 : getOrderdetail().hashCode());
        result = prime * result + ((getVipnum() == null)  ? 0 : getVipnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(",orderdetail=").append(orderdetail);
        sb.append(",vipnum=").append(vipnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}