drop table users;
CREATE TABLE `users` (
                       `id` int(11) NOT NULL AUTO_INCREMENT,
                       `password` varchar(45) DEFAULT NULL,
                       `name` varchar(45) DEFAULT NULL,
                       `phone` varchar(45) DEFAULT NULL,
                       `email` varchar(45) DEFAULT NULL,
                       `status` varchar(45) DEFAULT 'user',
                       `usable` int(11) DEFAULT 1,

                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `users` (`id`,`password`,`name`,`phone`,`email`,`status`,`usable`) VALUES (1,'123','CaoCao','31415926535','wei@sanguo.com','manager',1);
INSERT INTO `users` (`id`,`password`,`name`,`phone`,`email`,`status`,`usable`) VALUES (3,'123','LiangZhuge','18946783232','shu@sanguo.com','user',1);
INSERT INTO `users` (`id`,`password`,`name`,`phone`,`email`,`status`,`usable`) VALUES (4,'123','QuanSun','12387282733','wu@sanguo.com','user',1);
INSERT INTO `users` (`id`,`password`,`name`,`phone`,`email`,`status`,`usable`) VALUES (5,'123','MH370','13800000000','bless@vip.com','user',1);
