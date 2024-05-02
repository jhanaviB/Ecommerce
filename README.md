# Acheter: Ecommerce app using Microservices, Spring Boot, Spring Cloud, Key Cloak, Grafana and Prometheus.

**i) Order service :** 
Order service with mysql running in a docker container and migration for sql queries done using Flyway.

**ii) Inventory service:** 
Inventory service with mysql running in a docker container and migration for sql queries done using Flyway.

Spring Cloud OpenFeign is used to communicate between the order and inventory services to check if the item to be ordered is in stock or not.

Custom Runtime Exception when item quantity in stock doesn't exceed or equal quantity wanting to be ordered.
![alt text](https://github.com/jhanaviB/Acheter/blob/main/picture1.PNG?raw=true)

