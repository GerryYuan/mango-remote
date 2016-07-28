package org.jfaster.mango.welcome.model;

import com.gerry.common.framework.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Welcome extends BaseModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9126148015471750266L;

	private int id;

	private String name;

}
