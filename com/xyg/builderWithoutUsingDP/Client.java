package com.xyg.builderWithoutUsingDP;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    
    public static void main(String[] args) {
        
        ExportHeaderModel headerModel = new ExportHeaderModel();
        headerModel.setDepId("1-1");
        headerModel.setExportDate("2018Äê1ÔÂ17ÈÕ12:43:32");
        
        ExportDataModel dataModel1 = new ExportDataModel();
        dataModel1.setProductId("1");
        dataModel1.setAmount(20.0);
        dataModel1.setPrice(10);
        ExportDataModel dataModel2 = new ExportDataModel();
        dataModel2.setProductId("1");
        dataModel2.setAmount(20.0);
        dataModel2.setPrice(10);
        List<ExportDataModel> lists = new ArrayList<ExportDataModel>();
        lists.add(dataModel1);
        lists.add(dataModel2);
        
        ExportFooterModel footerModel = new ExportFooterModel();
        footerModel.setExportUser("james king");
        
        new ExportToTxt(headerModel, lists, footerModel).export();
        
        System.out.println("=====================");
        
        new ExportToXml(headerModel, lists, footerModel).export();
        
    }
}
