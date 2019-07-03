DROP TABLE `Carts`;
CREATE TABLE `Carts` ( `cart_id` int(11) NOT NULL AUTO_INCREMENT,
                       `book_id` int(11) NOT NULL,
                       `num` int(11) not null ,
                       `title` varchar(255),
                       `user_id` int(11) NOT NULL,

                       PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
