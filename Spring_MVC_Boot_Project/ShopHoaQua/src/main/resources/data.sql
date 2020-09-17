SET FOREIGN_KEY_CHECKS=0;
REPLACE INTO user (active, email, last_name, name, password, user_id) values (1, 'admin@gmail.com', 'Admin', 'Admin', '$2a$10$OOwCeva9HMW3lj.WiFVvk.8bJnb7O7LDhbxWZERhAuanhvigsfipS', 1);
REPLACE INTO user (active, email, last_name, name, password, user_id) values (1, 'member@gmail.com', 'Member', 'Member', '$2a$10$bxHzLm66HE7nXbQbRgMGouBA9N4iBgea2/6n8ZwEt/z/UjD1737ce', 2);
REPLACE INTO role(role_id, role) VALUES (1,'ADMIN');
REPLACE INTO role(role_id, role) VALUES (0,'MEMBER');
REPLACE INTO user_role (user_id, role_id) VALUES (1, 1);
REPLACE INTO user_role (user_id, role_id) VALUES (0, 2);
SET FOREIGN_KEY_CHECKS=1;

/*Login admin/admin*/
/*Login member/member*/
