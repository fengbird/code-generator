# ************************************************************
# Sequel Pro SQL dump
# Version 5446
#
# https://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 172.16.48.133 (MySQL 5.7.32-0ubuntu0.18.04.1)
# Database: code_generator
# Generation Time: 2020-11-06 06:07:44 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table data_source_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `data_source_config`;

CREATE TABLE `data_source_config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dataSourceConfigName` varchar(50) NOT NULL DEFAULT '',
  `dbType` varchar(20) NOT NULL DEFAULT 'MYSQL' COMMENT '数据库类型',
  `schemaName` varchar(20) DEFAULT NULL COMMENT 'PostgreSQL schemaName',
  `url` varchar(500) NOT NULL DEFAULT 'jdbc:mysql://localhost:3306/database' COMMENT '驱动连接的URL',
  `driverName` varchar(200) NOT NULL DEFAULT 'com.mysql.cj.jdbc.Driver' COMMENT '驱动名称',
  `username` varchar(50) NOT NULL DEFAULT 'root' COMMENT '数据库连接用户名',
  `password` varchar(100) NOT NULL DEFAULT 'root' COMMENT '数据库连接密码',
  `createAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` int(11) NOT NULL DEFAULT '1',
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='数据源配置';

LOCK TABLES `data_source_config` WRITE;
/*!40000 ALTER TABLE `data_source_config` DISABLE KEYS */;

INSERT INTO `data_source_config` (`id`, `dataSourceConfigName`, `dbType`, `schemaName`, `url`, `driverName`, `username`, `password`, `createAt`, `updateAt`, `version`, `isDeleted`)
VALUES
	(1,'通用本地数据源配置','MYSQL','','jdbc:mysql://localhost:3306/codecamp','com.mysql.cj.jdbc.Driver','root','root','2020-10-22 20:49:07','2020-10-22 21:09:49',1,0);

/*!40000 ALTER TABLE `data_source_config` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table global_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `global_config`;

CREATE TABLE `global_config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `globalConfigName` varchar(50) NOT NULL DEFAULT '',
  `fileOverride` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否覆盖已有文件',
  `open` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否打开输出目录',
  `enableCache` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否在xml中添加二级缓存配置',
  `author` varchar(50) NOT NULL DEFAULT '' COMMENT '开发人员',
  `kotlin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '开启 Kotlin 模式',
  `swagger2` tinyint(1) NOT NULL DEFAULT '0' COMMENT '开启 swagger2 模式',
  `activeRecord` tinyint(1) NOT NULL DEFAULT '0' COMMENT '开启 ActiveRecord 模式',
  `baseResultMap` tinyint(1) NOT NULL DEFAULT '0' COMMENT '开启 BaseResultMap',
  `dateType` varchar(20) NOT NULL DEFAULT 'TIME_PACK' COMMENT '时间类型对应策略, ONLY_DATE: 只使用 java.util.date 代替  SQL_PACK：使用 java.sql 包下的。 TIME_PACK：使用 java.time 包下的java8 新的时间类型',
  `baseColumnList` tinyint(1) NOT NULL DEFAULT '0' COMMENT '开启 baseColumnList',
  `entityName` varchar(1000) NOT NULL DEFAULT '%Entity' COMMENT 'entity层文件名称方式，例如： %sAction 生成 UserAction',
  `mapperName` varchar(1000) NOT NULL DEFAULT '%Mapper' COMMENT 'mapper层文件名称方式，例如： %sAction 生成 UserAction',
  `xmlName` varchar(1000) NOT NULL DEFAULT '%Mapper' COMMENT 'xml层文件名称方式，例如： %sAction 生成 UserAction',
  `serviceName` varchar(1000) NOT NULL DEFAULT '%Service' COMMENT 'service层文件名称方式，例如： %sAction 生成 UserAction',
  `serviceImplName` varchar(1000) NOT NULL DEFAULT '%ServiceImpl' COMMENT 'serviceImpl层文件名称方式，例如： %sAction 生成 UserAction',
  `controllerName` varchar(1000) NOT NULL DEFAULT '%Controller' COMMENT 'controller层文件名称方式，例如： %sAction 生成 UserAction',
  `idType` varchar(50) NOT NULL DEFAULT '0' COMMENT '指定生成的主键的ID类型,AUTO:数据库ID自增 1: 该类型为未设置主键类型(注解里等于跟随全局,全局里约等于 INPUT) 2: 用户输入ID，该类型可以通过自己注册自动填充插件进行填充。3: 分配ID (主键类型为number或string），默认实现为雪花算法。4: 分配去除-号的UUID',
  `createAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` int(11) NOT NULL DEFAULT '1',
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='全局配置';

LOCK TABLES `global_config` WRITE;
/*!40000 ALTER TABLE `global_config` DISABLE KEYS */;

