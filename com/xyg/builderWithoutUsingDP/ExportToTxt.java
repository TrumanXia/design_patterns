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
    
    // TODO ��ʱ��ӡ������̨��������ļ���
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
