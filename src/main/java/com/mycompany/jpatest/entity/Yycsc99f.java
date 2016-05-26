/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpatest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ale
 */
@Entity
@Table(name = "YYCSC99F")
@NamedQueries({
    @NamedQuery(name = "Yycsc99f.findAll", query = "SELECT y FROM Yycsc99f y"),
    @NamedQuery(name = "Yycsc99f.findByNrsey9", query = "SELECT y FROM Yycsc99f y WHERE y.nrsey9 = :nrsey9"),
    @NamedQuery(name = "Yycsc99f.findByCdcfy9", query = "SELECT y FROM Yycsc99f y WHERE y.cdcfy9 = :cdcfy9"),
    @NamedQuery(name = "Yycsc99f.findByDscfy9", query = "SELECT y FROM Yycsc99f y WHERE y.dscfy9 = :dscfy9"),
    @NamedQuery(name = "Yycsc99f.findByNrdfy9", query = "SELECT y FROM Yycsc99f y WHERE y.nrdfy9 = :nrdfy9"),
    @NamedQuery(name = "Yycsc99f.findByTdocy9", query = "SELECT y FROM Yycsc99f y WHERE y.tdocy9 = :tdocy9"),
    @NamedQuery(name = "Yycsc99f.findByNrboy9", query = "SELECT y FROM Yycsc99f y WHERE y.nrboy9 = :nrboy9"),
    @NamedQuery(name = "Yycsc99f.findByDtboy9", query = "SELECT y FROM Yycsc99f y WHERE y.dtboy9 = :dtboy9"),
    @NamedQuery(name = "Yycsc99f.findByDtary9", query = "SELECT y FROM Yycsc99f y WHERE y.dtary9 = :dtary9"),
    @NamedQuery(name = "Yycsc99f.findByDtopy9", query = "SELECT y FROM Yycsc99f y WHERE y.dtopy9 = :dtopy9"),
    @NamedQuery(name = "Yycsc99f.findByOrdiy9", query = "SELECT y FROM Yycsc99f y WHERE y.ordiy9 = :ordiy9"),
    @NamedQuery(name = "Yycsc99f.findByCdlty9", query = "SELECT y FROM Yycsc99f y WHERE y.cdlty9 = :cdlty9"),
    @NamedQuery(name = "Yycsc99f.findByUlrey9", query = "SELECT y FROM Yycsc99f y WHERE y.ulrey9 = :ulrey9"),
    @NamedQuery(name = "Yycsc99f.findByCdary9", query = "SELECT y FROM Yycsc99f y WHERE y.cdary9 = :cdary9"),
    @NamedQuery(name = "Yycsc99f.findByDsary9", query = "SELECT y FROM Yycsc99f y WHERE y.dsary9 = :dsary9"),
    @NamedQuery(name = "Yycsc99f.findByQtay9", query = "SELECT y FROM Yycsc99f y WHERE y.qtay9 = :qtay9")})
public class Yycsc99f implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NRSEY9")
    private Integer nrsey9;
    @Size(max = 10)
    @Column(name = "CDCFY9")
    private String cdcfy9;
    @Size(max = 40)
    @Column(name = "DSCFY9")
    private String dscfy9;
    @Column(name = "NRDFY9")
    private Integer nrdfy9;
    @Size(max = 1)
    @Column(name = "TDOCY9")
    private String tdocy9;
    @Size(max = 7)
    @Column(name = "NRBOY9")
    private String nrboy9;
    @Column(name = "DTBOY9")
    private Integer dtboy9;
    @Column(name = "DTARY9")
    private Integer dtary9;
    @Column(name = "DTOPY9")
    private Integer dtopy9;
    @Size(max = 60)
    @Column(name = "ORDIY9")
    private String ordiy9;
    @Size(max = 15)
    @Column(name = "CDLTY9")
    private String cdlty9;
    @Size(max = 30)
    @Column(name = "ULREY9")
    private String ulrey9;
    @Size(max = 13)
    @Column(name = "CDARY9")
    private String cdary9;
    @Size(max = 40)
    @Column(name = "DSARY9")
    private String dsary9;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTAY9")
    private BigDecimal qtay9;

    public Yycsc99f() {
    }

    public Yycsc99f(Integer nrsey9) {
        this.nrsey9 = nrsey9;
    }

    public Integer getNrsey9() {
        return nrsey9;
    }

    public void setNrsey9(Integer nrsey9) {
        this.nrsey9 = nrsey9;
    }

    public String getCdcfy9() {
        return cdcfy9;
    }

    public void setCdcfy9(String cdcfy9) {
        this.cdcfy9 = cdcfy9;
    }

    public String getDscfy9() {
        return dscfy9;
    }

    public void setDscfy9(String dscfy9) {
        this.dscfy9 = dscfy9;
    }

    public Integer getNrdfy9() {
        return nrdfy9;
    }

    public void setNrdfy9(Integer nrdfy9) {
        this.nrdfy9 = nrdfy9;
    }

    public String getTdocy9() {
        return tdocy9;
    }

    public void setTdocy9(String tdocy9) {
        this.tdocy9 = tdocy9;
    }

    public String getNrboy9() {
        return nrboy9;
    }

    public void setNrboy9(String nrboy9) {
        this.nrboy9 = nrboy9;
    }

    public Integer getDtboy9() {
        return dtboy9;
    }

    public void setDtboy9(Integer dtboy9) {
        this.dtboy9 = dtboy9;
    }

    public Integer getDtary9() {
        return dtary9;
    }

    public void setDtary9(Integer dtary9) {
        this.dtary9 = dtary9;
    }

    public Integer getDtopy9() {
        return dtopy9;
    }

    public void setDtopy9(Integer dtopy9) {
        this.dtopy9 = dtopy9;
    }

    public String getOrdiy9() {
        return ordiy9;
    }

    public void setOrdiy9(String ordiy9) {
        this.ordiy9 = ordiy9;
    }

    public String getCdlty9() {
        return cdlty9;
    }

    public void setCdlty9(String cdlty9) {
        this.cdlty9 = cdlty9;
    }

    public String getUlrey9() {
        return ulrey9;
    }

    public void setUlrey9(String ulrey9) {
        this.ulrey9 = ulrey9;
    }

    public String getCdary9() {
        return cdary9;
    }

    public void setCdary9(String cdary9) {
        this.cdary9 = cdary9;
    }

    public String getDsary9() {
        return dsary9;
    }

    public void setDsary9(String dsary9) {
        this.dsary9 = dsary9;
    }

    public BigDecimal getQtay9() {
        return qtay9;
    }

    public void setQtay9(BigDecimal qtay9) {
        this.qtay9 = qtay9;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrsey9 != null ? nrsey9.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yycsc99f)) {
            return false;
        }
        Yycsc99f other = (Yycsc99f) object;
        if ((this.nrsey9 == null && other.nrsey9 != null) || (this.nrsey9 != null && !this.nrsey9.equals(other.nrsey9))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jpatest.entity.Yycsc99f[ nrsey9=" + nrsey9 + " ]";
    }
    
}