INSERT INTO `global_config` (`id`, `globalConfigName`, `fileOverride`, `open`, `enableCache`, `author`, `kotlin`, `swagger2`, `activeRecord`, `baseResultMap`, `dateType`, `baseColumnList`, `entityName`, `mapperName`, `xmlName`, `serviceName`, `serviceImplName`, `controllerName`, `idType`, `createAt`, `updateAt`, `version`, `isDeleted`)
VALUES
	(1,'Java通用全局配置',1,1,0,'ZhaoTengchao',0,0,0,0,'TIME_PACK',0,'%sEntity','%sMapper','%sMapper','%sIService','%sService','%sClient','AUTO','2020-10-22 19:53:45','2020-11-05 16:07:57',1,0);

/*!40000 ALTER TABLE `global_config` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table package_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `package_config`;

CREATE TABLE `package_config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `packageConfigName` varchar(50) NOT NULL DEFAULT '',
  `parent` varchar(500) NOT NULL DEFAULT 'parent' COMMENT '父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名',
  `moduleName` varchar(50) NOT NULL DEFAULT 'module' COMMENT '父包模块名',
  `entity` varchar(500) NOT NULL DEFAULT 'entity' COMMENT 'Entity包名',
  `service` varchar(500) NOT NULL DEFAULT 'service' COMMENT 'Service包名',
  `serviceImpl` varchar(500) NOT NULL DEFAULT 'service.impl' COMMENT 'Service Impl包名',
  `mapper` varchar(500) NOT NULL DEFAULT 'mapper' COMMENT 'Mapper包名',
  `xml` varchar(500) NOT NULL DEFAULT 'mapper.xml' COMMENT 'Mapper XML包名',
  `controller` varchar(500) NOT NULL DEFAULT 'controller' COMMENT 'Controller包名',
  `createAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` int(11) NOT NULL DEFAULT '1',
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='跟包相关的配置项';

LOCK TABLES `package_config` WRITE;
/*!40000 ALTER TABLE `package_config` DISABLE KEYS */;

INSERT INTO `package_config` (`id`, `packageConfigName`, `parent`, `moduleName`, `entity`, `service`, `serviceImpl`, `mapper`, `xml`, `controller`, `createAt`, `updateAt`, `version`, `isDeleted`)
VALUES
	(1,'java通用包配置-teaching_system','','','cn.codemao.service.codecamp.teaching.infrastructure.repository.model.entity','cn.codemao.service.codecamp.teaching.service','cn.codemao.service.codecamp.teaching.service','cn.codemao.service.codecamp.teaching.infrastructure.repository.mapper','cn.codemao.service.codecamp.teaching.infrastructure.repository.mapper','cn.codemao.service.codecamp.teaching.client','2020-10-22 20:53:55','2020-11-06 11:37:53',1,0);

