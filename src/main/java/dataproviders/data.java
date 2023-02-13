package dataproviders;

import org.testng.annotations.DataProvider;

import generic.actionUtil;
import generic.baseclass;

public class data {

	@DataProvider
	public  Object[][]  createdata() {
		Object [][] d=new Object[1][5];
		d[0][0]=actionUtil.getData(baseclass.excelPath, "adddetails", 1, 0);
		d[0][1]=actionUtil.getData(baseclass.excelPath, "adddetails", 1, 1);
		d[0][2]=actionUtil.getData(baseclass.excelPath, "adddetails", 1, 2);
		d[0][3]=actionUtil.getData(baseclass.excelPath, "adddetails", 1, 3);
		d[0][4]=actionUtil.getData(baseclass.excelPath, "adddetails", 1, 4);
		return d;
	}
}
