package com.mb;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedObject
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}