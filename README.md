# HibernateTrainingProject
Hiberante app with postgres

Basic CRUD applicaton, with postgresql. You can create, read, update delete users and their cars.
Users have One-to-many relation to cars, cars cannot exist in database without having an owner, if you delete user - his cars also will disappear.
Used docker-copmpose.yaml to create docker container with postgres base with defined local volume. So if you kill container and then create new container - DB will persist.
