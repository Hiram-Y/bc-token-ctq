package com.cdkj.coin.bo;

import java.math.BigInteger;
import java.util.List;

import org.web3j.protocol.core.methods.response.EthBlock;

import com.cdkj.coin.bo.base.IPaginableBO;
import com.cdkj.coin.domain.EthTransaction;
import com.cdkj.coin.token.OrangeCoinToken.TransferEventResponse;

public interface IEthTransactionBO extends IPaginableBO<EthTransaction> {

    // 对象转换
    public EthTransaction convertTx(EthBlock.TransactionObject tx,
            BigInteger gasUsed, BigInteger timestamp,
            TransferEventResponse transferEventResponse);

    // 分页查询交易
    public List<EthTransaction> queryEthTxPage(EthTransaction condition,
            int start, int limit);

    // 改变交易状态 为以推送
    public void changeTxStatusToPushed(List<String> txHashList);

    // 批量插入交易
    public void insertTxList(List<EthTransaction> txList);

    public int saveEthTransaction(EthTransaction tx);

    public List<EthTransaction> queryEthTransactionList(EthTransaction condition);

    public EthTransaction getEthTransaction(String hash);

    public boolean isEthTransactionExist(String hash);

}
