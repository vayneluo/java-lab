package org.lattice.java.lab.controller.demo;

import org.apache.commons.compress.utils.IOUtils;
import org.lattice.java.lab.easyexcel.impl.PartsData;
import org.lattice.java.lab.easyexcel.impl.SimpleFillData;
import org.lattice.java.lab.easyexcel.impl.SimpleFillHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/7 4:10 PM
 */
@RestController
public class SimpleFillExcelController {

    @Autowired
    SimpleFillHandler fillHandler;

    @GetMapping("/export")
    public void export(HttpServletResponse response) throws IOException {
        List<PartsData> dataList = new ArrayList<>();
        for (int i= 0; i<5 ; i++) {
            PartsData partsData = new PartsData();
            dataList.add(partsData);
            partsData.setSort(String.valueOf(i + 1));
            partsData.setName("零件" + i);
            partsData.setRemark("零件备注" + i);
        }
        SimpleFillData data = SimpleFillData.builder().projectCode("HKKB-00001")
                .parts(dataList)
                .total(String.valueOf(dataList.size()))
                .build();
        String fileName = "testExcel" +"-"+ System.currentTimeMillis() + ".xlsx";


        fillHandler.fillExcelBytes(data, fileName, response);
    }
}
