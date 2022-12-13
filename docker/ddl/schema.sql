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
CREATE TABLE `demo` (    `id` varchar(64) NOT NULL COMMENT null ,
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

-- ----------------------------
-- Table structure for country_mst
-- ----------------------------
DROP TABLE IF EXISTS `country_mst`;
CREATE TABLE `country_mst` (
                               `country_iso_code` varchar(3) NOT NULL COMMENT 'ISO国名コード',
                               `country_name` varchar(64) NOT NULL COMMENT '国名',
                               `sort` int(11) NOT NULL COMMENT '順番. 1 is first',
                               `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                               `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                               `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                               `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                               PRIMARY KEY (`country_iso_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for home_banner_info
-- ----------------------------
DROP TABLE IF EXISTS `home_banner_info`;
CREATE TABLE `home_banner_info` (
                                    `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                    `organization_id` varchar(64) NOT NULL,
                                    `language_code` varchar(3) NOT NULL,
                                    `banner_text` varchar(255) NOT NULL,
                                    `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                    `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                    `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                    `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                    `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for organization_container_info
-- ----------------------------
DROP TABLE IF EXISTS `organization_container_info`;
CREATE TABLE `organization_container_info` (
                                               `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                               `organization_id` varchar(64) NOT NULL COMMENT '組織ID',
                                               `container_type` varchar(2) NOT NULL COMMENT 'UPCOMING\nHISTORY',
                                               `container_name` varchar(255) DEFAULT NULL COMMENT 'コンテナ名',
                                               `sort` int(11) NOT NULL COMMENT '順番. 1 is first',
                                               `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                               `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                               `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                               `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                               `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for organization_idp_info
-- ----------------------------
DROP TABLE IF EXISTS `organization_idp_info`;
CREATE TABLE `organization_idp_info` (
                                         `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                         `idp_service_id` varchar(64) NOT NULL COMMENT 'idpサービスID',
                                         `organization_id` varchar(64) NOT NULL COMMENT '組織ID',
                                         `update_user_info_url` varchar(255) NOT NULL COMMENT 'ユーザー情報更新',
                                         `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                         `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                         `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                         `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                         `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for organization_mst
-- ----------------------------
DROP TABLE IF EXISTS `organization_mst`;
CREATE TABLE `organization_mst` (
                                    `organization_id` varchar(64) NOT NULL COMMENT '組織ID',
                                    `country_iso_code` varchar(3) NOT NULL COMMENT 'ISO国名コード',
                                    `organization_name` varchar(64) NOT NULL COMMENT '組織名',
                                    `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                    `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                    `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                    `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                    `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                    PRIMARY KEY (`organization_id`),
                                    KEY `country_iso_code` (`country_iso_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for organization_service_info
-- ----------------------------
DROP TABLE IF EXISTS `organization_service_info`;
CREATE TABLE `organization_service_info` (
                                             `gka_service_id` varchar(64) NOT NULL COMMENT 'GKAのサービスID',
                                             `service_id` varchar(64) NOT NULL COMMENT 'サービスID',
                                             `organization_id` varchar(64) NOT NULL COMMENT '組織ID',
                                             `service_name` varchar(255) NOT NULL COMMENT 'サービス名',
                                             `service_url` varchar(255) NOT NULL COMMENT 'サービスURL',
                                             `service_image_s3_key` varchar(255) NOT NULL COMMENT 'S3から取得するためサービス画像キー',
                                             `service_active_icon_s3_key` varchar(255) NOT NULL COMMENT 'S3から取得するためアイコンキー',
                                             `service_inactive_icon_s3_key` varchar(255) NOT NULL COMMENT 'S3から取得するためインアクティブなアイコンキー',
                                             `sort` int(11) NOT NULL COMMENT '順番. 1 is first',
                                             `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                             `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                             `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                             `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                             `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                             PRIMARY KEY (`gka_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- ----------------------------
-- Table structure for url_type_mst
-- ----------------------------
DROP TABLE IF EXISTS `url_type_mst`;
CREATE TABLE `url_type_mst` (
                                `url_type` varchar(4) NOT NULL,
                                `url_type_name` varchar(64) DEFAULT NULL,
                                `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                PRIMARY KEY (`url_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for organization_url_info
-- ----------------------------
DROP TABLE IF EXISTS `organization_url_info`;
CREATE TABLE `organization_url_info` (
                                         `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                         `organization_id` varchar(64) NOT NULL COMMENT '組織ID',
                                         `url_type` varchar(4) NOT NULL COMMENT 'url type\n0100',
                                         `url` varchar(255) NOT NULL COMMENT 'モビリティマーケットプレイスURL',
                                         `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                         `creator` varchar(50) DEFAULT NULL COMMENT '作成者',
                                         `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                         `updater` varchar(50) DEFAULT NULL COMMENT '更新者',
                                         `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for language_mst
-- ----------------------------
DROP TABLE IF EXISTS `language_mst`;
CREATE TABLE `language_mst` (
                                `language_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '言語コード',
                                `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                                `creator` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '作成者',
                                `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                                `updater` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '更新者',
                                `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                                PRIMARY KEY (`language_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
                           `message_id` bigint NOT NULL AUTO_INCREMENT,
                           `message_type` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'メッセージ種別',
                           `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                           `creator` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '作成者',
                           `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                           `updater` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '更新者',
                           `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                           `gmt_published` datetime NOT NULL COMMENT '公開日時',
                           PRIMARY KEY (`message_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for notification
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
                                `id` bigint NOT NULL AUTO_INCREMENT,
                                `message_id` bigint,
                                `language_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '言語コード',
                                `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'タイトル',
                                `body` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '本文',
                                `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT 'URL',
                                PRIMARY KEY (`id`),
                                FOREIGN KEY (`message_id`) REFERENCES message(`message_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for faq
-- ----------------------------
DROP TABLE IF EXISTS `faq`;
CREATE TABLE `faq` (
                       `faq_id` bigint NOT NULL AUTO_INCREMENT,
                       `creator` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '作成者',
                       `updater` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '更新者',
                       `gmt_create` datetime DEFAULT NULL COMMENT '作成日時',
                       `gmt_deleted` datetime DEFAULT NULL COMMENT '削除日時',
                       `gmt_modified` datetime NOT NULL COMMENT '更新日時',
                       `gmt_published` datetime NOT NULL COMMENT '公開日時',
                       `sort_seq` bigint NOT NULL,
                       PRIMARY KEY (`faq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for faq_digest
-- ----------------------------
DROP TABLE IF EXISTS `faq_digest`;
CREATE TABLE `faq_digest` (
                              `id` bigint NOT NULL AUTO_INCREMENT,
                              `faq_id` bigint,
                              `language_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '言語コード',
                              `question` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'タイトル',
                              `answer` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '本文',
                              PRIMARY KEY (`id`),
                              FOREIGN KEY (`faq_id`) REFERENCES faq(`faq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- ----------------------------
-- Table structure for cirrus_connection_settings
-- ----------------------------
DROP TABLE IF EXISTS `cirrus_connection_settings`;
CREATE TABLE `cirrus_connection_settings` (
                                              `gka_service_id` varchar(64) NOT NULL COMMENT 'GKAのサービスID',
                                              `upcoming_url` varchar(255) NOT NULL COMMENT 'Upcoming url endpoint',
                                              `history_url` varchar(255) NOT NULL COMMENT 'History url endpoint',
                                              `verify_url` varchar(255) NOT NULL COMMENT 'Verify url endpoint',
                                              `client_id` varchar(64) NOT NULL COMMENT 'Client Id',
                                              `client_secret` varchar(255) DEFAULT NULL COMMENT 'api secrete key',
                                              `time_out` int(10) NOT NULL COMMENT 'connection time out',
                                              PRIMARY KEY (`gka_service_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;


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
-- ----------------------------
-- Records of country_mst
-- ----------------------------
BEGIN;
INSERT INTO `country_mst` VALUES ('TH', 'Thailand', 1, 'GKIDP', '2021-08-03 09:10:17', 'GKIDP', '2021-08-03 09:10:26');
COMMIT;
-- ----------------------------
-- Records of home_banner_info
-- ----------------------------
BEGIN;
INSERT INTO `home_banner_info` VALUES (1, 'TH001', 'en', 'Seamless and smart mobility solutions', NULL, 'GKIDP', '2021-08-03 09:45:23', 'GKIDP', '2021-08-03 09:45:27');
INSERT INTO `home_banner_info` VALUES (2, 'TH001', 'ja', 'Seamless and smart mobility solutions', NULL, 'GKIDP', '2021-08-03 09:45:23', 'GKIDP', '2021-08-03 09:45:27');
INSERT INTO `home_banner_info` VALUES (3, 'TH001', 'th', 'ทางออกสู่การขับเคลื่อนที่ราบรื่นและครอบคลุมสำหรับทุกคน', NULL, 'GKIDP', '2021-08-03 09:45:23', 'GKIDP', '2021-08-03 09:45:27');
COMMIT;

-- ----------------------------
-- Records of organization_container_info
-- ----------------------------
BEGIN;
INSERT INTO `organization_container_info` VALUES (1, 'TH001', '01', 'upcoming', 1, NULL, 'GKIDP', '2021-08-03 09:34:16', 'GKIDP', '2021-08-03 09:34:21');
INSERT INTO `organization_container_info` VALUES (2, 'TH001', '02', 'history', 2, NULL, 'GKDIP', '2021-08-03 09:34:41', 'GKIDP', '2021-08-03 09:34:46');
COMMIT;

-- ----------------------------
-- Records of organization_idp_info
-- ----------------------------
BEGIN;
INSERT INTO `organization_idp_info` VALUES (1, 'TH001001', 'TH001', 'https://dev-gk-userpool-th.kinto-mobility.jp/api/user/updateUserInfo', NULL, 'GKIDP', '2021-08-03 09:29:54', 'GKIDP', '2021-08-03 09:30:25');
COMMIT;

-- ----------------------------
-- Records of organization_mst
-- ----------------------------
BEGIN;
INSERT INTO `organization_mst` VALUES ('TH001', 'TH', 'Kinto share', NULL, 'GKIDP', '2021-08-03 09:32:34', 'GKIDP', '2021-08-03 09:32:39');
COMMIT;

-- ----------------------------
-- Records of organization_service_info
-- ----------------------------
BEGIN;
INSERT INTO `organization_service_info` VALUES ('THKS', 'TH001001', 'TH001', 'KINTO SHARE', 'https://tlcl-dev.outsystemsenterprise.com/GlobalIDPProxy/Home.aspx?Portal=KINTOSHARE', 'GKA/img/gka_service_kinto_share.png', 'GKA/img/gka_service_kinto_share_active_icon.png', 'GKA/img/gka_service_kinto_share_inactive_icon.png', 1, NULL, 'GKIDP', '2021-08-03 09:44:32', 'GKIDP', '2021-08-03 09:44:38');
INSERT INTO `organization_service_info` VALUES ('THKG', 'TH001001', 'TH001', 'KINTO GO', 'https://tlcl-dev.outsystemsenterprise.com/GlobalIDPProxy/Home.aspx?Portal=KINTOSHARE', 'GKA/img/gka_service_kinto_share.png', 'GKA/img/gka_service_kinto_share_active_icon.png', 'GKA/img/gka_service_kinto_share_inactive_icon.png', 2, NULL, 'GKIDP', '2021-08-03 09:44:32', 'GKIDP', '2021-08-03 09:44:38');
INSERT INTO `organization_service_info` VALUES ('QAKR', 'QA001001', 'QA001', 'KINTO RENT', 'https://tlcl-dev.outsystemsenterprise.com/GlobalIDPProxy/Home.aspx?Portal=KINTOSHARE', 'GKA/img/gka_service_kinto_share.png', 'GKA/img/gka_service_kinto_share_active_icon.png', 'GKA/img/gka_service_kinto_share_inactive_icon.png', 3, NULL, 'GKIDP', '2021-08-03 09:44:32', 'GKIDP', '2021-08-03 09:44:38');
COMMIT;

-- ----------------------------
-- Records of url_type_mst
-- ----------------------------
BEGIN;
INSERT INTO `url_type_mst` VALUES ('0100', 'myKintoWorld', NULL, 'GKIDP', '2021-08-03 09:35:26', 'GKIDP', '2021-08-03 09:35:31');
COMMIT;

-- ----------------------------
-- Records of organization_url_info
-- ----------------------------
BEGIN;
INSERT INTO `organization_url_info` VALUES (1, 'TH001', '0100', 'https://www.kinto-mobility.com', NULL, 'GKIDP', '2021-08-03 09:36:14', 'GKIDP', '2021-08-03 09:36:18');
COMMIT;

-- ----------------------------
-- Records of language_mst
-- ----------------------------
BEGIN;
INSERT INTO `language_mst` VALUES ('en', NULL, 'GKA', '2021-11-10 11:10:00', 'GKA', '2021-11-10 11:10:00');
INSERT INTO `language_mst` VALUES ('ja', NULL, 'GKA', '2021-11-10 11:10:00', 'GKA', '2021-11-10 11:10:00');
INSERT INTO `language_mst` VALUES ('th', NULL, 'GKA', '2021-11-10 11:10:00', 'GKA', '2021-11-10 11:10:00');
INSERT INTO `language_mst` VALUES ('ar', NULL, 'GKA', '2021-11-10 11:10:00', 'GKA', '2021-11-10 11:10:00');
COMMIT;

-- -- ----------------------------
-- -- Records of message
-- -- ----------------------------
BEGIN;
INSERT INTO `message` VALUES (1, 'announcement', NULL, 'GKA', '2021-11-09 11:10:00', 'GKA', '2021-11-09 11:10:00', '2021-11-09 11:10:00');
INSERT INTO `message` VALUES (2, 'announcement', NULL, 'GKA', '2021-11-10 13:10:00', 'GKA', '2021-11-10 13:10:00', '2021-11-09 11:10:00');
COMMIT;
--
-- -- ----------------------------
-- -- Records of notification
-- -- ----------------------------
BEGIN;
INSERT INTO `notification` VALUES (1, 1, 'en', '1 Nov 2021 | "KINTO - smart mobility" app has been released', 'We are excited to let you know about the launch of Thailand''s KINTO SHARE! Select where you will like to pick up your vehicle of choice and be quickly on the go through the app. We hope you enjoy your journey with us!','https://www.google.com/');
INSERT INTO `notification` VALUES (2, 1, 'ja', '2021.11.01 | タイ KINTO SHARE リリース(ソフトローンチ)', 'タイのKINTO SHAREをリリースしました。お好きな車種、場所、時間をアプリで選択して快適なレンタカー体験をお楽しみください！','https://www.google.com/');
INSERT INTO `notification` VALUES (3, 1, 'th', '1 พ.ย. 2564 | KINTO SHARE ประเทศไทย (Soft Launch)', 'เรามีเรื่องยินดีที่จะแจ้งให้คุณทราบเกี่ยวกับการเปิดตัวบริการ KINTO SHARE ประเทศไทย เพียงเลือกสถานที่ที่คุณต้องการรับรถที่คุณต้องการได้ง่าย ๆ จากตัวเลือกหนึ่งของการเดินทาง ผ่านแอปได้อย่างทันใจ KINTO หวังว่าคุณจะสนุกกับการเดินทางของคุณไปพร้อมกับเรา!','https://www.google.com/');
INSERT INTO `notification` VALUES (4, 2, 'en', '1 Nov 2021 | Thai KINTO Share soft launch', 'We are proud to announce the launch of KINTO''s one-stop shop App! There will be more announcements as the app is updated with new features and services, so stay tuned!\nCurrently servicing:\n- Thai KINTO Share','https://www.google.com/');
INSERT INTO `notification` VALUES (5, 2, 'ja', '2021.11.01 | 「KINTO - キントのスマートモビリティ」アプリをリリースしました', '世界各国のKINTOサービスを利用できるアプリをリリースしました。今後も新機能・新サービスを追加して参りますので、お見逃しなく！\n現在提供しているサービス：\n・タイ KINTO SHARE','https://www.google.com/');
INSERT INTO `notification` VALUES (6, 2, 'th', '1 พ.ย. 2564 | เปิดตัวแอปพลิเคชัน KINTO - smart mobility', 'KINTO ภูมิใจนำเสนอ แอปเดียวที่ครบจบในหนึ่งเดียว และพร้อมจะมีประกาศเพิ่มเติม เมื่อแอปได้มีการอัปเดตบริการใหม่ ๆ พร้อมฟังก์ชั่นคุณลักษณะการใช้งาน โปรดติดตาม เร็ว ๆ นี้\nบริการปัจจุบัน\n- KINTO SHARE ประเทศไทย','https://www.google.com/');
COMMIT;
-- ----------------------------
-- Records of faq
-- ----------------------------
BEGIN;
INSERT INTO `faq` VALUES ('1', 'GKA', 'GKA','2022-03-01 09:44:32', NULL, '2022-03-01 09:44:32', '2022-03-01 09:44:32', '1');
INSERT INTO `faq` VALUES ('2', 'GKA', 'GKA','2022-03-01 09:44:32', NULL, '2022-03-01 09:44:32', '2022-03-01 09:44:32', '2');
INSERT INTO `faq` VALUES ('3', 'GKA', 'GKA','2022-03-01 09:44:32', NULL, '2022-03-01 09:44:32', '2022-03-01 09:44:32', '3');
COMMIT;

-- ----------------------------
-- Records of faq_digest
-- ----------------------------
BEGIN;
INSERT INTO `faq_digest` VALUES ('1', '1', 'en', 'How to login?','Use login button please!!!');
INSERT INTO `faq_digest` VALUES ('2', '1', 'ja', 'ログイン方法は？','ログインボタンをご利用ください!!!');
INSERT INTO `faq_digest` VALUES ('3', '1', 'th', 'วิธีการเข้าสู่ระบบ?','กรุณาใช้ปุ่มเข้าสู่ระบบ !!!');
INSERT INTO `faq_digest` VALUES ('4', '2', 'en', 'How to logout?','Use logout button please!!!');
INSERT INTO `faq_digest` VALUES ('5', '3', 'en', 'How to rent car?','Please use this website https://kinto-jp.com');
INSERT INTO `faq_digest` VALUES ('6', '3', 'ja', 'レンタカーの使い方は？','このウェブサイトを使用してください https://kinto-jp.com');
INSERT INTO `faq_digest` VALUES ('7', '3', 'th', 'วิธีการใช้รถเช่า?','กรุณาใช้เว็บไซต์นี้ https://kinto-jp.com');
COMMIT;


--
-- -- ----------------------------
-- -- Records of cirrus_connection_settings
-- -- ----------------------------
BEGIN;
INSERT INTO `cirrus_connection_settings` VALUES ('THKS', 'https://stg-gk-share-thai-api.kinto-mobility.jp/booking/v2/app/bookings/upcoming', 'https://stg-gk-share-thai-api.kinto-mobility.jp/booking/v2/app/bookings/history', 'https://inte-gk-userpool-th.kinto-mobility.com/oauth2/token/introspect', 'gka', '06ff3bf1-a8e4-4f5b-949f-753e721d23a3', 20000);
INSERT INTO `cirrus_connection_settings` VALUES ('THKG', 'https://stg-gk-share-thai-api.kinto-mobility.jp/booking/v2/app/bookings/upcoming', 'https://stg-gk-share-thai-api.kinto-mobility.jp/booking/v2/app/bookings/history', 'https://inte-gk-userpool-th.kinto-mobility.com/oauth2/token/introspect', 'gka', '06ff3bf1-a8e4-4f5b-949f-753e721d23a3', 20000);
INSERT INTO `cirrus_connection_settings` VALUES ('QAKR', 'https://dev-gk-rent-qa-gateway.kinto-mobility.com/booking/v1/app/bookings/upcoming', 'https://dev-gk-rent-qa-gateway.kinto-mobility.com/booking/v1/app/bookings/history', 'https://inte-gk-userpool-th.kinto-mobility.com/oauth2/token/introspect', 'gka', 'da252169-a352-11ec-8e26-0242ac140002', 20000);
COMMIT;
