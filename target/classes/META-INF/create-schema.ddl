
    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address

    create table Address (
       id  bigserial not null,
        addr varchar(255),
        city varchar(255),
        country varchar(255),
        zipcode varchar(255),
        primary key (id)
    )

    create table Order (
       id  bigserial not null,
        dateCreated date,
        dateDelivered date,
        datePaid date,
        product_id int8,
        user_id int8,
        primary key (id)
    )

    create table Product (
       id  bigserial not null,
        category varchar(255),
        description varchar(255),
        name varchar(255),
        price float8 not null,
        primary key (id)
    )

    create table Users (
       id  bigserial not null,
        dateOfBirth date,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        address_id int8,
        primary key (id)
    )

    alter table Order 
       add constraint FK8dquaw3gtlffkd4ryjatyv642 
       foreign key (product_id) 
       references Product

    alter table Order 
       add constraint FKdes8bfcjklhn133kg8j7psh5 
       foreign key (user_id) 
       references Users

    alter table Users 
       add constraint FK7mptsyws7hkjskcidur7n7ah0 
       foreign key (address_id) 
       references Address
