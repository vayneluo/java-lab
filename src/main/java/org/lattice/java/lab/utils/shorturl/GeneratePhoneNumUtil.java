package org.lattice.java.lab.utils.shorturl;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @description: 随机生成手机号
 * @author: Lattice
 * @date 2022/7/1 08:39
 */
@Slf4j
public class GeneratePhoneNumUtil {

    private int age;

    /***
     * @description:  生成指定格式随机手机号Json
     * @param: [size] 待生成手机号个数
     * @author: Vayne.Luo
     * @date: 2022/7/1 9:08
     */
    public static String generatePhoneNumber(int size) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"signName\": \"海智在线\",");
        sb.append("\"templateCode\": \"SMS_244010291\",");
        sb.append("\"paramList\": [");
        for (int i = 0; i < size; i++) {
            String phoneNumber = getRandomNum(8);
            sb.append("{\"phoneNumber\": ").append("\"").append(phoneNumber).append("\"")
                    .append(",");
            if (i == size -1) {
                sb.append("\"templateParam\": {\"code\":\"https://qa-new-manage.haizol.com/manage-config/#/manage-config/it/api-logs/index\"}}");
            }else {
                sb.append("\"templateParam\": {\"code\":\"https://qa-new-manage.haizol.com/manage-config/#/manage-config/it/api-logs/index\"}},");
            }
        }
        sb.append("]").append("}");
        return sb.toString();
    }

    /**
     * @description: 取N个随机数
     * @author: Vayne.Luo
     * @date: 2021/12/1 9:50
     */
    public static String getRandomNum(int num){
        StringBuilder code = new StringBuilder();
        // 0-9取N次随机数
        for (int i = 0; i < num; i++) {
            code.append(getRandom().nextInt(10));
        }
        return code.toString();
    }

    /**
     * @description: JDK1.7推荐使用 ThreadLocalRandom 获取随机数
     * @author: Vayne.Luo
     * @date: 2021/12/1 9:50
     */
    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }


    public static void main(String[] args) {
        String phoneNumberJson = generatePhoneNumber(9);
        log.info(phoneNumberJson);
    }
}

class OutClass {
    public void run() {
        System.out.println();
    }
}
