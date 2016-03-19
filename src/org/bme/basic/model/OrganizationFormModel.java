package org.bme.basic.model;

import org.bme.system.model.YhxxbModel;

public class OrganizationFormModel {

	private DwxxbModel dwxxbModel;
	private YhxxbModel yhxxbModel;
	
	public OrganizationFormModel() {
		super();
	}
	public OrganizationFormModel(DwxxbModel dwxxbModel, YhxxbModel yhxxbModel) {
		super();
		this.dwxxbModel = dwxxbModel;
		this.yhxxbModel = yhxxbModel;
	}
	public DwxxbModel getDwxxbModel() {
		return dwxxbModel;
	}
	public void setDwxxbModel(DwxxbModel dwxxbModel) {
		this.dwxxbModel = dwxxbModel;
	}
	public YhxxbModel getYhxxbModel() {
		return yhxxbModel;
	}
	public void setYhxxbModel(YhxxbModel yhxxbModel) {
		this.yhxxbModel = yhxxbModel;
	}
	
}
