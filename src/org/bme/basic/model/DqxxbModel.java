package org.bme.basic.model;

import org.bme.common.utils.annotation.FieldMeta_QueryHQL;

public class DqxxbModel {
	@FieldMeta_QueryHQL(description = "地区编号", order = 1, alias="dqbh")
	private String id;
	@FieldMeta_QueryHQL(description = "地区名称", order = 2, alias="dqmc")
	private String name;
	@FieldMeta_QueryHQL(description = "地区备注", order = 3, alias="dqbz")
	private String bz;
	@FieldMeta_QueryHQL(description = "所属省份编号", order = 4, alias="shfxxb.sfbh")
	private String supId;
	@FieldMeta_QueryHQL(description = "所属省份名称", order = 4, alias="shfxxb.sfmc")
	private String supName;
	
	public DqxxbModel() {
		super();
	}

	public DqxxbModel(String id, String name, String bz, String supId, String supName) {
		super();
		this.id = id;
		this.name = name;
		this.bz = bz;
		this.supId = supId;
		this.supName = supName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}
	
}