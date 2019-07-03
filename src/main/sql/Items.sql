CREATE TABLE `Items` ( `id` int(11) NOT NULL AUTO_INCREMENT,
                       `item_count` int(11) NOT NULL,
                       `items_id` int(11) NOT NULL,
                       `price` double NOT NULL,
                       `uid` int(11) NOT NULL,
                       `oid` int(11) NOT NULL,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
