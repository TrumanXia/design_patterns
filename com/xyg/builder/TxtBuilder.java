package com.xyg.builder;

import java.util.List;

import com.xyg.builderWithoutUsingDP.ExportDataModel;
import com.xyg.builderWithoutUsingDP.ExportFooterModel;
import com.xyg.builderWithoutUsingDP.ExportHeaderModel;

public class TxtBuilder implements Builder
{

    private ExportHeaderModel headerModel;
    private List<ExportDataModel> dataModels;
    private ExportFooterModel footerModel;
    private StringBuffer sb;

    public TxtBuilder(ExportHeaderModel headerModel, List<ExportDataModel> dataModels, ExportFooterModel footerModel) {

        sb = new StringBuffer();
        this.headerModel = headerModel;
        this.dataModels = dataModels;
        this.footerModel = footerModel;
    }

    @Override
    public void buildHeader() {
        sb.append(headerModel.getDepId() + " " + headerModel.getExportDate() + "\n");
    }

    @Override
    public void buildBody() {
        for (ExportDataModel dataModel : dataModels) {
            sb.append(dataModel.getProductId() + " " + dataModel.getAmount() + " " + dataModel.getPrice() + "\n");
        }
    }

    @Override
    public void buildFooter() {
        sb.append(footerModel.getExportUser());
    }
    
    public void getResult() {
        System.out.println(sb);
    }

}
