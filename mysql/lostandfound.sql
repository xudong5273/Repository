/*
SQLyog Professional v12.2.6 (64 bit)
MySQL - 5.6.39-log : Database - lostandfound
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lostandfound` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lostandfound`;

/*Table structure for table `found` */

DROP TABLE IF EXISTS `found`;

CREATE TABLE `found` (
  `foundid` int(11) NOT NULL AUTO_INCREMENT,
  `foundname` varchar(255) NOT NULL,
  `classes` varchar(20) NOT NULL,
  `foundthings` varchar(200) NOT NULL,
  `founddate` varchar(200) NOT NULL,
  `foundplace` varchar(255) NOT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`foundid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `found` */

insert  into `found`(`foundid`,`foundname`,`classes`,`foundthings`,`founddate`,`foundplace`,`phone`) values 
(1,'张三','14软件G1班','手机','2018-03-24','上海','13834341111'),
(2,'李四','14软件G2班','电脑','2018-03-23','北京','13834342222'),
(3,'王五','14软件G3班','苹果电脑','2018-03-31','杭州','13834343333'),
(5,'Mark','14软件G2班','电脑和手机都丢了','2018-4-2','太原','15989654785'),
(6,'Tom','14软件G3班','苹果手机iPhoneX plus','2018-4-2','山西大学商务学院','15955556325'),
(8,'陈旭东','14软件G1班','红色自行车','2018-4-6','大街上','13565987895');

/*Table structure for table `lost` */

DROP TABLE IF EXISTS `lost`;

CREATE TABLE `lost` (
  `lostid` int(11) NOT NULL AUTO_INCREMENT,
  `lostname` varchar(20) NOT NULL,
  `classes` varchar(20) NOT NULL,
  `lostthings` varchar(200) NOT NULL,
  `lostdate` varchar(200) DEFAULT NULL,
  `lostplace` varchar(200) DEFAULT NULL,
  `phone` varchar(11) NOT NULL,
  PRIMARY KEY (`lostid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `lost` */

insert  into `lost`(`lostid`,`lostname`,`classes`,`lostthings`,`lostdate`,`lostplace`,`phone`) values 
(1,'张三','14软件G1班','手机','2018-03-24','上海','13834341111'),
(2,'李四','14软件G2班','电脑','2018-03-23','北京','13834342222'),
(3,'王五','14软件G3班','玫瑰金苹果手机','2018-03-31','杭州','13834343333'),
(4,'王小二','14软件G1班','红色小米手机','2018-04-02','山西大学商务学院','13811111111'),
(5,'jack','14软件G3班','电脑和手机都丢了','2018-04-02','太原','15362589632'),
(10,'张峰','14软件G2班','红色法拉利跑车','2018-4-6','大街上','1594567459');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `classes` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`username`,`password`,`classes`) values 
('admin','admin','14网络G1班'),
('张峰','1','14软件G2班'),
('陈旭东','1','1软件G1班'),
('1','1','14网络G2班');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
