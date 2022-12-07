SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
                        `test_id` varchar(64) NOT NULL COMMENT 'GKAのサービスID',
                        `student` varchar(255) DEFAULT NULL COMMENT 'Upcoming url endpoint',
                        `teacher` varchar(255) DEFAULT NULL COMMENT 'History url endpoint',
                        PRIMARY KEY (`test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
                        `test_id` varchar(64) NOT NULL COMMENT 'GKAのサービスID',
                        `name` varchar(255) DEFAULT NULL COMMENT 'Upcoming url endpoint',
                        `age` varchar(255) DEFAULT NULL COMMENT 'History url endpoint',
                        PRIMARY KEY (`test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
SET FOREIGN_KEY_CHECKS = 1;
BEGIN;
INSERT INTO `test` VALUES ('TH', 'Thailand','tyb');
COMMIT;
BEGIN;
INSERT INTO `demo` VALUES ('TH', 'Thailand','12');
COMMIT;