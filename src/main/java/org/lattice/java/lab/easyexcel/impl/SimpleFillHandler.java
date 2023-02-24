package org.lattice.java.lab.easyexcel.impl;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import org.apache.poi.util.IOUtils;
import org.lattice.java.lab.easyexcel.AbstractExportAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/7 3:43 PM
 */
@Component
public class SimpleFillHandler extends AbstractExportAdapter<SimpleFillData> {

    @Value(value="classpath:template/parts-template-cn.xlsx")
    private Resource templateFile;


    @Override
    public void handler(ExcelWriter excelWriter, WriteSheet writeSheet, FillConfig fillConfig, SimpleFillData data) {
        excelWriter.fill(data.getParts(), fillConfig, writeSheet);
    }

    @Override
    public InputStream getTemplateFiles() throws IOException {
        return templateFile.getInputStream();
    }


}
