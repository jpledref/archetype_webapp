package archetype.webapp;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="viewBean")
public class ViewBean {	
	
	public ViewBean(){}	 
	 
	private int counter=0;
		
	/*Getters*/
	/**
	 * Basic getter
	 * @return counter
	 */
	public int getCounter() {
        return ++counter;
    }	
}
