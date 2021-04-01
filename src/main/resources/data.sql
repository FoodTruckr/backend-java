DELETE
FROM cuisinetypes;

DELETE
FROM customerreviews;

DELETE
FROM menuitems;

DELETE
FROM trucks;

DELETE
FROM users;


alter sequence hibernate_sequence restart with 15;