-- создаем базу данных
CREATE DATABASE jaegers;

-- подключаемся к базе данных
\c jaegers;

-- создаем таблицу
CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(6),
    height    REAL,
    weight    REAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);