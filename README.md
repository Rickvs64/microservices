# Microservices

Sample application that searches stores for their inventory and available coupon codes.
Made with Spring Boot and Eureka.

Structure:
1. INVENTORY service contains a list of products (with description and price) to search for.
2. STORES service lists every store that has this particular product in stock.
3. PROMOTIONS service manages all currently active coupons for any given store.

Diagram:
https://i.imgur.com/3SzCFUr.png

Technicalities:
* Uses client-side discovery behind the screen.
Personally I find server-side a more logical (and safer) approach, thus having the server act as an actual gateway rather than just an address book.
* Eureka has basic load balancing built-in. Zuul would be a good addition/alternative for larger scale optimization.
* The inventory service connects to the store service which then connects to the promotions service. Any services that cannot be connected to (excluding the required inventory service) will simply result in an empty data list.
* Payara Micro (different from default Payara) also offers microservice functionality but doesn't support JMS or EJB. Eureka is also a more popular choice for managing microservices.
* It would be possible to introduce basic authentication but users have reported issues with my current Spring Cloud version: Greenwich.SR1 (https://stackoverflow.com/questions/50971891/how-to-secure-spring-cloud-eureka-service-with-basic-auth).

Scaling:
Eureka features basic client-side load balancing out of the box. Right now this application expects only one Eureka instance; multiple clusters can be used later down the line.
