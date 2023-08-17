-- liquibase formatted sql
-- changeset klikli19:1
CREATE TABLE categories
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(30)
);

CREATE TABLE feeds
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    title        TEXT NOT NULL,
    content      TEXT NOT NULL,
    created_feed TIMESTAMP,
    category_id  BIGINT REFERENCES categories (id)
);