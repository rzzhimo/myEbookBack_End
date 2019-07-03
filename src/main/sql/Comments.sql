CREATE TABLE `Comment` ( `cid` int(11) NOT NULL AUTO_INCREMENT,
                       `bid` int(11) NOT NULL,
                       `uid` int(11) NOT NULL,
                       `comment` varchar(255) default null,
                       PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