/*!40000 ALTER TABLE `package_config` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table strategy_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `strategy_config`;

CREATE TABLE `strategy_config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `strategyConfigName` varchar(50) NOT NULL DEFAULT '' COMMENT '策略配置名',
  `isCapitalMode` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否大写命名',
  `skipView` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否跳过视图',
  `naming` varchar(50) NOT NULL DEFAULT 'underline_to_camel' COMMENT '名称转换',
  `columnNaming` varchar(50) DEFAULT NULL COMMENT '数据库表映射到实体的命名策略，未指定按照 naming 执行',
  `tablePrefix` varchar(50) DEFAULT NULL COMMENT '表前缀',
  `fieldPrefix` varchar(50) DEFAULT NULL COMMENT '字段前缀',
  `superEntityClass` varchar(1000) DEFAULT NULL COMMENT '自定义继承的Entity类全称，带包名',
  `superEntityColumns` varchar(1000) DEFAULT NULL COMMENT '自定义基础的Entity类，公共字段',
  `superMapperClass` varchar(1000) DEFAULT NULL COMMENT '自定义继承的Mapper类全称，带包名',
  `superServiceClass` varchar(1000) DEFAULT NULL COMMENT '自定义继承的Service类全称，带包名',
  `superServiceImplClass` varchar(1000) DEFAULT NULL COMMENT '自定义继承的ServiceImpl类全称，带包名',
  `superControllerClass` varchar(1000) DEFAULT NULL COMMENT '自定义继承的Controller类全称，带包名',
  `entitySerialVersionUID` tinyint(1) NOT NULL DEFAULT '0' COMMENT '实体是否生成 serialVersionUID',
  `entityColumnConstant` tinyint(1) NOT NULL DEFAULT '0' COMMENT '【实体】是否生成字段常量',
  `entityBuilderModel` tinyint(1) NOT NULL DEFAULT '0' COMMENT '【实体】是否为构建者模型',
  `entityLombokModel` tinyint(1) NOT NULL DEFAULT '0' COMMENT '【实体】是否为lombok模型',
  `entityBooleanColumnRemoveIsPrefix` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'Boolean类型字段是否移除is前缀',
  `restControllerStyle` tinyint(1) NOT NULL DEFAULT '1' COMMENT '生成 @RestController',
  `controllerMappingHyphenStyle` tinyint(1) DEFAULT NULL COMMENT '驼峰转连字符',
  `entityTableFieldAnnotationEnable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否生成实体时，生成字段注解',
  `versionFieldName` varchar(50) NOT NULL DEFAULT 'version' COMMENT '乐观锁属性名称',
  `logicDeleteFieldName` varchar(50) NOT NULL DEFAULT 'is_deleted' COMMENT '逻辑删除属性名称',
  `tableFillList` varchar(1000) DEFAULT NULL COMMENT '表填充字段',
  `enableSqlFilter` tinyint(1) NOT NULL DEFAULT '1' COMMENT '启用sql过滤',
  `likeTable` varchar(1000) DEFAULT NULL COMMENT '包含表名',
  `notLikeTable` varchar(1000) DEFAULT NULL COMMENT '不包含表名',
  `isCapitalModeNaming` varchar(200) DEFAULT NULL COMMENT '大写命名、字段符合大写字母数字下划线命名',
  `createAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` int(11) NOT NULL DEFAULT '1',
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='策略配置项';

LOCK TABLES `strategy_config` WRITE;
/*!40000 ALTER TABLE `strategy_config` DISABLE KEYS */;

INSERT INTO `strategy_config` (`id`, `strategyConfigName`, `isCapitalMode`, `skipView`, `naming`, `columnNaming`, `tablePrefix`, `fieldPrefix`, `superEntityClass`, `superEntityColumns`, `superMapperClass`, `superServiceClass`, `superServiceImplClass`, `superControllerClass`, `entitySerialVersionUID`, `entityColumnConstant`, `entityBuilderModel`, `entityLombokModel`, `entityBooleanColumnRemoveIsPrefix`, `restControllerStyle`, `controllerMappingHyphenStyle`, `entityTableFieldAnnotationEnable`, `versionFieldName`, `logicDeleteFieldName`, `tableFillList`, `enableSqlFilter`, `likeTable`, `notLikeTable`, `isCapitalModeNaming`, `createAt`, `updateAt`, `version`, `isDeleted`)
VALUES
	(1,'java策略配置',0,0,'underline_to_camel','underline_to_camel','tbl_','',NULL,NULL,'cn.codemao.service.codecamp.teaching.config.mybatis.mapper.CodemaoBaseMapper','none','none',NULL,0,0,0,1,1,1,1,1,'version','is_deleted',NULL,1,NULL,NULL,NULL,'2020-10-22 20:55:33','2020-11-05 16:55:04',1,0);

/*!40000 ALTER TABLE `strategy_config` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table summary_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `summary_config`;

CREATE TABLE `summary_config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0' COMMENT '配置名',
  `dataSourceConfigId` int(11) NOT NULL DEFAULT '0' COMMENT '数据源配置id',
  `globalConfigId` int(11) NOT NULL DEFAULT '0' COMMENT '全局配置id',
  `packageConfigId` int(11) NOT NULL DEFAULT '0' COMMENT '包配置id',
  `strategyConfigId` int(11) NOT NULL DEFAULT '0' COMMENT '策略配置id',
  `createAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` int(11) NOT NULL DEFAULT '1',
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='汇总配置';

LOCK TABLES `summary_config` WRITE;
/*!40000 ALTER TABLE `summary_config` DISABLE KEYS */;

INSERT INTO `summary_config` (`id`, `name`, `dataSourceConfigId`, `globalConfigId`, `packageConfigId`, `strategyConfigId`, `createAt`, `updateAt`, `version`, `isDeleted`)
VALUES
	(1,'teaching-system-biz模版',1,1,1,1,'2020-10-22 20:58:35','2020-11-04 18:41:33',1,0);

/*!40000 ALTER TABLE `summary_config` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
