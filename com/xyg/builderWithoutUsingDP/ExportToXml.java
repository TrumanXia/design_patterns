package com.xyg.builderWithoutUsingDP;

import java.util.List;

public class ExportToXml
{

    private ExportHeaderModel headerModel;
    private List<ExportDataModel> dataModels;
    private ExportFooterModel footerModel;

    public ExportToXml(ExportHeaderModel headerModel, List<ExportDataModel> dataModels, ExportFooterModel footerModel) {

        this.headerModel = headerModel;
        this.dataModels = dataModels;
        this.footerModel = footerModel;
    }

    public void export() {

        StringBuffer sb = new StringBuffer();
        sb.append("<? xml version=1.0 encoding='utf-8' ?>\n");
        sb.append("<Report>\n");
        sb.append("     <Header>\n");
        sb.append("         <DepId>" + headerModel.getDepId() + "</DepId>\n");
        sb.append("         <ExportDate>" + headerModel.getExportDate() + "</ExportDate>\n");
        sb.append("     </Header>\n");

        for (ExportDataModel dataModel : dataModels) {
            sb.append("  </ProductInfo>\n");
            sb.append("      <ProductId>" + dataModel.getProductId() + "</ProductId>\n");
            sb.append("      <Amount>" + dataModel.getAmount() + "</Amount>\n");
            sb.append("      <Price>" + dataModel.getPrice() + "</Price>\n");
            sb.append("  </ProductInfo>\n");
        }

        sb.append("     <Footer>\n");
        sb.append("         <ExportUser>" + footerModel.getExportUser() + "</ExportUser>\n");
        sb.append("     </Footer>\n");
        sb.append("</Report>\n");
        System.out.println(sb);
    }
}
