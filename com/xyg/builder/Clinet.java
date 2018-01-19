package com.xyg.builder;

import java.util.ArrayList;
import java.util.List;

import com.xyg.builderWithoutUsingDP.ExportDataModel;
import com.xyg.builderWithoutUsingDP.ExportFooterModel;
import com.xyg.builderWithoutUsingDP.ExportHeaderModel;

public class Clinet
{

    public static void main(String[] args) {
        
//     数据
        ExportHeaderModel headerModel = new ExportHeaderModel();
        headerModel.setDepId("1-1");
        headerModel.setExportDate("2018年1月17日12:43:32");
        
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
        
        Builder builder = new TxtBuilder(headerModel, lists, footerModel);
        Director director = new Director(builder);
        director.constrct();
    }
}
