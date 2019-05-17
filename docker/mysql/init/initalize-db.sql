CREATE DATABASE IF NOT EXISTS `devLiquibase`;

CREATE USER 'devLiquibase'@'%' IDENTIFIED BY 'devLiquibase';

GRANT ALL PRIVILEGES ON `devLiquibase`.* TO 'devLiquibase'@'%';
--    INSERT, SELECT, UPDATE, DELETE ON
