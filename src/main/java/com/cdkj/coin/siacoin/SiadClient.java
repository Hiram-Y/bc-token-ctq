/**
 * @Title SiadClient.java 
 * @Package com.cdkj.coin.siacoin 
 * @Description 
 * @author leo(haiqing)  
 * @date 2018年1月30日 下午8:54:31 
 * @version V1.0   
 */
package com.cdkj.coin.siacoin;

import java.math.BigInteger;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cdkj.coin.common.PropertiesUtil;
import com.cdkj.coin.http.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/** 
 * @author: haiqingzheng 
 * @since: 2018年1月30日 下午8:54:31 
 * @history:
 */
public class SiadClient {

    public static final String SC_URL = PropertiesUtil.Config.SC_URL;

    public static void main(String[] args) {
        List<Transaction> transactions = getTransactions(new BigInteger("0"),
            new BigInteger("144520"));
        System.out.println(isUnlock() + "" + transactions.size());
    }

    public static boolean isUnlock() {
        boolean result = false;
        // 获取钱包信息
        String resStr = HttpUtil.doAccessHTTPGetJson(SC_URL + "/wallet");
        result = JSONObject.parseObject(resStr).getBooleanValue("unlocked")
                && JSONObject.parseObject(resStr).getBooleanValue("encrypted");
        return result;
    }

    // 获取当前区块高度
    public static BigInteger getBlockHeight() {
        BigInteger result = BigInteger.ZERO;
        String resStr = HttpUtil.doAccessHTTPGetJson(SC_URL + "/consensus");
        String height = JSONObject.parseObject(resStr).getString("height");
        result = new BigInteger(height);
        return result;
    }

    // 获取钱包相关的交易列表
    public static List<Transaction> getTransactions(BigInteger startheight,
            BigInteger endheight) {
        List<Transaction> result = null;
        String resStr = HttpUtil
            .doAccessHTTPGetJson(SC_URL + "/wallet/transactions?startheight="
                    + startheight + "&endheight=" + endheight);
        // System.out.println("startheight:" + startheight + " endheight="
        // + endheight + " resStr=" + resStr);
        String txStr = JSONObject.parseObject(resStr)
            .getString("confirmedtransactions");

        if (txStr != null) {
            Gson gson = new Gson();
            result = gson.fromJson(txStr, new TypeToken<List<Transaction>>() {
            }.getType());
        }

        return result;
    }

    // 获取当前区块高度
    public static boolean verifyAddress(String address) {
        boolean result = false;
        String resStr = HttpUtil
            .doAccessHTTPGetJson(SC_URL + "/wallet/verify/address/" + address);
        result = JSONObject.parseObject(resStr).getBoolean("valid");
        return result;
    }
}
