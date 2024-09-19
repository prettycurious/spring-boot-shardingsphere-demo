## 实现
###  shardingsphere 5.3.2版本
1. 同时存储原数据和加密数据，满足已上线系统的数据加密需求；
2. 实现数据脱敏：前N后N等；
### shardingsphere 5.5.0版本
1. 实现加密数据的保存，无法满足已上线系统的加密需求；
2. 实现数据脱敏；
3. 与jpa无法兼容
### shardingsphere 4.1.1版本
1. 实现原数据和加密数据的保存
2. 未实现数据脱敏

## 参考
1. [ShardingSphere 4.1.1 官方网站](https://shardingsphere.apache.org/document/legacy/4.x/document/cn/overview/)
2. [ShardingSphere 最新版 官方网站](https://shardingsphere.apache.org/index_zh.html)