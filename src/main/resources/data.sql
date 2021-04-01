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
INSERT INTO cuisinetypes (cuisinetypeid, cuisinetypename, user)
VALUES (1, 'American', 1),
       (2, 'Mexican', 1),
       (3, 'Tex-Mex', 2);
INSERT INTO customerreviews (customerreviewid, rating, customerreview, user, truck)
VALUES (1, 5, 'Best Food truck ever!', 2, 1),
       (2, 1, 'Worst Food truck ever!', 2, 2);
INSERT INTO menuitems (menuitemid, itemname, itemdescription, price, user, menuitemphotourl)
VALUES (1, 'taco', 'meat inside of a tortilla', 2.50, 2, null),
       (2, 'carne asada fries', 'fries topped with carne asada meat, cheese, and sour cream', 10.50, 2, null);
INSERT INTO trucks (truckid, truckname, latitude, longitude, address, city, state, zipcode, arrivaldate, arrivaltime, departuredate, departuretime, truckphotourl, user)
VALUES (1, 'Mother Trucker', 0, 0,'N/A', 'Gotham', 'NY', 89115, null, null, null, null, 'https://i2.wp.com/gimmedelicious.com/wp-content/uploads/2015/10/fajita-inspired-wraps-35-of-50.jpg', 1)
    (2, 'Straight DooDoo Butter', 0, 0 'N/A', 'Las Vegas', 'NV', 89112, null, null, null, null, null, 1);
INSERT INTO users (userid, role, username, password, email)
VALUES (1, 'operator', 'Batman', 'batman123'),
       (2, 'customer', 'Robin', 'robin123');
INSERT INTO truckmenus
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 1),
       (2, 3);
INSERT INTO favoritetrucks
VALUES (2, 1),
       (2, 2);
INSERT INTO truckcuisines
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 3);
/*
We must tell hibernate the ids that have already been used.
The number must be larger than the last used id.
15 > 11 so we are good!
 */
alter sequence hibernate_sequence restart with 15;

alter sequence hibernate_sequence restart with 15;