CREATE TABLE users (
    id INT NOT NULL PRIMARY KEY,
    name CHAR NOT NULL
);
CREATE TABLE matches (
    id INT NOT NULL PRIMARY KEY,
    user_1 INT NOT NULL,
    user_2 INT NOT NULL,
    user_1_hand CHAR NOT NULL,
    user_2_hand CHAR NOT NULL
);
