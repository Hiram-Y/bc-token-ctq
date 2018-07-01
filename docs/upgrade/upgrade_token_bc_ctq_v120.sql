/*迁移地址表*/
INSERT INTO `tctq_token_address` 
(`code`,`address`,`symbol`,`create_datetime`) 
SELECT 
 `code`,`address`,'OGC',`create_datetime`
FROM online_token_bc_ctq.tctq_eth_address WHERE type = 'X';

ALERT TABLE `tctq_wan_transaction` ADD `token_from` varchar(255) DEFAULT NULL COMMENT 'token币发起地址'

ALERT TABLE `tctq_wan_transaction` ADD `token_to` varchar(255) DEFAULT NULL COMMENT 'token币接收地址'

ALERT TABLE `tctq_wan_transaction` ADD `token_value` varchar(255) DEFAULT NULL COMMENT 'token币token币数量'
