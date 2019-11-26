# Microservice-Guide-1

Kanban-Dashboard-Service: http://localhost:8084/dashboard/api/{empId}
Kanban-Employee-Service: http://localhost:8082/employee/api/{empId}
Kanban-Backend-Service: http://localhost:8083/kanban/api/{empId}

##DB
kanban-Backend-Service: http://localhost:8083/h2-console
Kanban-Employee-Service: http://localhost:8082/h2-console

##Swagger Endpoints:
Kanban-Dashboard-Service: http://localhost:8084/swagger-ui.html
Kanban-Employee-Service: http://localhost:8082/swagger-ui.html
Kanban-Backend-Service: http://localhost:8083/swagger-ui.html

##Eureka Server:
Kanban-Eureka-Server: http://localhost:8761/

The Logic behind is Dashboard Service is a frontend service which will recieve the call and using the RestTemplate will call other services.

PLease import the project and start all services firt and then in last start the Eureka Server.
