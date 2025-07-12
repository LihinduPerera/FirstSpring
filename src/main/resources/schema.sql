CREATE TABLE IF NOT EXISTS Run (
    id INT NOT NULL,
    title varchar(255) NOT NULL,
    startedOn TIMESTAMP NOT NULL,
    completedOn TIMESTAMP NOT NULL,
    miles INT NOT NULL,
    location varchar(255) NOT NULL,
    PRIMARY KEY (id)
);