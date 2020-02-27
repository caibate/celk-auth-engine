CREATE TABLE `celk`.`role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `role_to_user_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `role_to_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `celk`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
