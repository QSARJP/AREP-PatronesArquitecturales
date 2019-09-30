

-- Table: Person
CREATE TABLE Person (
    email varchar(80)  NOT NULL,
    name varchar(50)  NULL,
    password varchar(150)  NULL,
    CONSTRAINT Person_pk PRIMARY KEY (email)
);

-- Table: User
CREATE TABLE "User" (
    Person_email varchar(80)  NOT NULL,
    CONSTRAINT User_pk PRIMARY KEY (Person_email)
);


-- Reference: User_Person (table: User)
ALTER TABLE "User" ADD CONSTRAINT User_Person
    FOREIGN KEY (Person_email)
    REFERENCES Person (email)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;
