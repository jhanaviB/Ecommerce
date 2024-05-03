# Acheter: Ecommerce app using Microservices, Spring Boot, Spring Cloud, Key Cloak, Grafana, Prometheus and Swagger for documentation.

**i) Order service :** 
**ii) Inventory service:** 
**ii) Product service:** 

The Order and Inventory sevices are connected to seperate mysql instances running in docker containers.
The product service is connected to a MongoDB instance.

For mocking API calls WireMockito is used. Spring Cloud Gateway MVC is added to add a gateway to the api call for all the products.

Spring Cloud OpenFeign is used as a fake client to communicate between the order and inventory service to check if the item to be ordered is in stock.


