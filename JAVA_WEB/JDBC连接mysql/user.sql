CREATE TABLE user (
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(10),
password  VARCHAR(10)
);


-- 添加数据
INSERT INTO user (username, password) VALUES ('admin', 'admin'), ('web', 'web');