package com.xyg.builderWithoutUsingDP;

import java.util.List;

public class ExportToTxt
{

    private ExportHeaderModel headerModel;
    private List<ExportDataModel> dataModels;
    private ExportFooterModel footerModel;
    
    public ExportToTxt(ExportHeaderModel headerModel,
            List<ExportDataModel> dataModels, ExportFooterModel footerModel ){
        
        this.headerModel = headerModel;
        this.dataModels = dataModels;
        this.footerModel = footerModel;
    }
    
    // TODO 暂时打印到控制台，输出到文件中
    public void export(){
        
        StringBuffer sb = new StringBuffer();
        sb.append(headerModel.getDepId() +" "+ headerModel.getExportDate() + "\n");
        
        for (ExportDataModel dataModel : dataModels){
            
            sb.append(dataModel.getProductId() + " "+ 
            dataModel.getAmount() +" " +dataModel.getPrice() + "\n" );
        }
        
        sb.append(footerModel.getExportUser());
        
        System.out.println(sb);
    }
}
