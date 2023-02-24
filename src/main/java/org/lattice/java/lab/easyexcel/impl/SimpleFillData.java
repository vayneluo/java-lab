package org.lattice.java.lab.easyexcel.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;


/**
 * @description:
 * @author: lattice
 * @date: 2023/2/7 4:09 PM
 */
@Data
@Builder
public class SimpleFillData {

    private String projectCode;

    private String total;

    private List<PartsData> parts;
}
