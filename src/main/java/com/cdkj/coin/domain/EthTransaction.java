package com.cdkj.coin.domain;

import java.math.BigInteger;
import java.util.Date;

import com.cdkj.coin.dao.base.ABaseDO;

/**
* 以太坊交易
* @author: haiqingzheng
* @since: 2017年10月29日 19:13:13
* @history:
*/
public class EthTransaction extends ABaseDO {

    private static final long serialVersionUID = 1L;

    // 交易hash
    private String hash;

    // 第几个交易
    private BigInteger nonce;

    // 区块hash
    private String blockHash;

    // 区块编号
    private String blockNumber;

    // transactionIndex
    private BigInteger transactionIndex;

    // 发送地址/合约执行方
    private String from;

    // 接受地址/合约地址
    private String to;

    // 数量
    private String value;

    // input输入
    private String input;

    // token币发起地址
    private String tokenFrom;

    // token币接收地址
    private String tokenTo;

    // token币数量
    private String tokenValue;

    // gas价格
    private String gasPrice;

    // gasLimit
    private BigInteger gas;

    // 消耗gas
    private BigInteger gasUsed;

    public BigInteger getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigInteger gasUsed) {
        this.gasUsed = gasUsed;
    }

    // 区块生成时间
    private Date blockCreateDatetime;

    // 区块生成时间
    private Date syncDatetime;

    private String status;

    // ################# 一下属性为查询而添加 ##############
    private Date blockCreateDatetimeStart;

    private Date blockCreateDatetimeEnd;

    public Date getBlockCreateDatetimeStart() {
        return blockCreateDatetimeStart;
    }

    public void setBlockCreateDatetimeStart(Date blockCreateDatetimeStart) {
        this.blockCreateDatetimeStart = blockCreateDatetimeStart;
    }

    public Date getBlockCreateDatetimeEnd() {
        return blockCreateDatetimeEnd;
    }

    public void setBlockCreateDatetimeEnd(Date blockCreateDatetimeEnd) {
        this.blockCreateDatetimeEnd = blockCreateDatetimeEnd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getBlockCreateDatetime() {
        return blockCreateDatetime;
    }

    public void setBlockCreateDatetime(Date blockCreateDatetime) {
        this.blockCreateDatetime = blockCreateDatetime;
    }

    public Date getSyncDatetime() {
        return syncDatetime;
    }

    public void setSyncDatetime(Date syncDatetime) {
        this.syncDatetime = syncDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //
    // // 创建时间
    // private String creates;
    //
    // // publicKey
    // private String publicKey;
    //
    // // raw
    // private String raw;
    //
    // // r
    // private String r;
    //
    // // s
    // private String s;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public BigInteger getNonce() {
        return nonce;
    }

    public void setNonce(BigInteger nonce) {
        this.nonce = nonce;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public BigInteger getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(BigInteger transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public BigInteger getGas() {
        return gas;
    }

    public void setGas(BigInteger gas) {
        this.gas = gas;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getTokenFrom() {
        return tokenFrom;
    }

    public void setTokenFrom(String tokenFrom) {
        this.tokenFrom = tokenFrom;
    }

    public String getTokenTo() {
        return tokenTo;
    }

    public void setTokenTo(String tokenTo) {
        this.tokenTo = tokenTo;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
