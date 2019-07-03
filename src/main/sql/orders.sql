drop table `Orders`;
CREATE TABLE `Orders` (
                       `id` int(11) NOT NULL AUTO_INCREMENT,
                       `order_time` varchar(45) DEFAULT NULL,
                       `user_id` int(11) not null ,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
