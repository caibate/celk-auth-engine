DROP TABLE IF EXISTS celk.user;
CREATE TABLE `celk`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  `password` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`id`));
