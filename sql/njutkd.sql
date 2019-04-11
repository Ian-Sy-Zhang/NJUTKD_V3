DROP TABLE IF EXISTS `movie`;

CREATE TABLE `njutkd`.`2019_3` (
  `id` VARCHAR(9) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `trainingTimes` INT NULL,
  `trainingDate` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
ALTER TABLE `njutkd`.`2019_3`
ADD COLUMN `password` VARCHAR(45) NOT NULL DEFAULT '123456' AFTER `trainingDate`;
