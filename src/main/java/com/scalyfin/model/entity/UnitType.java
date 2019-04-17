package com.scalyfin.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Abdulaziz
 */
@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Unit_Type")
@Where(clause = "Is_Deleted <> 1")

public class UnitType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -741016161956649422L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Unit_Type_Code",unique = true)
	private Integer unitTypeCode;
	
	@Column(name = "Unit_Type_Description")
	private String unitTypeDescription;
	
	@Basic(optional = false)
	@Column(name = "Unit_Type_End_Date")
	@Temporal(TemporalType.DATE)
	private Date unitTypeEndDate;
	
	@Column(name = "Is_Deleted")
    private Integer isDeleted = 0;

}
