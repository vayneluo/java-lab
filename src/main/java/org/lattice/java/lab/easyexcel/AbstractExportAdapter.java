package org.lattice.java.lab.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @description: EasyExcel适配器
 * @author: lattice
 * @date: 2023/2/7 3:42 PM
 */
public abstract class AbstractExportAdapter<T> {

    public void fillExcelBytes(T data, String fileName, HttpServletResponse response) throws IOException {
        generate(data, fileName,"excel", response);
    }

    private void generate(T data, String fileName, String type, HttpServletResponse response) throws IOException {
        InputStream in = this.getTemplateFiles();
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
        try (ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).withTemplate(in).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();
            // 这里注意 入参用了forceNewRow 代表在写入list的时候不管list下面有没有空行 都会创建一行，然后下面的数据往后移动。默认 是false，会直接使用下一行，如果没有则创建。
            // forceNewRow 如果设置了true,有个缺点 就是他会把所有的数据都放到内存了，所以慎用
            // 简单的说 如果你的模板有list,且list不是最后一行，下面还有数据需要填充 就必须设置 forceNewRow=true 但是这个就会把所有数据放到内存 会很耗内存
            // 如果数据量大 list不是最后一行 参照下一个
            FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
            excelWriter.fill(data, fillConfig, writeSheet);
            this.handler(excelWriter, writeSheet, fillConfig, data);
        }
        response.flushBuffer();
    }

    public abstract void handler(ExcelWriter excelWriter, WriteSheet writeSheet, FillConfig fillConfig, T data);

    public abstract InputStream getTemplateFiles() throws IOException;

}
