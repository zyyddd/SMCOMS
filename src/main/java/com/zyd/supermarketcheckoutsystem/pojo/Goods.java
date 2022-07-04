package com.zyd.supermarketcheckoutsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName goods
 */
@TableName(value ="goods")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Goods implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer gid;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 
     */
    private Integer resnum;

    /**
     * 
     */
    private String goodname;

    @TableField(exist = false)
    private Integer number;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;



    /**
     * 
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * 
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 
     */
    public Integer getResnum() {
        return resnum;
    }

    /**
     * 
     */
    public void setResnum(Integer resnum) {
        this.resnum = resnum;
    }

    /**
     * 
     */
    public String getGoodname() {
        return goodname;
    }

    /**
     * 
     */
    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getResnum() == null ? other.getResnum() == null : this.getResnum().equals(other.getResnum()))
            && (this.getGoodname() == null ? other.getGoodname() == null : this.getGoodname().equals(other.getGoodname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getResnum() == null) ? 0 : getResnum().hashCode());
        result = prime * result + ((getGoodname() == null) ? 0 : getGoodname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(" [");
        sb.append(goodname);
        sb.append(":").append(number).append("个");

        sb.append("]");
        return sb.toString();
    }

    /**
     * 自定义构造函数-用来订单详情中信息
     * @param gid
     * @param price
     * @param goodname
     */
    public Goods(Integer gid,BigDecimal price,Integer number,String goodname){
        this.gid = gid;
        this.price =price;
        this.number = number;
        this.goodname =goodname;
    }

    /**
     * 构造方法用来修改商品中数据
     * @param gid
     * @param price
     * @param resnum
     * @param number
     * @param goodname
     */
    public Goods(Integer gid,BigDecimal price,Integer resnum,Integer number,String goodname){
        this.gid = gid;
        this.price = price;
        this.resnum = resnum;
        this.goodname = goodname;
    }

}